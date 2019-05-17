package com.capgemini.profile.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="countertable")
public class Counter {

	@Id
	private int cid;
	private int count;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	public Counter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Counter(int cid, int count) {
		super();
		this.cid = cid;
		this.count = count;
	}
	
	
	
}
