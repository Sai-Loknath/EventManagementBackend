package com.eventmanagement.EventManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmanagement.EventManagement.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	//
	Optional<User> findByEmail(String email);
}
