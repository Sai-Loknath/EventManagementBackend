package com.eventmanagement.EventManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmanagement.EventManagement.Entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	//
}

