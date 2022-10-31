package com.spring.HibernateTestDemo;

import java.util.ArrayList;
import java.util.List;

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
		
		User u = new User();
		u.setName("Ravi");	
		
		Vehicle v1 = new Vehicle();
		v1.setName("BMW");
		
		Vehicle v2 = new Vehicle();
		v2.setName("Car");
		
		v1.setUser(u);
		v2.setUser(u);

		
		List<Vehicle> vs = new ArrayList<>();
		vs.add(v1);
		vs.add(v2);		
			
		u.setVehicles(vs);
			
		
		s.save(u);
		
		s.save(v1);
		s.save(v2);
		
		tr.commit();
		s.clear();
		s.close();
		
				
    	
    }
}
