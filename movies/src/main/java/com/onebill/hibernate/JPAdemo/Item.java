package com.onebill.hibernate.JPAdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	private int id;
	private String itemname;
}
