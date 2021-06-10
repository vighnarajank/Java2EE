package com.onebill.hibernate.Assignment_10_6_21;

import java.util.Scanner;

abstract class Integrator {
	
	static Scanner sc = new Scanner(System.in);

	protected static void integrator() {

		boolean bool = true;
		do {

			System.out.println("1. One to One");
			System.out.println("2. One to Many");
			System.out.println("3. Many to One");
			System.out.println("4. Many to Many");
			System.out.println("5. Exit\n");
			System.out.print("Enter choice : ");
			int input = sc.nextInt();

			switch(input){
			case 1:
				OneToOne1.oneToOne();
				break;
			case 2:
				OneToMany2.oneToMany();
				break;
			case 3:
				ManyToOne3.manyToOne();
				break;
			case 4:
				ManyToMany4.manyToMany();
				break;
			case 5:
				bool = false;
				break;
			default :
				System.out.println("Enter correct Choice....\nTry Again....\n");
				break;
			}
		} while(bool);

		sc.close();
	}

}
