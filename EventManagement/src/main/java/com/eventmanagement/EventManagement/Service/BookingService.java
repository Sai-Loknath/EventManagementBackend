package com.eventmanagement.EventManagement.Service;

import java.util.List;

import com.eventmanagement.EventManagement.Entity.Booking;

public interface BookingService {

    Booking createBooking(Booking booking);

    void cancelBooking(Long bookingId);

    List<Booking> getBookingsByUserId(Long userId);

    List<Booking> getBookingsByEventId(Long eventId);

    void updateAvailableTickets(Long eventId, int ticketsBooked);
}
