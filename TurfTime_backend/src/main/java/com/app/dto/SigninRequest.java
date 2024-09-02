package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SigninRequest {
	
//	@NotBlank(message = "Email can't be blank")
	@Email(message = "Invalid email format")
	private String email;
//	@NotBlank
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$", message = "Password must be at least 8 characters long and contain an uppercase letter, a lowercase letter, a digit, and a special character.")
	private String password;
	
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

	
}
