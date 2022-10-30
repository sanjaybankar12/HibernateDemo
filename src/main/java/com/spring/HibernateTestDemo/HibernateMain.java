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
		Address address = new Address();
		address.setCity("Pune");
		address.setState("MH");
		e.setAddress(address );
		s.save(e);
		
		tr.commit();
		s.clear();
		s.clear();
		
				
    	
    }
}
