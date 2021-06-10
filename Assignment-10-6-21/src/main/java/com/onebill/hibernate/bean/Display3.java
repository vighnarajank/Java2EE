package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "display")
public class Display3 {

	@Id
	@Column
	private int did;
	
	@Column 
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "display3")
	private List<Cameras3> cam;

	public Display3() {
		super();
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Cameras3> getCam() {
		return cam;
	}

	public void setCam(List<Cameras3> cam) {
		this.cam = cam;
	}

	@Override
	public String toString() {
		return "Display3 [did=" + did + ", type=" + type + ", cam=" + cam + "]";
	}
	
}
