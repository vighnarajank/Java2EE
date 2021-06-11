package com.onebill.spring.bean;

public class PostProcessor {

	private String name;

	public PostProcessor(String name) {
		super();
		this.name = name;
	}

	public PostProcessor() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PostProcessor [name=" + name + "]";
	}
	
	public void initialize() {
		System.out.println("Initialization starts");
	}
	
	public void destroy() {
		System.out.println("Bean Destroyed");
	}
	
}
