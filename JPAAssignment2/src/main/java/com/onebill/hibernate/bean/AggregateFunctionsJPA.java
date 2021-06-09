package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AggregateFunctionsJPA {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("employee");
			entityManager = entityManagerFactory.createEntityManager();

			//Max Salary
			String max = "select max(salary) from Employee";
			Query q1 = entityManager.createQuery(max);
			int maximum = (Integer) q1.getSingleResult();
			System.out.println("Max salary = " + maximum);
			
			//Average Salary
			String average = "select avg(salary) from Employee";
			Query q2 = entityManager.createQuery(average);
			Double avg = (Double) q2.getSingleResult();
			System.out.println("Max salary = " + avg);
			
			//sum of salary
			String sum = "select sum(salary) from Employee";
			Query q3 = entityManager.createQuery(sum);
			Long tot = (Long) q3.getSingleResult();
			System.out.println("Total salary = " + tot);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
