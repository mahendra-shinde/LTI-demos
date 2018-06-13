package com.mahendra.app;

import java.util.List;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

import com.mahendra.models.Region;

public class HibernateUtil {

	public static void main(String[] args) {
		
		try {
		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		//HIbernate 4/5  requires ServiceRegistry
		StandardServiceRegistryBuilder builder = 
					new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		
		System.out.println("COnnected");
		
		//HQL to get all regions
		List<Region> regions = session.createQuery("from Region").list();
		System.out.println("Found regions "+regions.size());
		for(Region r : regions) {
			System.out.println(r.getName());
		}
		
		Transaction t = session.getTransaction();
		try {
			t.begin();
			Region reg = new Region(); //Transient
			reg.setRegionId(6);
			reg.setName("Madagaskar");			
			session.persist(reg);	// persistent
			
			reg.setName("Land of Alex");			
			t.commit();			
		}catch(HibernateException ex) {
			System.out.println("Error "+ex.getMessage());
			t.rollback();
		}
		
		session.close();
		
		System.exit(0);
		
		}catch(Exception ex) {
			System.out.println("Configuration error !");
			ex.printStackTrace();
		}
		
	}
}
