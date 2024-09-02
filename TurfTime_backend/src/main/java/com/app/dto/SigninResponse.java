package com.app.dto;

import com.app.entities.UserEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SigninResponse {
	
	private String jwt;
	private String mesg;
	private UserEntity user;
	
	public SigninResponse(String jwt, String mesg, UserEntity user) {
		super();
		this.jwt = jwt;
		this.mesg = mesg;
		this.user = user;
	}
	
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public String getMesg() {
		return mesg;
	}
	public void setMesg(String mesg) {
		this.mesg = mesg;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	} 
	
	
}
