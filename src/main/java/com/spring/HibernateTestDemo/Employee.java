package com.spring.HibernateTestDemo;

import javax.persistence.*;

@Entity
@Table(name="emp_tab")
public class Employee {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name="ID",unique=true)
	private int id;
	@Column(name="NAME",nullable=true)
	private String name;
	@Column(name="SALARY",nullable=true)
	private int salary;
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
		
}
