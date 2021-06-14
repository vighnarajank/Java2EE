package com.onebill.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class PostConstructPreDestroy {

	@PostConstruct
	private void init() {
		System.out.println("Class initialized");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("Class destroyed");
	}
	
	public void disp() {
		System.out.println("This is Vighna...");
	}

	public PostConstructPreDestroy() {
		System.out.println("Class Constructor");
	}

}
