package com.spring.HibernateTestDemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

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
		
		Movie m = new Movie();
		m.setId(1);
		m.setName("Dil Chahata hai");
		List<Song> songs = new ArrayList<>();
		Song s1 = new Song();
		s1.setId(1);
		s1.setName("dil chahata hai");
		songs.add(s1);
		
		Song s2 = new Song();
		s2.setId(2);
		s2.setName("Jane kyun");
		songs.add(s2);
		
		m.setSongs(songs );
		
		s.save(s1);
		s.save(s2);
		s.save(m);
		
		tr.commit();
		s.clear();
		s.clear();
		
				
    	
    }
}
