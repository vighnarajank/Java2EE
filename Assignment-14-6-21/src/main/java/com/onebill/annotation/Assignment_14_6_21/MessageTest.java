package com.onebill.annotation.Assignment_14_6_21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.annotation.bean.MessageBean;
import com.onebill.annotation.config.Config;

public class MessageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MessageBean mb = context.getBean(MessageBean.class);
		mb.setMessage("Hi Vighna");
		System.out.println(mb.getMessage());
		
	}

}
