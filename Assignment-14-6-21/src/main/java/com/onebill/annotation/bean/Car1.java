package com.onebill.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car1 {

	@Value("BMW")
	private String brand;
	
	@Autowired
	@Qualifier("engine")
	private Engine eng;

	public Car1(String brand, Engine engine) {
		super();
		this.brand = brand;
		this.eng = engine;
	}

	public Car1() {
		super();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return eng;
	}

	public void setEngine(Engine engine) {
		this.eng = engine;
	}

	@Override
	public String toString() {
		return "Car1 [brand=" + brand + ", engine=" + eng + "]";
	}
	
	
}
