package com.hanhphuc.crud.model.Booking.mapper;

import com.hanhphuc.crud.model.Booking.dto.BookingDTO;

public class BookingMapper {

    public static BookingDTO toBookingDTO(BookingDTO book1) {
        return BookingDTO.builder().username(book1.getUsername()).email(book1.getEmail())
                .scheduleDate(book1.getScheduleDate())
                .scheduleTime(book1.getScheduleTime())
                .build();
    }
}
