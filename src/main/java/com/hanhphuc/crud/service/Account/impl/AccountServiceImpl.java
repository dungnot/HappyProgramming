package com.hanhphuc.crud.service.Account.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hanhphuc.crud.entity.Account;
import com.hanhphuc.crud.exception.custom.CustomBadRequestException;
import com.hanhphuc.crud.model.CustomError;
import com.hanhphuc.crud.model.account.dto.AccountDTOCreate;
import com.hanhphuc.crud.model.account.dto.AccountDTOLoginRequest;
import com.hanhphuc.crud.model.account.dto.AccountDTOResponse;
import com.hanhphuc.crud.model.account.mapper.AccountMapper;
import com.hanhphuc.crud.repository.AccountRepository;
import com.hanhphuc.crud.service.Account.AccountService;
import com.hanhphuc.crud.utils.JwtTokenUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final JwtTokenUtil jwtTokenUtil;

    @Override
    public Map<String, AccountDTOResponse> authenticate(Map<String, AccountDTOLoginRequest> accountLoginRequestMap)
            throws CustomBadRequestException {
        AccountDTOLoginRequest accountDTOLoginRequest = accountLoginRequestMap.get("account");

        Optional<Account> accountOptional = accountRepository.findByEmail(accountDTOLoginRequest.getEmail());

        boolean isAuthen = false;
        if (accountOptional.isPresent()) {
            Account account = accountOptional.get();
            if (account.getPassword().equals(accountDTOLoginRequest.getPassword())) {
                isAuthen = true;
            }
        }

        if (!isAuthen) {
            throw new CustomBadRequestException(
                    CustomError.builder().code("400").message("Email or password incorrect").build());
        }

        return buildDTOResponse(accountOptional.get());
    }

    @Override
    public Map<String, AccountDTOResponse> registerAccount(Map<String, AccountDTOCreate> accountDTOCreateMap) {
        AccountDTOCreate accountDTOCreate = accountDTOCreateMap.get("account");
        Account account = AccountMapper.toUser(accountDTOCreate);

        account = accountRepository.save(account);
        return buildDTOResponse(account);
    }

    private Map<String, AccountDTOResponse> buildDTOResponse(Account account) {
        Map<String, AccountDTOResponse> wrapper = new HashMap<>();
        AccountDTOResponse accountDTOResponse = AccountMapper.toAccountDTOResponse(account);
        accountDTOResponse.setToken(jwtTokenUtil.generateToken(account, 24 * 60 * 60));
        wrapper.put("account", accountDTOResponse);
        return wrapper;
    }

}
