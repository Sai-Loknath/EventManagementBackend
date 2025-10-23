package com.eventmanagement.EventManagement.Service;

import java.util.List;

import com.eventmanagement.EventManagement.Entity.Booking;
import com.eventmanagement.EventManagement.Entity.Event;

public interface EventService {
	Event saveEvent(Event event);          
    void deleteEvent(Long eventId);        
    Event getEventById(Long eventId);      
    List<Event> getAllEvents();            
    List<Booking> getBookingsByEventId(Long eventId); 
}
