package com.capgemini.profile.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Feedback {

	private int orderId;
	private int rating;
	private String comments;
	private String dish;
	private String email;
	
	
	
	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public String getComments() {
		return comments;
	}



	public void setComments(String comments) {
		this.comments = comments;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}





	public Feedback(int orderId, int rating, String comments, String dish, String email) {
		super();
		this.orderId = orderId;
		this.rating = rating;
		this.comments = comments;
		this.dish = dish;
		this.email = email;
	}



	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
