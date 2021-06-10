package com.onebill.hibernate.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="displays")
public class Displays2 {
	
	@Id
	@Column
	private int did;
	
	@Column 
	private String type;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="cid")
	private Computer2 comp;

	public Displays2() {
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

	public Computer2 getComputer() {
		return comp;
	}

	public void setComputer(Computer2 comp) {
		this.comp = comp;
	}

	@Override
	public String toString() {
		return "Displays2 [did=" + did + ", type=" + type + ", computer=" + comp + "]";
	}
	
}
