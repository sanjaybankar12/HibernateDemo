package com.spring.HibernateTestDemo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="veh_tab")
public class Vehicle {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name="ID",unique=true)
	private int id;
	@Column(name="NAME",nullable=true)
	private String name;
	
	@ManyToOne()
	@JoinColumn(name="USER_ID")
	private User user;	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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

