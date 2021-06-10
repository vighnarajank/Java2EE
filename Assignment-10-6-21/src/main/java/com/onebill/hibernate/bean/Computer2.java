package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="computer")
public class Computer2 {
	
	@Id
	@Column
	private int cid;
	
	@Column
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "comp")
	private List<Displays2> displays;
	
	public Computer2() {
		super();
	}

	public int getId() {
		return cid;
	}

	public void setId(int id) {
		this.cid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Displays2> getDisplays() {
		return displays;
	}

	public void setDisplays(List<Displays2> displays) {
		this.displays = displays;
	}

	@Override
	public String toString() {
		return "Computer2 [id=" + cid + ", name=" + name + ", displays=" + displays + "]";
	}
	
}
