package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "companies")
public class Companies4 {

	@Id
	@Column
	private int company_id;
	
	@Column
	private String Company_name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "company_product_info", joinColumns = @JoinColumn(name = "company_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<Products4> prods;

	public Companies4() {
		super();
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getCompany_name() {
		return Company_name;
	}

	public void setCompany_name(String company_name) {
		Company_name = company_name;
	}

	public List<Products4> getProds() {
		return prods;
	}

	public void setProds(List<Products4> prods) {
		this.prods = prods;
	}

	@Override
	public String toString() {
		return "Companies4 [company_id=" + company_id + ", Company_name=" + Company_name + ", prods=" + prods + "]";
	}
	
}
