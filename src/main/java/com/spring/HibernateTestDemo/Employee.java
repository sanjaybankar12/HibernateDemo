package com.spring.HibernateTestDemo;

import javax.persistence.*;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="emp_tab")
@NamedNativeQuery(name="byStartwithA", query="select name from emp_tab where name like ?1")
@Cacheable
@org.hibernate.annotations.Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Employee {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
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
