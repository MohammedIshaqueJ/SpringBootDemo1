package com.deloitte.customer.ms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customers {

	@Id
	@GeneratedValue
	private Integer cid;
	private String cname;
	private String city;
	
		
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customers(Integer cid, String cname, String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
	}
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
}
