package com.eventmanagement.EventManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmanagement.EventManagement.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	//
}
