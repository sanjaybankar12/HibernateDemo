package com.spring.HibernateTestDemo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_tab")
public class User {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="ID",unique=true)
	private int id;
	@Column(name="NAME",nullable=true)
	private String name;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="user_veh_tab",joinColumns = @JoinColumn(name="U_ID"),inverseJoinColumns = @JoinColumn(name="V_ID"))
	private List<Vehicle> vehicles;	
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
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
