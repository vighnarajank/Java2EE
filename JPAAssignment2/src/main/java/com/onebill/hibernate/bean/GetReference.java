package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.Assignment_9_7_21.Employee;

public class GetReference 
{
	public static void main( String[] args )
	{
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("employee");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Employee emp1 = entityManager.find(Employee.class, 3);
			emp1.setName("Ironman");
			entityManager.persist(emp1);
			System.out.println("Using find : " + emp1.getName());
			Employee emp2 = entityManager.getReference(Employee.class, 3);
			emp2.setName("CaptionAmerica");
			entityManager.persist(emp2);
			System.out.println("Using getReference : " + emp2.getName());
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
