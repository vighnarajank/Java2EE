package com.onebill.spring.SpringXMLDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Car;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext obj = new ClassPathXmlApplicationContext("spring.xml");
    	
    	//Vehicle obj1 = (Vehicle) obj.getBean("vehicle");
    	//obj1.drive();
 
    	Car obj1 = (Car) obj.getBean("car");
    	obj1.drive();
    	
    }
}
