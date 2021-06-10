package com.onebill.hibernate.Assignment_10_6_21;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Companies4;
import com.onebill.hibernate.bean.Products4;

public class ManyToMany4 extends Integrator{

	static void manyToMany() {

		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		try {
			System.out.println("Companies-Products (Many to Many)\n");
			System.out.println("Companies table : ");
			System.out.println("i. company_id");
			System.out.println("ii. company_name");
			System.out.println("Products table : ");
			System.out.println("i. product_id");
			System.out.println("ii. product_name\n");

			Companies4 c4 = new Companies4();
			Products4 p4 = new Products4();
			ArrayList<Companies4> companyarr = new ArrayList<Companies4>();
			ArrayList<Products4> productarr = new ArrayList<Products4>();
			boolean bool1 = true;
			do {
				System.out.println("1. Companies & Products");
				System.out.println("2. Finish");
				System.out.println("Enter Choice to add data :");
				int key = sc.nextInt();

				switch (key) {
				case 1:
					try {
						boolean inbool = true;
						while(inbool) {
							
							System.out.println("\nEnter Data for Companies : ");
							System.out.println("Company ID : ");
							int cmp_id = sc.nextInt();
							System.out.println("Company Name : ");
							String cmp_name = sc.next();

							c4.setCompany_id(cmp_id);
							c4.setCompany_name(cmp_name);
							companyarr.add(c4);

							System.out.println("\nEnter Data for Products : ");
							System.out.println("Product ID : ");
							int prod_id = sc.nextInt();
							System.out.println("Product Name : ");
							String prod_name = sc.next();

							p4.setProduct_id(prod_id);
							p4.setProduct_name(prod_name);
							productarr.add(p4);

							System.out.println("Enter 1 to continue, 0 to end adding data.");
							int temp = sc.nextInt();
							if(temp==0) {
								inbool=false;
							}
						}

						for(Products4 iter : productarr) {
							iter.setCompanies4(companyarr);;
						}
						
						for(Companies4 iter : companyarr) {
							iter.setProds(productarr);
						}
												
						entitymanagerfactory = Persistence.createEntityManagerFactory("map");
						entitymanager = entitymanagerfactory.createEntityManager();
						entitytransaction = entitymanager.getTransaction();

						entitytransaction.begin();
						for(Products4 iter : productarr) {
							entitymanager.persist(iter);
						}
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
