package com.capgemini.fooddeliveryapplication.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart_detail")
public class Cart {

	private List<Item> items = new ArrayList<Item>();

	@Id
	private String email;
	private int totalAmount;

	public Cart() {
		super();
	}

	public Cart(List<Item> items, String email, int totalAmount) {
		super();
		this.items = items;
		this.email = email;
		this.totalAmount = totalAmount;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Cart [items=" + items + ", email=" + email + ", totalAmount=" + totalAmount + "]";
	}

}
