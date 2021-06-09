package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamicQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("movies");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			String query = "delete from Movies where mid=: id";
			Query q = em.createQuery(query);
			q.setParameter("id", 1); //readDynamically
			//non select statements uses execute update
			int rowsaffected = q.executeUpdate();
			et.commit();
			System.out.println(rowsaffected + "Rows affected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
