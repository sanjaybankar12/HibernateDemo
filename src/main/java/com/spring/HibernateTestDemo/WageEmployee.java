package com.spring.HibernateTestDemo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="wage_tab")
public class WageEmployee extends Employee {

	private int hr;
	private int rate;
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
}
