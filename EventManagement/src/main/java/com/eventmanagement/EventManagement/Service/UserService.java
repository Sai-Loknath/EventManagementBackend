package com.eventmanagement.EventManagement.Service;

import java.util.List;

import com.eventmanagement.EventManagement.Entity.Booking;
import com.eventmanagement.EventManagement.Entity.User;

public interface UserService {
	User registerUser(User user);
	boolean authenticateUser(String email);
	User getUserById(Long userId);
	List<Booking> getUserBookings(Long userId);

}
