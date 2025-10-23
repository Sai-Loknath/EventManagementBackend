package com.eventmanagement.EventManagement.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;
 
@Entity
@Table(name = "Events")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Event {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eventId;
 
	private String eventName;
	private String eventLocation;
	private LocalDateTime eventDateTime;
	private double eventPrice;
	private int eventTotalTickets;
	private int eventAvailableTickets;
	private String eventOrganizer;
	private String eventDescription;
 
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	private List<Booking> bookings;
}

