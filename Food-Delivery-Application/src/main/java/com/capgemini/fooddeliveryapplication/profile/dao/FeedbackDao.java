package com.capgemini.fooddeliveryapplication.profile.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.fooddeliveryapplication.entity.Feedback;


public interface FeedbackDao extends MongoRepository<Feedback, Integer>{

}
