package com.capgemini.fooddeliveryapplication.profile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fooddeliveryapplication.entity.Feedback;
import com.capgemini.fooddeliveryapplication.profile.dao.FeedbackDao;
import com.capgemini.fooddeliveryapplication.profile.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired 
	private FeedbackDao dao;
	
	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return dao.save(feedback);
	}

	
	
}
