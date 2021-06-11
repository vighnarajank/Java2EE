package com.onebill.spring.SpringXMLDemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.EmployeeDemo;

public class EmployeeDemo1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");
		EmployeeDemo employee1 = (EmployeeDemo) context.getBean("employee");
		EmployeeDemo employee2 = (EmployeeDemo) context.getBean("employee");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name :");
		employee1.setName(sc.next());
		System.out.println("Age :");
		employee1.setAge(sc.nextInt());
		
		System.out.println("Name :");
		employee2.setName(sc.next());
		System.out.println("Age :");
		employee2.setAge(sc.nextInt());
		
		//scope is 'prototype' in employeeconfig.xml 
		System.out.println("Name 1 :" + employee1.getName());
		System.out.println("Age 1  :" + employee1.getAge());
		System.out.println("Name 2 :" + employee2.getName());
		System.out.println("Age 2  :" + employee2.getAge());
		sc.close();
	}

}
