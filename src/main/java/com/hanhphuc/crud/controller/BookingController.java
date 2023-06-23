package com.hanhphuc.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hanhphuc.crud.entity.Booking;
import com.hanhphuc.crud.model.Booking.dto.BookingDTO;
import com.hanhphuc.crud.model.Booking.dto.BookingRequestDTO;
import com.hanhphuc.crud.service.Booking.BookingService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping("/bookings")
    List<BookingDTO> getBookingList(@RequestBody BookingRequestDTO book) {
        return bookingService.getAllBooking(book.getId());
    }

    // @PostMapping("/booking")
    // void addBooking(@RequestBody Booking booking) {
    // bookingService.addBooking(booking);
    // }

    @GetMapping("/booking/{id}")
    Booking getBookingById(@PathVariable int id) {
        return bookingService.findBookingByID(id);
    }

    // @PutMapping("/booking/{id}")
    // void updateBooking(@PathVariable int id, @RequestBody Booking booking) {
    // Booking r = bookingService.findBookingByID(id);
    // r.setMentee_id(booking.getMentee_id());
    // r.setTime_id(booking.getTime_id());
    // r.setStatus(booking.getStatus());

    // bookingService.saveBooking(r);
    // }

    // @DeleteMapping("/booking/{id}")
    // void deleteBooking(@PathVariable int id) {
    // bookingService.deleteBookingByID(id);
    // }
}
