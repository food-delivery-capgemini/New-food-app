package com.capgemini.fooddeliveryapplication.profile.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.fooddeliveryapplication.entity.Cart;

@Repository
public interface ProfileDao extends MongoRepository<Cart,Integer> {

	
	public List<Cart> findAllByEmail(String email);

//	public Cart findByOrderId(int dishId);


}
