package com.hanhphuc.crud.utils;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hanhphuc.crud.entity.Account;
import com.hanhphuc.crud.model.TokenPayload;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenUtil {
    private String secret = "Thang";

    public String generateToken(Account account, long expiredDate) {
        Map<String, Object> claims = new HashMap<>();

        TokenPayload tokenPayload = TokenPayload.builder().account_id(account.getAccount_id()).role(account.getRole())
                .build();
        claims.put("payload", tokenPayload);
        return Jwts.builder().setClaims(claims).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiredDate * 1000))
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }
}
