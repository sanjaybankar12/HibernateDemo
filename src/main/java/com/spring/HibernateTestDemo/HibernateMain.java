package com.spring.HibernateTestDemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {    	
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();    	
    	
    	SessionFactory sf = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		System.out.println("Session Factory created....");

		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Employee e = new Employee();
		e.setName("ravi");
		e.setSalary(45000);
		s.save(e);
		
		WageEmployee we = new WageEmployee();
		we.setName("sham");
		we.setSalary(55000);
		we.setHr(12);
		we.setRate(200);
		s.save(we);
		
		SalesPerson sp = new SalesPerson();
		sp.setName("Abc");
		sp.setSalary(23000);
		sp.setComm(200);
		s.save(sp);
		
		tr.commit();
		s.clear();
		s.clear();
		
				
    	
    }
}
