package com.onebill.hibernate.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person1 {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "person1")
	private Pan1 pan;

	public Person1() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pan1 getPan() {
		return pan;
	}

	public void setPan(Pan1 pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Person1 [id=" + id + ", Name=" + name + ", pan=" + pan + "]";
	}
	
	
}
