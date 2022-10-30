package com.spring.HibernateTestDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="veh_tab")
public class Vehicle {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="ID",unique=true)
	private int id;
	@Column(name="NAME",nullable=true)
	
	private String name;
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

