package com.capgemini.fooddeliveryapplication.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
	
	private long orderId;
	private String status;
	private Cart cart;
	private String email;
	
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Order(long orderId, String status, Cart cart, String email) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.cart = cart;
		this.email = email;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
