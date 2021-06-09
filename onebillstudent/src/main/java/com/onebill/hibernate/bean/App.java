package com.onebill.hibernate.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.db.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student stu = new Student();
		stu.setSid(10);
		stu.setSname("Ragul");
		stu.setMarks(92);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(stu);
		et.commit();
    	System.out.println("Saved data Successfully....");    
    }
}
