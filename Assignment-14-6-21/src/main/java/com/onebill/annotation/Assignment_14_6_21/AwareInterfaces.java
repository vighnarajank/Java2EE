package com.onebill.annotation.Assignment_14_6_21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.annotation.bean.ContextAware;
import com.onebill.annotation.config.Config;

public class AwareInterfaces {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		context.getBean(ContextAware.class);
		
	}

}
