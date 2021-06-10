package com.onebill.hibernate.JPAmap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Cart;
import com.onebill.hibernate.bean.Item;

public class OnetoOne 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		
		Cart c = new Cart();
		c.setCid(1);
		c.setCname("cart1");
		
		Item i = new Item();
		i.setId(101);
		i.setItemname("Pencil");
		
		i.setCart(c);
		
		try {
			
			entitymanagerfactory = Persistence.createEntityManagerFactory("mapping");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			entitymanager.persist(i);
			entitytransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
    }
}
