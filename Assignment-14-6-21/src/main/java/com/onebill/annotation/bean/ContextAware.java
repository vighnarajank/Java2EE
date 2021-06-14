package com.onebill.annotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContextAware implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		for(String i : applicationContext.getBeanDefinitionNames()) {
			System.out.println(i);
		}
		System.out.println(applicationContext.getBeanDefinitionCount());
	}

}
