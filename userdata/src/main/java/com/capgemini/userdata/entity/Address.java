package com.capgemini.userdata.entity;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Address {
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	private Users user;
	
	private String addressLine;
	private String city;
	private String state;
	private int postalCode;
	
	
//	
//	public Users getUser() {
//		return user;
//	}
//	public void setUser(Users user) {
//		this.user = user;
//	}
	
	
	
	public Address(String addressLine, String city, String state, int postalCode) {
	super();
	this.addressLine = addressLine;
	this.city = city;
	this.state = state;
	this.postalCode = postalCode;
}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + "]";
	}
	
	
}
