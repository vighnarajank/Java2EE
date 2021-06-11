package com.onebill.spring.SpringXMLDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Customer;

public class CustomerTest {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("customerConfig.xml");
		Customer customer = context.getBean("customer", Customer.class);
		
		System.out.println("First Name : " + customer.getFirstname());
		
	}

}
