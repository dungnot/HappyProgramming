package com.hanhphuc.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hanhphuc.crud.model.dashboard.dto.DashboardDTO;
import com.hanhphuc.crud.model.dashboard.dto.DashboardRequestDTO;
import com.hanhphuc.crud.service.Dashboard.DashboardService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DashboardController {
    @Autowired
    private DashboardService bookingService;

    @PostMapping("/list-mentee")
    List<DashboardDTO> getBookingList(@RequestBody DashboardRequestDTO book) {
        return bookingService.getAllBooking(book.getId());
    }

    // @PostMapping("/booking")
    // void addBooking(@RequestBody Booking booking) {
    // bookingService.addBooking(booking);
    // }

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
