package com.onebill.spring.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.PostProcessor;

public class PostProcessorMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocess.xml");
		
		PostProcessor postprocessor = (PostProcessor) context.getBean("name");
		
		System.out.println(postprocessor.getName());
	}

}
