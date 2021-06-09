package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.onebill.hibernate.JPAdemo.Movies;

public class ReadAllRecordsQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movies");
		EntityManager em = emf.createEntityManager();
		
		String query = "from Movies";
		Query q = em.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Movies> qr = q.getResultList();
		for(Movies m : qr) {
			System.out.println(m.getMid());
			System.out.println(m.getMname());
			System.out.println(m.getMrating());
			System.out.println("------------------");
		}
	}

}
