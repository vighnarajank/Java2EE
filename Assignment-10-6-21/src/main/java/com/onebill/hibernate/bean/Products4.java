package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products4 {

	@Id
	@Column
	private int product_id;
	
	@Column
	private String product_name;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "prods")
	private List<Companies4> companies4;

	public Products4() {
		super();
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public List<Companies4> getCompanies4() {
		return companies4;
	}

	public void setCompanies4(List<Companies4> companies4) {
		this.companies4 = companies4;
	}

	@Override
	public String toString() {
		return "Products4 [product_id=" + product_id + ", product_name=" + product_name + ", companies4=" + companies4
				+ "]";
	}
	
}
