package com.eventmanagement.EventManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmanagement.EventManagement.Entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	//
}

