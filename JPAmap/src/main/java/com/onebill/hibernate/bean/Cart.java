package com.onebill.hibernate.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@Column
	private int cid;

	@Column
	private String cname;

//	@Exclude
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cart")
//	private Item item;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
	private List<Item> items = new ArrayList<Item>();

	public Cart() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", cname=" + cname + ", items=" + items + "]";
	}
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Item items;

	
	
}
