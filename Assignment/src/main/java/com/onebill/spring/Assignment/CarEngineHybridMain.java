package com.onebill.spring.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.CarAnnotation;

public class CarEngineHybridMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("car_annotation_engine.xml"); 
		
		CarAnnotation ca = (CarAnnotation) context.getBean("carannotation");
		
		System.out.println(ca.getBrand());
		System.out.println(ca.getEngine().getType());
	}

}
