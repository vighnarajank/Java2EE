package com.onebill.hibernate.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pan")
public class Pan1 {
	@Id
	@Column
	private int pid;
	
	@Column
	private String Name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Person1 person1;

	public Pan1() {
		super();
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Person1 getPerson() {
		return person1;
	}

	public void setPerson(Person1 person1) {
		this.person1 = person1;
	}

	@Override
	public String toString() {
		return "Pan1 [pid=" + pid + ", Name=" + Name + ", person=" + person1 + "]";
	}
	
}
