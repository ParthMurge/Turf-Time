package com.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PaymentResponse {
	
	private String order_id;
	private String key_id;
	private String error;
	
	public PaymentResponse(String order_id, String key_id, String error) {
		super();
		this.order_id = order_id;
		this.key_id = key_id;
		this.error = error;
	}
	
	

}
