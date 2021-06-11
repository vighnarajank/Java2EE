package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {


		@Autowired
		private Tyre tyre;
		
		private String name;

		public Car(Tyre tyre, String name) {
			super();
			this.tyre = tyre;
			this.name = name;
		}

		public Car() {
			super();
	
		}

		public Tyre getTyre() {
			return tyre;
		}

		public void setTyre(Tyre tyre) {
			this.tyre = tyre;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Car [tyre=" + tyre + ", name=" + name + "]";
		}
		
		public void drive() {
			System.out.println(name + " - " + tyre.getBrand());
		}
		
	}
