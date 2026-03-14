package com.klu.skill2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.klu.semiexam.Delivery;

public class App {

	    public static void main(String[] args)
	    {
	        Configuration cfg = new Configuration();
	        cfg.configure();
	        cfg.addAnnotatedClass(Delivery.class);

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session session = sf.openSession();
	        Transaction tx = session.beginTransaction();

	        // Insert Record
	        Delivery d = new Delivery();
	        d.setId(1);
	        d.setName("Food Delivery");
	        d.setDate("10-03-2026");
	        d.setStatus("Delivered");
	        d.setAddress("Hyderabad");

	        session.save(d);

	        tx.commit();
	        session.close();

	        // Delete Record using HQL
	        Session session2 = sf.openSession();
	        Transaction tx2 = session2.beginTransaction();

	        String hql = "delete from Delivery where id=?1";

	        Query q = session2.createQuery(hql);
	        q.setParameter(1, 1);

	        int result = q.executeUpdate();

	        System.out.println("Deleted Records = " + result);

	        tx2.commit();
	        session2.close();
	        sf.close();
	    }
	}