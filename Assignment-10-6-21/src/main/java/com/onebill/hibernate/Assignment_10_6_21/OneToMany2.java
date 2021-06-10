package com.onebill.hibernate.Assignment_10_6_21;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Computer2;
import com.onebill.hibernate.bean.Displays2;

public abstract class OneToMany2 extends Integrator{

	static void oneToMany() {

		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		try {
			System.out.println("Computer-Displays (One to Many)\n");
			System.out.println("Computer table : ");
			System.out.println("i. cid");
			System.out.println("ii. name");
			System.out.println("Display table : ");
			System.out.println("i. did");
			System.out.println("ii. type\n");

			Computer2 c = new Computer2();
			ArrayList<Displays2> disparr = new ArrayList<Displays2>();
			boolean bool1 = true;
			do {
				System.out.println("1. Computer & Displays");
				System.out.println("2. Finish");
				System.out.println("Enter Choice to add data :");
				int key = sc.nextInt();

				switch (key) {
				case 1:
					try {
					System.out.println("\nEnter Data for Computer : ");
					System.out.println("ID : ");
					int compid = sc.nextInt();
					System.out.println("Name : ");
					String compname = sc.next();

					c.setId(compid);
					c.setName(compname);

					boolean inbool = true;
					while(inbool) {
						System.out.println("\nEnter Data for Display : ");
						System.out.println("ID : ");
						int dispid = sc.nextInt();
						System.out.println("Type : ");
						String disptype = sc.next();

						Displays2 d = new Displays2();
						d.setDid(dispid);
						d.setType(disptype);
						disparr.add(d);
						
						System.out.println("Enter 1 to continue, 0 to end adding data.");
						int temp = sc.nextInt();
						if(temp==0) {
							inbool=false;
						}
					}

					c.setDisplays(disparr);

						entitymanagerfactory = Persistence.createEntityManagerFactory("map");
						entitymanager = entitymanagerfactory.createEntityManager();
						entitytransaction = entitymanager.getTransaction();

						entitytransaction.begin();
						entitymanager.persist(c);
						entitytransaction.commit();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					bool1 = false;
					break;

				default:
					System.out.println("Enter correct choice...");
					break;
				}

			} while(bool1);
		} finally {

			if(entitymanagerfactory != null)
				entitymanagerfactory.close();
			if(entitymanager != null)
				entitymanager.close();
		}

	}

}
