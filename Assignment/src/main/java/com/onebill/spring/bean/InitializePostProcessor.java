package com.onebill.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class InitializePostProcessor implements BeanPostProcessor, BeanFactoryPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String Name) 
			throws BeansException {

		System.out.println("BeforeInitialization....");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String Name) 
			throws BeansException {

		System.out.println("AfterInitialization........");
		return bean;
	}

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Inside post process bean factory");
	}

}
