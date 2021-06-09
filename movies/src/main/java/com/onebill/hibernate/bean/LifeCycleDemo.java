package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAdemo.Movies;

public class LifeCycleDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			emf = Persistence.createEntityManagerFactory("movies");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Movies movies = em.find(Movies.class, 2);
			System.out.println("Before Detach... " + em.contains(movies));
			
			em.detach(movies);
			System.out.println("After Detach... " + em.contains(movies));
			
			Movies mergedObject = em.merge(movies);
			System.out.println("After Reattach... " + em.contains(mergedObject));
			mergedObject.setMname("Raavan");
			et.commit();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
