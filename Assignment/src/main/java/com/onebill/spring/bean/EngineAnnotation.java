package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("engineannotation")
public class EngineAnnotation {

	@Value("v10")
	private String type;

	public EngineAnnotation(String type) {
		super();
		this.type = type;
	}

	public EngineAnnotation() {
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
		return "EngineAnnotation [type=" + type + "]";
	}
	
	
}
