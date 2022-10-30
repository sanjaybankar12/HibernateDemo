package com.spring.HibernateTestDemo;

import java.util.HashMap;
import java.util.Map;

public class Movie {

	private int id;
	private String name;
	private Map<String,String> hm = new HashMap<>();
	
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
	public Map<String, String> getHm() {
		return hm;
	}
	public void setHm(Map<String, String> hm) {
		this.hm = hm;
	}	
	
}
