package com.hanhphuc.crud.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanhphuc.crud.exception.custom.CustomBadRequestException;
import com.hanhphuc.crud.model.account.dto.AccountDTOCreate;
import com.hanhphuc.crud.model.account.dto.AccountDTOLoginRequest;
import com.hanhphuc.crud.model.account.dto.AccountDTOResponse;
import com.hanhphuc.crud.service.Account.AccountService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/users/login")
    public Map<String, AccountDTOResponse> login(
            @RequestBody Map<String, AccountDTOLoginRequest> accountLoginRequestMap) throws CustomBadRequestException {
        return accountService.authenticate(accountLoginRequestMap);
    }

    @PostMapping("/users/register")
    public Map<String, AccountDTOResponse> register(@RequestBody Map<String, AccountDTOCreate> accountDTOCreateMap) {
        return accountService.registerAccount(accountDTOCreateMap);
    }

}
