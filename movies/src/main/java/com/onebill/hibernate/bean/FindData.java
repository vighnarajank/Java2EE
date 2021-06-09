package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAdemo.Movies;


public class FindData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movies");
		EntityManager em = emf.createEntityManager();
		Movies m = em.find(Movies.class, 2);
		Movies m1 = em.getReference(Movies.class, 2);
		System.out.println(m1.getMid());
		System.out.println(m.getMname());
	}

}
