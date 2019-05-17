package com.capgemini.profile.service;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.capgemini.profile.entity.Counter;
import com.capgemini.profile.entity.ProfileDetails;


public interface ProfileService {

	public void findById(long id);

	public List<ProfileDetails> findOrderHistory(String email);
	public ProfileDetails findOrderDish(int orderId);
}
