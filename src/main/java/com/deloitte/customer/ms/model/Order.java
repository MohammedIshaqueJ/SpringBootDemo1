package com.deloitte.customer.ms.model;

public class Order {

	private Integer orderId;
	private String name;
	private double cost;
	private Integer cid;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer orderId, String name, double cost, Integer cid) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.cost = cost;
		this.cid = cid;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}	
}
