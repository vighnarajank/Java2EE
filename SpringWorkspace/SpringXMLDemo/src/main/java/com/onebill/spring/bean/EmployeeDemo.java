package com.onebill.spring.bean;

public class EmployeeDemo {
	private int age;
	private String Name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [age=" + age + ", Name=" + Name + "]";
	}
	public EmployeeDemo(int age, String name) {
		super();
		this.age = age;
		Name = name;
	}
	public EmployeeDemo() {
		super();
	}
	
	
	
}
