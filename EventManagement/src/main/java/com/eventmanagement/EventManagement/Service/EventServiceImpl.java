package com.eventmanagement.EventManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eventmanagement.EventManagement.Entity.Booking;
import com.eventmanagement.EventManagement.Entity.Event;

@Service
public class EventServiceImpl implements EventService {

	@Override
	public Event saveEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEvent(Long eventId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Event getEventById(Long eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getBookingsByEventId(Long eventId) {
		// TODO Auto-generated method stub
		return null;
	}

}
