package com.hanhphuc.crud.service.Dashboard.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanhphuc.crud.entity.Account;
import com.hanhphuc.crud.entity.Booking;
import com.hanhphuc.crud.entity.Session;
import com.hanhphuc.crud.entity.Times;
import com.hanhphuc.crud.model.dashboard.dto.DashboardDTO;
import com.hanhphuc.crud.repository.AccountRepository;
import com.hanhphuc.crud.repository.BookingRepository;
import com.hanhphuc.crud.repository.SessionRepository;
import com.hanhphuc.crud.repository.TimeRepository;
import com.hanhphuc.crud.service.Dashboard.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService {

   @Autowired
   BookingRepository bookingRepository;
   @Autowired
   TimeRepository timeRepository;
   @Autowired
   AccountRepository accountRepository;
   @Autowired
   SessionRepository sessionRepository;

   @Override
   public List<DashboardDTO> getAllBooking(int id) {
      List<DashboardDTO> dashboardDTOs = new ArrayList<>();
      List<Booking> bookings = bookingRepository.findAllByMenteeId(id);
      for (Booking booking : bookings) {

         dashboardDTOs.add(findEmailAndUsernameByBookingID(booking.getBooking_id()));

      }

      return dashboardDTOs;
   }

   // @Override
   // public void addBooking(Booking booking) {
   // bookingRepository.save(booking);
   // }

   @Override
   public Booking findBookingByID(int id) {

      return bookingRepository.findById(id).get();
   }

   @Override
   public DashboardDTO findEmailAndUsernameByBookingID(int id) {
      Booking booking = bookingRepository.findById(id).get();
      Times time = timeRepository.findById(booking.getTime_id()).get();
      Session session = sessionRepository.findById(time.getSession_id()).get();
      Account account = accountRepository.findById(session.getMentor_id()).get();

      // Lấy scheduleTime từ start_time và end_time

      DashboardDTO dashboardDTO = new DashboardDTO();
      dashboardDTO.setUsername(account.getUsername());
      dashboardDTO.setEmail(account.getEmail());
      dashboardDTO.setCreated_Date(booking.getCreated_date());
      dashboardDTO.setStatus(booking.getStatus());
      return dashboardDTO;
   }

   // @Override
   // public void deleteBookingByID(int id) {
   // bookingRepository.deleteById(id);
   // }

   // @Override
   // public void saveBooking(Booking r) {
   // bookingRepository.save(r);
   // }

}
