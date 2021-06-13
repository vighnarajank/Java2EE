package com.onebill.spring.assignment_13_6_21;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Mobile;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("mobilecharger_config.xml");
    	
    	Mobile mob = (Mobile) context.getBean("mobile");
    	
    	mob.getCharger().setState("yes");
    	mob.getCharger().charging();
    	
    	Scanner sc = new Scanner(System.in);
    	int choice;
    	boolean bool = true;
    	System.out.println("Mobile is charging");
    	do {
    		System.out.println("1. Plug Charger");
    		System.out.println("2. Unplug Charger");
    		System.out.println("3. Message");
    		System.out.println("4. Phone");
    		System.out.println("5. Battery Percentage");
    		System.out.println("6. Switch off Phone");
    		System.out.println("Enter Choice:");
    		choice = sc.nextInt();
    		switch (choice) {
			case 1:
				
				if(mob.getCharger().getState() == "yes") {
					System.out.println("The charger is already pluged.");
					mob.getCharger().getPercent();
				}
				else {
					mob.getCharger().setState("yes");
//					mob.getCharger().charging();
					System.out.println("Charger is pluged in.");
					mob.getCharger().getPercent();
				}
				break;

			case 2:
				
				if(mob.getCharger().getState() == "no") {
					System.out.println("The charger is already unpluged.");
					mob.getCharger().getPercent();
				}
				else {
					mob.getCharger().setState("no");
//					mob.getCharger().charging();
					System.out.println("Charger is unpluged.");
					mob.getCharger().getPercent();
				}
				break;
				
			case 3:
				if(mob.getCharger().getPercent() <= 10) {
					System.out.println("Plugin to the charger to send message.");
				}
				else{
					System.out.println("Enter your message :");
					sc.next();
					System.out.println("Enter receiver's name :");
					String name = sc.next();
					System.out.println("Message sent to " + name);
				}
				break;
				
			case 4:
				if(mob.getCharger().getPercent() <= 10) {
					System.out.println("Plugin to the charger to call.");
				}
				else{
					System.out.println("Enter caller's name :");
					String name = sc.next();
					System.out.println("Calling to " + name);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			
			case 5:
				mob.getCharger().getPercent();
				break;
			
			case 6:
				System.out.println("Phone is turned off");
				bool = false;
				System.exit(0);
				break;
			default:
				System.out.println("Enter correct Choice...");
				break;
			}
    		
    	}while(bool);
    	sc.close();
    }
}
