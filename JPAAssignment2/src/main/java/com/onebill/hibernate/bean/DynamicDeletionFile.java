package com.onebill.hibernate.bean;

import java.io.File;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeletionFile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;


		try {

			File idfile = new File("id_delete.txt");
			Scanner sc = new Scanner(idfile);

			int id = Integer.parseInt(sc.next());
			
			entityManagerFactory = Persistence.createEntityManagerFactory("employee");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();
			System.out.println("The Employee ID going to get deleted: " + id);
			String query = "delete from Employee where emp_id=: id";
			Query q = entityManager.createQuery(query);
			q.setParameter("id", id);
			q.executeUpdate();
			entityTransaction.commit();
			System.out.println("Record deleted successfully");
			
			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
