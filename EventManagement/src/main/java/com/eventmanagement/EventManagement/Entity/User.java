package com.eventmanagement.EventManagement.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
 
@Entity
@Table(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
 
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long userId;
 
	private String userName;
	private String phoneNumber;
 
	
@Column(unique = true, nullable = false)
	private String email;
 
	private String password;
 
    @Enumerated(EnumType.STRING)
	private Role role;
 
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Booking> bookings;
}

