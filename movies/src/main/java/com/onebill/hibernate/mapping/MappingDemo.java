package com.onebill.hibernate.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAdemo.Cart;

public class MappingDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		Cart c = new Cart();
		
		
		entityManagerFactory = Persistence.createEntityManagerFactory("shop");
	}

}
