package com.spring.HibernateTestDemo;

import javax.persistence.*;

@Entity
@Table(name="sales_tab")
public class SalesPerson extends Employee {

	private int comm;

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}
	
	
}
