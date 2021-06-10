package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "item")
public class Item {
	@Id
	@Column
	private int id;

	@Column
	private String itemname;

//	@Exclude
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "cid")
//	private Cart cart;

	@Exclude
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private Cart cart;

	public Item() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + ", cart=" + cart + "]";
	}
	
//	@Exclude
//	@OneToMany(cascade=CascadeType.ALL, mappedBy="item")
//	@JoinColumn(name="cid")
//	private List<Cart> cart;
	
	
	
}
