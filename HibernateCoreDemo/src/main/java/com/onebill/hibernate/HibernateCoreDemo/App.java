package com.onebill.hibernate.HibernateCoreDemo;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onebill.hibernate.bean.User;

public class App 
{
    public static void main( String[] args )
    {
    	User u = new User();
    	u.setUserid(2);
    	u.setName("Rajan");
    	u.setPassword("123456");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
    	
    	SessionFactory factory = con.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.save(u);
    	transaction.commit();
    	System.out.println("Saved record Successfully");
    }
}
