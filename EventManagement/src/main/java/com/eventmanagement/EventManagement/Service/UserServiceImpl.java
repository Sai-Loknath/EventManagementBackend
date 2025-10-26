package com.eventmanagement.EventManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.eventmanagement.EventManagement.Entity.Booking;
import com.eventmanagement.EventManagement.Entity.Role;
import com.eventmanagement.EventManagement.Entity.User;
import com.eventmanagement.EventManagement.Exception.UserAlreadyExistsException;
import com.eventmanagement.EventManagement.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	 @Autowired
	 private UserRepository userRepository;
	 
	 @Autowired
	 private PasswordEncoder passwordEncoder;

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		  if (userRepository.findByEmail(user.getEmail()).isPresent()) {
	            throw new UserAlreadyExistsException("Email already registered");
	        }
		  		  
		  user.setPassword(passwordEncoder.encode(user.getPassword()));

	        // Assign default role if not set
	        if (user.getRole() == null) {
	            user.setRole(Role.USER);
	        }

	        // Save user
	        User savedUser = userRepository.save(user);
	        savedUser.setPassword(null); 
	        return savedUser;

	}

	@Override
	public boolean authenticateUser(String email,String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getUserBookings(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
