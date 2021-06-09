package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.Assignment_9_7_21.Employee;

public class findMethodAllEmployeeNames {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("employee");
			entityManager = entityManagerFactory.createEntityManager();

			String query = "from Employee";
			Query q = entityManager.createQuery(query);
			@SuppressWarnings("unchecked")
			List<Employee> qr = q.getResultList();


			Employee[] emp = new Employee[qr.size()];

			for(int j=0;j<qr.size();j++) {
				emp[j] = entityManager.find(Employee.class, qr.get(j).getEmp_id());
			}

			for(int j=0;j<qr.size();j++) {
				System.out.println("Employee-" + emp[j].getEmp_id() + " : " + emp[j].getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
