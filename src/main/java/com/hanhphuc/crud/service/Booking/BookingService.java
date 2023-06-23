package com.hanhphuc.crud.service.Booking;

import java.util.List;

import com.hanhphuc.crud.entity.Booking;
import com.hanhphuc.crud.model.Booking.dto.BookingDTO;

public interface BookingService {

    List<BookingDTO> getAllBooking(int id);

    // void addBooking(Booking booking);

    Booking findBookingByID(int id);

    BookingDTO findEmailAndUsernameByBookingID(int id);
    // void deleteBookingByID(int id);

    // void saveBooking(Booking r);

}
