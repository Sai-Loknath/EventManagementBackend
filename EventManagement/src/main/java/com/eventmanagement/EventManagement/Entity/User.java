package com.eventmanagement.EventManagement.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
 
@Entity
@Table(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

