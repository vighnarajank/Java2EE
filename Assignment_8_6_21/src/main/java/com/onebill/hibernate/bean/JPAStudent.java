package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.Assignment_8_7_21.Student;

public class JPAStudent {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setSid(35);
		stu.setSname("Karthick");
		stu.setMarks(90);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stud");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(stu);
		et.commit();
    	System.out.println("Saved data Successfully....");
	}

}
