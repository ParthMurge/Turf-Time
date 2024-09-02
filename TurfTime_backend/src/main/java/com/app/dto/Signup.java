package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.app.entities.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Signup {
	@JsonProperty(access = Access.READ_ONLY) // this property only used during ser.
	private Long id;
	@NotBlank(message = "Name required")
	private String name;
	@NotEmpty(message = "Email cannot be empty")
	@Email(message = "Invalid Email!!!")
	private String email;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@NotEmpty(message = "Password cannot be empty")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$", message = "Password must be at least 8 characters long and contain an uppercase letter, a lowercase letter, a digit, and a special character.")
	private String password;

	
	@NotEmpty(message = "Contact cannot be empty")
	private String phoneNo;
	
	@JsonProperty(access = Access.READ_ONLY)
	private UserRole role;
	
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDate regDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	
	
	
	
}
