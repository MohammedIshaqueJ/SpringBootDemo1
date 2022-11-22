package com.deloitte.customer.ms.model;

import com.deloitte.customer.ms.entity.Customers;

public class FailureResponse {

	private Customers customers;
	private String message;
	
	public FailureResponse() {
		super();
	}
	
	public FailureResponse(Customers customers, String message) {
		super();
		this.customers = customers;
		this.message = message;
	}
	
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
}
