package com.spring.HibernateTestDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;



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
		System.out.println("First Session started...");

		Employee e = s.get(Employee.class, 1);
		System.out.println(e);
		
		
		tr.commit();
		s.clear();
		s.close();
		
		s = sf.openSession();
		tr = s.beginTransaction();
		System.out.println("Second Session started...");
		Employee e1 = s.get(Employee.class, 1);
		System.out.println(e1);

		
		tr.commit();
		s.clear();
		s.close();
		
				
    	
    }
}
