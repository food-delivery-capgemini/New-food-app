package com.capgemini.profile.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.profile.dao.CounterDao;
import com.capgemini.profile.dao.ProfileDao;
import com.capgemini.profile.entity.Counter;
import com.capgemini.profile.entity.ProfileDetails;
import com.capgemini.profile.service.ProfileService;


@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileDao dao;
	
	
	
	
	@Autowired
	private CounterDao dao2;
	
	@Override
	public List<ProfileDetails> findOrderHistory(String email) {
		// TODO Auto-generated method stub
		return dao.findAllByEmail(email);
	}

	@Override
	public ProfileDetails findOrderDish(int orderId) {
		// TODO Auto-generated method stub
		return dao.findByOrderId(orderId);
	}

	@Override
	public void findById(long id) {
		// TODO Auto-generated method stub
		 ProfileDetails order=new ProfileDetails();
	Counter counter=	dao2.findById(id).get();
		order.setOrderId(counter.getCount()+1);
		counter.setCount(counter.getCount()+1);
		
		dao.save(order);
		dao2.save(counter);
	}
	


	

//	@Override
//	public ProfileDetails findOrderDish(int orderId) {
//		// TODO Auto-generated method stub
//		return dao.findByDish(orderId);
//	}

	
	

	
	

	
	
}
