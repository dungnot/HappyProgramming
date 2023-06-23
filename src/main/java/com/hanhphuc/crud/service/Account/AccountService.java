package com.hanhphuc.crud.service.Account;

import java.util.Map;

import com.hanhphuc.crud.exception.custom.CustomBadRequestException;
import com.hanhphuc.crud.model.account.dto.AccountDTOCreate;
import com.hanhphuc.crud.model.account.dto.AccountDTOLoginRequest;
import com.hanhphuc.crud.model.account.dto.AccountDTOResponse;

public interface AccountService {

    public Map<String, AccountDTOResponse> authenticate(Map<String, AccountDTOLoginRequest> accountLoginRequestMap)
            throws CustomBadRequestException;

    public Map<String, AccountDTOResponse> registerAccount(Map<String, AccountDTOCreate> accountDTOCreateMap);

}
