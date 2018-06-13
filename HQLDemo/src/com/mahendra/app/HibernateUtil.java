package com.mahendra.app;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class HibernateUtil {

	private static SessionFactory factory = build();
	
	private static SessionFactory build() {
		
		try {
		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		//HIbernate 4/5  requires ServiceRegistry
		StandardServiceRegistryBuilder builder = 
					new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory(builder.build());
		System.out.println("COnnected");
		
		return factory;
	}catch(Exception ex) {
		ex.printStackTrace();
		return null;
	}
	}
	
	public static SessionFactory getFactory() {
		return factory;
	}
}
