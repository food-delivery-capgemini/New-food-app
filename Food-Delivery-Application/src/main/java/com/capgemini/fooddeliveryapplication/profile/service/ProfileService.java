package com.capgemini.fooddeliveryapplication.profile.service;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.capgemini.fooddeliveryapplication.entity.Cart;



public interface ProfileService {

	public void findById(long id);

	public List<Cart> findOrderHistory(String email);
	public Cart findOrderDish(int orderId);
}
