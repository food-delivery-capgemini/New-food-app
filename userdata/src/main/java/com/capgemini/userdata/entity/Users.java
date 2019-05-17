package com.capgemini.userdata.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Document
public class Users {

//	@Id
	private long userId;
	
	 private int seq;


	
	@Column(name="name")
	private String name;
	
//    @Indexed(unique = true)
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="contact")
	private long contact;
	
	@Column(name="date")
	private Date date;
	
//	@JsonProperty("users")
	private Address address;
	
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}




	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public Users(long userId, int seq, String name, String email, String password, long contact, Date date,
		Address address) {
		super();
		this.userId = userId;
		this.seq = seq;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.date = date;
		this.address = address;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	 @Override
//	    public String toString() {
//	      ObjectMapper mapper = new ObjectMapper();
//	      
//	      String jsonString = "";
//	    try {
//	      mapper.enable(SerializationFeature.INDENT_OUTPUT);
//	      jsonString = mapper.writeValueAsString(this);
//	    } catch (JsonProcessingException e) {
//	      e.printStackTrace();
//	    }
//	    
//	      return jsonString;
//	    }
	

}
