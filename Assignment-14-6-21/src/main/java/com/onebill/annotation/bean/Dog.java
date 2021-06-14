package com.onebill.annotation.bean;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Bow... bow...");
	}

}
