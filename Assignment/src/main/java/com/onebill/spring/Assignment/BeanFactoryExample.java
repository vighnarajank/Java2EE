package com.onebill.spring.Assignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.ShopBeanFactory;

public class BeanFactoryExample {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanfactory.xml");
        ShopBeanFactory shopbf = (ShopBeanFactory) beanFactory.getBean("shop");
        System.out.println("employee Id : " + shopbf.getShopId());
        System.out.println("employee Name : " + shopbf.getShopName());
	}

}
