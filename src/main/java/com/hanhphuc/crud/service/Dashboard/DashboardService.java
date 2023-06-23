package com.hanhphuc.crud.service.Dashboard;

import java.util.List;

import com.hanhphuc.crud.entity.Booking;
import com.hanhphuc.crud.model.dashboard.dto.DashboardDTO;

public interface DashboardService {

    List<DashboardDTO> getAllBooking(int id);

    // void addBooking(Booking booking);

    Booking findBookingByID(int id);

    DashboardDTO findEmailAndUsernameByBookingID(int id);
    // void deleteBookingByID(int id);

    // void saveBooking(Booking r);

}
