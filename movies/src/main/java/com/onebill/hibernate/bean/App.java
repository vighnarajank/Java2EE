package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAdemo.Movies;


public class App 
{
    public static void main( String[] args )
    {
    	Movies mov = new Movies();
		mov.setMid(5);
		mov.setMname("IronMan3");
		mov.setMrating(9.7);
		mov.setMreview("Action");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movies");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(mov);
		et.commit();
    	System.out.println("Saved data Successfully....");    
    }
}
