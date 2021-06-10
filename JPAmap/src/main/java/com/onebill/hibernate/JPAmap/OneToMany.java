package com.onebill.hibernate.JPAmap;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Cart;
import com.onebill.hibernate.bean.Item;

public class OneToMany {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		Cart c1 = new Cart();
		c1.setCid(100);
		c1.setCname("first");
		
		Cart c2 = new Cart();
		c2.setCid(101);
		c2.setCname("Second");
		
		Cart c3 = new Cart();
		c3.setCid(102);
		c3.setCname("Third");
		
		Item i = new Item();
		i.setId(1001);
		i.setItemname("Dress");
		
		i.setCart(c1);
		i.setCart(c2);
		i.setCart(c3);
		
		ArrayList<Cart> cartlist = new ArrayList<Cart>();
		cartlist.add(c1);
		cartlist.add(c2);
		cartlist.add(c3);
		
		//i.setCart(cartlist);
		
		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("mapping");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			entitymanager.persist(c1);
			entitymanager.persist(c2);
			entitymanager.persist(c3);
			entitymanager.persist(i);
			entitytransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
