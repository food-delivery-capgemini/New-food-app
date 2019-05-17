package com.capgemini.fooddeliveryapplication.profile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.Counter;

import com.capgemini.fooddeliveryapplication.entity.Cart;
import com.capgemini.fooddeliveryapplication.profile.dao.CounterDao;
import com.capgemini.fooddeliveryapplication.profile.dao.ProfileDao;
import com.capgemini.fooddeliveryapplication.profile.service.ProfileService;


@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileDao dao;
	
	
	@Autowired
	private CounterDao dao2;
	
	@Override
	public List<Cart> findOrderHistory(String email) {
		// TODO Auto-generated method stub
		return dao.findAllByEmail(email);
	}
//
//	@Override
//	public Cart findOrderDish(int orderId) {
//		// TODO Auto-generated method stub
//		return dao.findByOrderId(orderId);
//	}

	@Override
	public void findById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cart findOrderDish(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void findById(long id) {
//		// TODO Auto-generated method stub
//		 Cart order=new Cart();
//	Counter counter=	dao2.findById(id).get();
//		order.setOrderId(counter.getCount()+1);
//		counter.setCount(counter.getCount()+1);
//		
//		dao.save(order);
//		dao2.save(counter);
//	}
//	


	

//	@Override
//	public ProfileDetails findOrderDish(int orderId) {
//		// TODO Auto-generated method stub
//		return dao.findByDish(orderId);
//	}

	
	

	
	

	
	
}
