package com.onebill.hibernate.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cameras")
public class Cameras3 {

	@Id
	@Column
	private int camid;
	
	@Column 
	private String brand;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Display3 display3;

	public Cameras3() {
		super();
	}

	public int getCamid() {
		return camid;
	}

	public void setCamid(int camid) {
		this.camid = camid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Display3 getDisplay3() {
		return display3;
	}

	public void setDisplay3(Display3 display3) {
		this.display3 = display3;
	}

	@Override
	public String toString() {
		return "Cameras3 [camid=" + camid + ", brand=" + brand + ", display3=" + display3 + "]";
	}
	
}
