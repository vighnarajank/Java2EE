package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "carannotation")
public class CarAnnotation {

	@Value("BMW")
	private String brand;

	@Autowired(required = true)
	@Qualifier("engineannotation")
	private EngineAnnotation engine;

	public CarAnnotation(String brand, EngineAnnotation engine) {
		super();
		this.brand = brand;
		this.engine = engine;
	}

	public CarAnnotation() {
		super();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public EngineAnnotation getEngine() {
		return engine;
	}

	public void setEngine(EngineAnnotation engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + "]";
	}


}
