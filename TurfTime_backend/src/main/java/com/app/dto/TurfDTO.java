package com.app.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class TurfDTO {

	@JsonProperty(access = Access.READ_ONLY)
	private Long turfId;
	@NotBlank(message = "Name cannot be empty")
    private String name;
	private String location;
	@JsonIgnore
	private boolean availability=true;
	private String description;
	public Long getTurfId() {
		return turfId;
	}
	public void setTurfId(Long turfId) {
		this.turfId = turfId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
