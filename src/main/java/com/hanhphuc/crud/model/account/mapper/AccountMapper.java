package com.hanhphuc.crud.model.account.mapper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.hanhphuc.crud.entity.Account;
import com.hanhphuc.crud.model.account.dto.AccountDTOCreate;
import com.hanhphuc.crud.model.account.dto.AccountDTOResponse;

public class AccountMapper {
    public static AccountDTOResponse toAccountDTOResponse(Account account) {
        return AccountDTOResponse.builder().role(account.getRole()).build();
    }

    public static Account toUser(AccountDTOCreate accountDTOCreate) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        java.util.Date currentDate = calendar.getTime();
        String formattedDate = dateFormat.format(currentDate);

        java.sql.Date sqlDate;
        try {
            java.util.Date parsedDate = dateFormat.parse(formattedDate);
            sqlDate = new java.sql.Date(parsedDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            // Handle parsing error
            return null; // or throw an exception
        }

        return Account.builder().username(accountDTOCreate.getUsername())
                .email(accountDTOCreate.getEmail())
                .password(accountDTOCreate.getPassword())
                .created_date(sqlDate).role(accountDTOCreate.getRole()).build();
    }
}
