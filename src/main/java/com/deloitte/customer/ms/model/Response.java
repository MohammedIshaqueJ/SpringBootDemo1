package com.deloitte.customer.ms.model;

import java.util.List;

import com.deloitte.customer.ms.entity.Customers;

public class Response {
	
	private Customers customer;
	private List<Order> orders;
	private List<Order> orders1;

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(Customers customer, List<Order> orders, List<Order> orders1) {
		super();
		this.customer = customer;
		this.orders = orders;
		this.orders1 = orders1;
	}

	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public List<Order> getOrders1() {
		return orders1;
	}
	public void setOrders1(List<Order> orders1) {
		this.orders1 = orders1;
	}
}
