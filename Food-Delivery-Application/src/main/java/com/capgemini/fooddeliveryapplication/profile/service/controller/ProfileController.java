package com.capgemini.fooddeliveryapplication.profile.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.fooddeliveryapplication.entity.Cart;
import com.capgemini.fooddeliveryapplication.entity.Feedback;
import com.capgemini.fooddeliveryapplication.profile.dao.ProfileDao;
import com.capgemini.fooddeliveryapplication.profile.service.FeedbackService;
import com.capgemini.fooddeliveryapplication.profile.service.ProfileService;


@CrossOrigin("*")
@RestController
public class ProfileController {

	@Autowired
	private ProfileService service;
	
	@Autowired
	private FeedbackService  feedbackService;
	
	@Autowired
	private ProfileDao dao;
	
	private String orderDish;
	
	private List<Cart> details;
	
	@GetMapping("/profile/{email}")
	public List<Cart> getOrderHistory(@PathVariable String email)
	{
		System.out.println(email);
		details=service.findOrderHistory(email);
		System.out.println(details);
		
		return details;
	}
	
	@PostMapping("/profile")
	public Cart addprofileDetails(@RequestBody Cart details) {
		
		return dao.save(details);
	}
	
	
	@PostMapping("/feedback")
	public Feedback getFeedback(@RequestBody Feedback feedback) {
	
		return feedbackService.addFeedback(feedback)  ;
		
	}
	
//	@GetMapping("/{dish}")
//	public ProfileDetails getDish(@PathVariable String dish)
//	{
//		ProfileDetails details2=service.findOrderDish(dish);
//		
//		for(ProfileDetails order:details) {
//			
//			if(order.getEmail().equals(details2.getEmail())) {
//				
//				orderDish=details2.getDish();
//			}
//			
//		}
//		return orderDish;
//	}
	
	@GetMapping("/{orderId}")
	public Cart getDish(@PathVariable int orderId)
	{
		return service.findOrderDish(orderId);
	
	}
	
	
}
