package com.eventmanagement.EventManagement.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.eventmanagement.EventManagement.DTO.LoginRequest;
import com.eventmanagement.EventManagement.Entity.Booking;
import com.eventmanagement.EventManagement.Entity.User;
import com.eventmanagement.EventManagement.Service.UserService;

import java.util.List;
 
@RestController
@RequestMapping("/api/users")
public class UserController {
 
	@Autowired
	private UserService userService;
 
	//  Register a new user
    @PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
    	User createdUser = userService.registerUser(user);
    	return ResponseEntity.ok(createdUser);
	}
 
	//  Login a user
    @PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
    	boolean isAuthenticated = userService.authenticateUser(loginRequest.getEmail(), loginRequest.getPassword());
    	if (isAuthenticated) {
            return ResponseEntity.ok("Login successful");
    	} else {
            return ResponseEntity.status(402).body("Invalid credentials");
    	}
	}
 
	//  Get user details by ID
    @GetMapping("/{userId}")
	public ResponseEntity<User> getUserDetails(@PathVariable Long userId) {
    	User user = userService.getUserById(userId);
    	return ResponseEntity.ok(user);
	}
 
	//  Get bookings for a user
    @GetMapping("/{userId}/bookings")
	public ResponseEntity<List<Booking>> getUserBookings(@PathVariable Long userId) {
        List<Booking> bookings = userService.getUserBookings(userId);
    	return ResponseEntity.ok(bookings);
	}
 
	//  Delete a user
    @DeleteMapping("/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    	return ResponseEntity.ok("User deleted successfully");
	}
}

