package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.JPAdemo.Movies;

public class ReadDynamicQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movies");
		EntityManager em = emf.createEntityManager();
		
		String query = "from Movies where mid=: movieid";
		Query q = em.createQuery(query);
		q.setParameter("movieid", Integer.parseInt(args[0]));
		Movies movie = (Movies) q.getSingleResult();
		System.out.println(movie.getMid());
		System.out.println(movie.getMname());
	}

}
