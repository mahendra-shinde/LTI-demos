package com.mahendra.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

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

	@Override
	public Integer countCountries() {
		Session session = factory.openSession();
		Integer count = 0;
		Query query = session.createQuery("select count(x) from Country x");
		count = ((Long) query.getSingleResult()).intValue();
		session.close();
		return count;
	}

	@Override
	public List<String> getCountryNames() {
		Session session = factory.openSession();
		List<String> names = null;
		Query query = session.createQuery("select c.name from Country c");
		names = query.list();
		session.close();
		return names;
	}

}
