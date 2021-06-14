package com.onebill.annotation.Assignment_14_6_21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.annotation.bean.Car1;
import com.onebill.annotation.config.Config;

public class Car1Engine {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
		Car1 car1 = context.getBean(Car1.class);
    	
    	System.out.println("Car    : " + car1.getBrand());
    	System.out.println("Engine : " + car1.getEngine().getType());
	}

}
