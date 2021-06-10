package com.onebill.hibernate.JPAmap;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Cart;
import com.onebill.hibernate.bean.Item;

public class ManyToOne {

	public static void main(String[] args) {// TODO Auto-generated method stub
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		Item i1 = new Item();
		i1.setId(104);
		i1.setItemname("Dress");
		
		Item i2 = new Item();
		i2.setId(105);
		i2.setItemname("Pen");
		
		Item i3 = new Item();
		i3.setId(106);
		i3.setItemname("Pencil");
		
		Cart c = new Cart();
		c.setCid(100);
		c.setCname("first");
		
		i1.setCart(c);
		i2.setCart(c);
		i3.setCart(c);
		
		ArrayList<Item> itemlist = new ArrayList<Item>();
		itemlist.add(i1);
		itemlist.add(i2);
		itemlist.add(i3);
		
		c.setItems(itemlist);
		
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
