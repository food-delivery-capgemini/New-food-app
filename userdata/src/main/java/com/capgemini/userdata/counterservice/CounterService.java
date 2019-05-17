package com.capgemini.userdata.counterservice;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
import static org.springframework.data.mongodb.core.query.Query.*;
import static org.springframework.data.mongodb.core.query.Criteria.*;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.*;
import com.capgemini.userdata.counter.Counter;

@Service
public class CounterService {
  @Autowired 
  private MongoOperations mongo;
//  Update update = new Update(null);
//
//  public int getNextSequence(String counters) {
//
//    Counter counter = mongo.findAndModify(
//      query(where("_id").is(counters)), 
//      new Update().inc("seq", 1),
//      options().returnNew(true),
//      Counter.class);
//      
//    return counter.getSeq();
//  }
}