package com.hanhphuc.crud.model.account.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTOResponse {
    private String token;
    private int role;
}
