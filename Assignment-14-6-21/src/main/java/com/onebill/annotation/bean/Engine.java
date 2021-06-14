package com.onebill.annotation.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
	
	@Value("v8")
	private String type;

	public Engine(String type) {
		super();
		this.type = type;
	}

	public Engine() {
		super();
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
