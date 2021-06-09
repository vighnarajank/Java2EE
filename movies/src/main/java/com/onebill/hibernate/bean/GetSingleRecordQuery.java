package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.JPAdemo.Movies;

public class GetSingleRecordQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movies");
		EntityManager em = emf.createEntityManager();
		
		String query = "from Movies where mid=1";
		Query q = em.createQuery(query);
		
		Movies m = (Movies) q.getSingleResult();
		System.out.println(m.getMid());
		System.out.println(m.getMname());
	}

}
