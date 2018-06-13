package com.mahendra.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mahendra.app.HibernateUtil;
import com.mahendra.models.LoanAccount;
import com.mahendra.models.SavingAccount;

public class AccountDAOImpl implements AccountDAO {

	SessionFactory factory = HibernateUtil.getFactory();
	
	@Override
	public void save(SavingAccount account) {
		Session session = factory.openSession();
		Transaction tn = session.getTransaction();
		try {
			tn.begin();
			session.save(account);
			tn.commit();
		}catch(HibernateException ex) {
			if(tn!=null) {
				tn.rollback();
			}
		}
		
		session.close();
	}

	@Override
	public void save(LoanAccount account) {
		Session session = factory.openSession();
		Transaction tn = session.getTransaction();
		try {
			tn.begin();
			session.save(account);
			tn.commit();
		}catch(HibernateException ex) {
			if(tn!=null) {
				tn.rollback();
			}
		}
		session.close();
	}

}
