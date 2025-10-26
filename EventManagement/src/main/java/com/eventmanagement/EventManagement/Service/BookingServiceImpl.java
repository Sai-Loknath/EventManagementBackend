package com.eventmanagement.EventManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eventmanagement.EventManagement.Entity.Booking;

@Service
public class BookingServiceImpl implements BookingService {

	@Override
	public Booking createBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelBooking(Long bookingId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Booking> getBookingsByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getBookingsByEventId(Long eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAvailableTickets(Long eventId, int ticketsBooked) {
		// TODO Auto-generated method stub

	}

}
