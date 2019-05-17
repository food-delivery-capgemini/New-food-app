package com.capgemini.userdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.userdata.entity.Users;
import com.capgemini.userdata.service.UserService;
import com.capgemini.userdata.service.impl.UserServiceImpl;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/users")
	public Users regsiterAllDetails(@RequestBody Users user)
	{
		System.out.println("users"+user);
		Users userData=service.addAllDetails(user);
		
		
		System.out.println("address is"+user.getAddress());
		return userData;
		
	}
	
	
//	@GetMapping("/users/{email}/{password}")
//	public ResponseEntity<Users> loginUser(@PathVariable String email,@PathVariable String password)
//	{
//		
//		Users user= service.loginUser(email, password);
//		
//		return new ResponseEntity<Users>(user,HttpStatus.OK);
//	}
//	
	

	@GetMapping("/users/{email}")
	public ResponseEntity<Users> UserAddress(@PathVariable String email)
	{
		
		Users user= service.getByEmail(email);
		
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	
//	@PostMapping("/address")
//	public Users addAddress(@RequestBody Users user) {
//		service.addAddress(user.getAddress());
//		return null;
//		
//	}
	
	
}
