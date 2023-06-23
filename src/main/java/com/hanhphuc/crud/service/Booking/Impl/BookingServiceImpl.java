package com.hanhphuc.crud.service.Booking.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanhphuc.crud.entity.Account;
import com.hanhphuc.crud.entity.Booking;
import com.hanhphuc.crud.entity.Session;
import com.hanhphuc.crud.entity.Times;
import com.hanhphuc.crud.model.Booking.dto.BookingDTO;
import com.hanhphuc.crud.repository.AccountRepository;
import com.hanhphuc.crud.repository.BookingRepository;
import com.hanhphuc.crud.repository.SessionRepository;
import com.hanhphuc.crud.repository.TimeRepository;
import com.hanhphuc.crud.service.Booking.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

   @Autowired
   BookingRepository bookingRepository;
   @Autowired
   TimeRepository timeRepository;
   @Autowired
   AccountRepository accountRepository;
   @Autowired
   SessionRepository sessionRepository;

   @Override
   public List<BookingDTO> getAllBooking(int id) {
      List<BookingDTO> bookingDTOs = new ArrayList<>();
      List<Booking> bookings = bookingRepository.findAllByMenteeId(id);
      for (Booking booking : bookings) {

         bookingDTOs.add(findEmailAndUsernameByBookingID(booking.getBooking_id()));

      }

      return bookingDTOs;
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
   public BookingDTO findEmailAndUsernameByBookingID(int id) {
      Booking booking = bookingRepository.findById(id).get();
      Times time = timeRepository.findById(booking.getTime_id()).get();
      Session session = sessionRepository.findById(time.getSession_id()).get();
      Account account = accountRepository.findById(session.getMentor_id()).get();

      BookingDTO bookingDTO = new BookingDTO();
      bookingDTO.setUsername(account.getUsername());
      bookingDTO.setEmail(account.getEmail());
      bookingDTO.setScheduleDate(time.getStart_date());
      bookingDTO.setScheduleTime(time.getStart_time().toString() + "-" + time.getEnd_time().toString());
      return bookingDTO;
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
