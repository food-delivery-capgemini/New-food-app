package com.capgemini.userdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.userdata.counterservice.CounterService;
import com.capgemini.userdata.dao.UserDao;
import com.capgemini.userdata.entity.Address;
import com.capgemini.userdata.entity.Users;
import com.capgemini.userdata.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	@Autowired
	private CounterService counterService;
	
	@Override
	public Users addAllDetails(Users user) {
//		Users user1 = new Users();
//		user1.setId(counterService.getNextSequence("users");

		return dao.save(user) ;
	}

	@Override
	public Users loginUser(String email, String password) {

		Users user=(dao.findByEmail(email));
		
		if((user.getPassword()).equals(password))
		{
			return user;
		}
		
		return null;
	}

	@Override
	public Users getByEmail(String email) {
		
		Users user=(dao.findByEmail(email));
		
		
		
		return dao.findByEmail(email);
	}

	@Override
	public Users addAddress(Users user) {
		return dao.save(user);
	}

	

	
	

}
