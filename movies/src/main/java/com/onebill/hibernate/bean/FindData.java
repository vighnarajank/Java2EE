package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAdemo.Movies;


public class FindData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movies");
		EntityManager em = emf.createEntityManager();
		Movies m = em.find(Movies.class, 45);
		System.out.println(m.getMid());
		System.out.println(m.getMname());
	}

}
