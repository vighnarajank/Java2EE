package com.onebill.spring.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Car;

public class CarEngineXMLMain 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("car_engine.xml");
    	
    	Car c = (Car) context.getBean("car");
    	
    	System.out.println(c.getBrand());
    	System.out.println(c.getEngine().getType());
    }
}
