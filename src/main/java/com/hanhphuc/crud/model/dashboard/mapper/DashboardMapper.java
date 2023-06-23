package com.hanhphuc.crud.model.dashboard.mapper;

import com.hanhphuc.crud.model.dashboard.dto.DashboardDTO;

public class DashboardMapper {

    public static DashboardDTO toBookingDTO(DashboardDTO book1) {
        return DashboardDTO.builder().username(book1.getUsername()).email(book1.getEmail())
                .created_Date(book1.getCreated_Date())
                .build();
    }
}
