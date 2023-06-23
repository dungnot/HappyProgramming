package com.hanhphuc.crud.model.dashboard.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DashboardDTO {
    private String username;
    private String email;
    private Date created_Date;
    private int status;
}
