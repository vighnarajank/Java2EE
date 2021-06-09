package com.onebill.hibernate.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onebill.hibernate.Assignment_8_7_21.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student os = new Student();
    	os.setSid(12);
    	os.setSname("Aarthy");
    	os.setMarks(98);
    	
    	Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	SessionFactory factory = conf.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.save(os);
    	transaction.commit();
    	System.out.println("Saved data Successfully....");
    }
}
