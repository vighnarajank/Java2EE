package com.onebill.hibernate.JPAmap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Cart;
import com.onebill.hibernate.bean.Item;

public class OnetoOneTwoWay {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		Cart c = new Cart();
		c.setCid(100);
		c.setCname("first");

		Item i = new Item();
		i.setId(104);
		i.setItemname("Dress");

		//c.setItem(i);

		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("mapping");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			entitymanager.persist(c);
			entitytransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
