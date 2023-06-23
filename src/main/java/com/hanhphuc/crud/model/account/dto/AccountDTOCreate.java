package com.hanhphuc.crud.model.account.dto;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTOCreate {
    private String username;
    private String email;
    private String password;
    private Date created_date;
    private int role;
}
