package com.onebill.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer implements BeanFactoryAware, BeanNameAware, ApplicationContextAware{

	private String firstname;
	
	public Customer() {
		
		super();
		System.out.println("No Arg constructor");
	}

	public Customer(String firstname) {
		super();
		System.out.println("Arg constructor");
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Inside Set app context..." + applicationContext.isSingleton("customer"));
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Inside Set bean name");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Inside Set bean factory...." + beanFactory.containsBean("xyz"));
	}

		
	
}
