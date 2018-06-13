package com.mahendra.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mahendra.app.HibernateUtil;
import com.mahendra.models.Country;

public class CountryDAOImpl implements CountryDAO {

	SessionFactory factory = HibernateUtil.getFactory();
	
	@Override
	public Country findById(String countryId) {
		Session session = factory.openSession();
		Country country = session.get(Country.class, countryId);
		session.close();
		return country;
	}

}
