package com.onebill.hibernate.JPAdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	private int cid;
	private String cname;
	
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
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
