package com.hanhphuc.crud.model.account.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTOLoginRequest {
    private String email;
    private String password;
}
