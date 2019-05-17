package com.capgemini.fooddeliveryapplication.profile.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.fooddeliveryapplication.entity.Counter;


@Repository
public interface CounterDao extends MongoRepository<Counter, Long>{

}
