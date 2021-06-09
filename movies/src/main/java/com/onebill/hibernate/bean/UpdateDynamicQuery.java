package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamicQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("movies");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			String query = "update Movies set mname=: name, mreview=: review, mrating=: rating where mid=: id";
			Query q = em.createQuery(query);
			//bind parameters
			q.setParameter("name", "Avengers");
			q.setParameter("review", "Good");
			q.setParameter("rating", 9.7);
			q.setParameter("id", 2); //readDynamically from file/cla/scanner
			//non select statements uses execute update
			int rowsaffected = q.executeUpdate();
			et.commit();
			System.out.println(rowsaffected + "-Rows affected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
