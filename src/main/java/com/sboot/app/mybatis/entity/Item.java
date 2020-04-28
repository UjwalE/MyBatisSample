package com.sboot.app.mybatis.entity;

public class Item {
	
	int id;
	String name;
	
	public Item() {
		
	}
	
	
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
		
}
