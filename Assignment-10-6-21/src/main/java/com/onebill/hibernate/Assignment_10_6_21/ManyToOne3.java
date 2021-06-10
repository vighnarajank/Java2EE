package com.onebill.hibernate.Assignment_10_6_21;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Cameras3;
import com.onebill.hibernate.bean.Display3;

public class ManyToOne3 extends Integrator{

	static void manyToOne() {

		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		try {
			System.out.println("Display-Cameras (Many to One)\n");
			System.out.println("Display table : ");
			System.out.println("i. camid");
			System.out.println("ii. brand");
			System.out.println("Cameras table : ");
			System.out.println("i. did");
			System.out.println("ii. type\n");

			Display3 d = new Display3();
			ArrayList<Cameras3> camarr = new ArrayList<Cameras3>();
			boolean bool1 = true;
			do {
				System.out.println("1. Display & Cameras");
				System.out.println("2. Finish");
				System.out.println("Enter Choice to add data :");
				int key = sc.nextInt();

				switch (key) {
				case 1:
					try {

						System.out.println("\nEnter Data for Display : ");
						System.out.println("ID : ");
						int d_id = sc.nextInt();
						System.out.println("Type : ");
						String d_type = sc.next();

						d.setDid(d_id);
						d.setType(d_type);

						boolean inbool = true;
						while(inbool) {
							System.out.println("\nEnter Data for Cameras : ");
							System.out.println("ID : ");
							int cam_id = sc.nextInt();
							System.out.println("Brand : ");
							String cam_brand = sc.next();

							Cameras3 cam = new Cameras3();
							cam.setCamid(cam_id);
							cam.setBrand(cam_brand);
							camarr.add(cam);

							System.out.println("Enter 1 to continue, 0 to end adding data.");
							int temp = sc.nextInt();
							if(temp==0) {
								inbool=false;
							}
						}

						d.setCam(camarr);

						entitymanagerfactory = Persistence.createEntityManagerFactory("map");
						entitymanager = entitymanagerfactory.createEntityManager();
						entitytransaction = entitymanager.getTransaction();

						entitytransaction.begin();
						entitymanager.persist(d);
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
