package com.onebill.hibernate.Assignment_10_6_21;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Pan1;
import com.onebill.hibernate.bean.Person1;

public abstract class OneToOne1 extends Integrator {

	static void oneToOne() {

		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		try {
			System.out.println("Person-PAN (One to One)\n");
			System.out.println("Person table : ");
			System.out.println("i. id");
			System.out.println("ii. name");
			System.out.println("PAN table : ");
			System.out.println("i. pid");
			System.out.println("ii. name\n");

			boolean bool1 = true;
			do {
				System.out.println("1. Person & PAN");
				System.out.println("2. View data");
				System.out.println("3. Finish");
				System.out.println("Enter Choice to add data :");
				int key = sc.nextInt();

				switch (key) {
				case 1:

					System.out.println("\nEnter Data for Person : ");
					System.out.println("ID : ");
					int perid = sc.nextInt();
					System.out.println("Name : ");
					String pername = sc.next();

					Person1 p = new Person1();
					p.setId(perid);
					p.setName(pername);

					System.out.println("\nEnter Data for PAN : ");
					System.out.println("ID : ");
					int panid = sc.nextInt();

					Pan1 pn = new Pan1();
					pn.setPid(panid);
					pn.setName(pername);

					pn.setPerson(p);

					try {

						entitymanagerfactory = Persistence.createEntityManagerFactory("map");
						entitymanager = entitymanagerfactory.createEntityManager();
						entitytransaction = entitymanager.getTransaction();

						entitytransaction.begin();
						entitymanager.persist(pn);
						entitytransaction.commit();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
//					entitymanagerfactory = Persistence.createEntityManagerFactory("map");
//					entitymanager = entitymanagerfactory.createEntityManager();
//
//					System.out.println("Person Data : ");
//					String query1 = "from Person";
//					Query q1 = entitymanager.createQuery(query1);
//					@SuppressWarnings("unchecked") 
//					List<Person1> li = q1.getResultList();
//					for(Person1 per1 : li) {
//						System.out.println("ID : " + per1.getId());
//						System.out.println("Name : " + per1.getName());
//						System.out.println("-----------------------");
//					}
//					System.out.println();
//					System.out.println("PAN Data : ");
//					String query2 = "from Pan";
//					Query q2 = entitymanager.createQuery(query2);
//					@SuppressWarnings("unchecked") 
//					List<Pan1> list = q2.getResultList();
//					for(Pan1 pan1 : list) {
//						System.out.println("ID : " + pan1.getPid());
//						System.out.println("Name : " + pan1.getName());
//						System.out.println("-----------------------");
//					}
					break;
				case 3:
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
