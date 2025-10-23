package com.eventmanagement.EventManagement.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
 
@Entity
@Table(name = "Bookings")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Booking {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
 
	@ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
	private Event event;
 
	@ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
	private User user;
 
	private int numberOfSeats;
 
	private LocalDateTime datetimeOfBooking;
}

