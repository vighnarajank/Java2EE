package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAdemo.Movies;

public class UpdateRecord {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movies");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Movies m = em.find(Movies.class, 2);
		m.setMname("Ironman2");
		em.persist(m);
		et.commit();
		System.out.println("Record Changed");
	}

}
