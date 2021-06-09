package com.onebill.hibernate.bean;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeletionScanner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		Scanner sc = new Scanner(System.in);
		
		try {
		entityManagerFactory = Persistence.createEntityManagerFactory("employee");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		String query = "delete from Employee where emp_id=: id";
		Query q = entityManager.createQuery(query);
		q.setParameter("id", id);
		q.executeUpdate();
		entityTransaction.commit();
		System.out.println("Record deleted successfully");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
