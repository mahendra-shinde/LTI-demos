package com.mahendra.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static void main(String[] args) {

		try {
			Configuration conf = new Configuration().configure("hibernate.cfg.xml");
			// HIbernate 4/5 requires ServiceRegistry
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(conf.getProperties());
			SessionFactory factory = conf.buildSessionFactory(builder.build());
			Session session = factory.openSession();
			System.out.println("COnnected");
			session.close();
			System.exit(0);

		} catch (Exception ex) {
			System.out.println("Configuration error !");
			ex.printStackTrace();
		}

	}
}
