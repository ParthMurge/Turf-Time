package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "secure_users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password") // toString excluding password
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(length = 20)
	private String name;
	
	@Column( unique=true,nullable=false)
	private String email;
	
	@Column(length = 300, nullable = false)
	private String password;
	
	private String phoneNo;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private UserRole role;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	@JsonIgnore
    private List<Booking> bookings=  new ArrayList<Booking>();
	
	
	@CreationTimestamp
	private LocalDate regDate;


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public UserRole getRole() {
		return role;
	}


	public void setRole(UserRole role) {
		this.role = role;
	}


	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}


	public LocalDate getRegDate() {
		return regDate;
	}


	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	
	
}
