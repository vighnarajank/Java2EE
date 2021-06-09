package com.onebill.hibernate.JPAdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	
	@Id
	private int mid;
	private String mname;
	private double mrating;
	private String mreview;
	
	public Movies() {
		super();
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getMrating() {
		return mrating;
	}
	public void setMrating(double mrating) {
		this.mrating = mrating;
	}
	public String getMreview() {
		return mreview;
	}
	public void setMreview(String mreview) {
		this.mreview = mreview;
	}
	@Override
	public String toString() {
		return "Movies [mid=" + mid + ", mname=" + mname + ", mrating=" + mrating + ", mreview=" + mreview + "]";
	}
	
}
