package com.onebill.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalType {

	private String type;
	
	@Autowired
	@Qualifier("cat")
	private Animal animal;

	public AnimalType(Animal animal, String type) {
		super();
		this.animal = animal;
		this.type = type;
	}

	public AnimalType() {
		super();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AnimalType [animal=" + animal + ", type=" + type + "]";
	}
	
	
	
}
