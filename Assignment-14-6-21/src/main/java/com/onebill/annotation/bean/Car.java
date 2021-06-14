package com.onebill.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Car {

	@Value("BMW")
	private String brand;
	
	@Autowired(required = false)
	@Qualifier("tyre")
	Tyre tyre;	

	public Car(String brand, Tyre tyre) {
		super();
		this.brand = brand;
		this.tyre = tyre;
	}

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", tyre=" + tyre + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	
}
