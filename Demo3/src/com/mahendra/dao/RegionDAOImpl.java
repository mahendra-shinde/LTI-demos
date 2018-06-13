package com.mahendra.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mahendra.app.HibernateUtil;
import com.mahendra.models.Region;

public class RegionDAOImpl implements RegionDAO {

	private SessionFactory factory = HibernateUtil.getFactory();
	
	@Override
	public void save(Region region) {
		Session session = factory.openSession();
		Transaction tn = session.getTransaction();
		try {
			tn.begin();
			session.persist(region);
			tn.commit();
		}catch(HibernateException ex) {
			if(tn != null) {
				System.out.println("Error occurred :" + ex.getMessage());
				tn.rollback();
			}
		}
		
		session.close();
	}

	@Override
	public Region findById(Integer regionId) {
		Session session = factory.openSession();
		Region region = session.get(Region.class, regionId);
		session.close();
		return region;
	}

	@Override
	public List<Region> findByName(String name) {
		List<Region> regions = null;
		Session session = factory.openSession();
		Query query = session.createQuery("from Region r where lower(r.name) like :name")
					.setParameter("name", "%"+name.toLowerCase()+"%");
		regions = query.list();
		session.close();
		return regions;
	}

	@Override
	public void update(Region region) {
		Session session = factory.openSession();
		Transaction tn = session.getTransaction();
		try {
			tn.begin();
			session.update(region);
			tn.commit();
		}catch(HibernateException ex) {
			if(tn != null) {
				System.out.println("Error occurred :" + ex.getMessage());
				tn.rollback();
			}
		}
		session.close();
	}

	@Override
	public void remove(Region region) {
		Session session = factory.openSession();
		Transaction tn = session.getTransaction();
		try {
			tn.begin();
			session.delete(region);
			tn.commit();
		}catch(HibernateException ex) {
			if(tn != null) {
				System.out.println("Error occurred :" + ex.getMessage());
				tn.rollback();
			}
		}
		
		session.close();
	}

}
