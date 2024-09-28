package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.RegVO;

@Repository
public class RegDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void insert(RegVO regVO) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(regVO);
			transaction.commit();
			session.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public List search() {

		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from RegVO");

		List ls = q.list();
		session.close();

		return ls;
	}

	public void delete(RegVO regVO) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(regVO);
		transaction.commit();
		session.close();

	}

	public List edit(RegVO regVO) {

		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from RegVO where id=" + regVO.getId());
		List ls = q.list();
		session.close();

		return ls;
	}

}
