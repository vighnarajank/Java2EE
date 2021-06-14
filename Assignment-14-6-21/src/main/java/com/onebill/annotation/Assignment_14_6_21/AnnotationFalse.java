package com.onebill.annotation.Assignment_14_6_21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.annotation.bean.Car;
import com.onebill.annotation.config.CarTyreConfig;

/*
 * Using Car-Tyre Classes
 * */
public class AnnotationFalse 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(CarTyreConfig.class);
    	Car car = context.getBean(Car.class);
    	
    	System.out.println("Car    : " + car.getBrand());
    	System.out.println("Tyre : " + car.getTyre());
    }
}
