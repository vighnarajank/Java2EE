package com.onebill.spring.bean;

public class Engine {
	
	private String type;

	public Engine() {
		super();
	}

	public Engine(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	
	
	
}
