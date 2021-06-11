package com.onebill.spring.bean;

public class EmployeeBean {
	
	private int empid;
	private String empname;
	
	private DepartmentBean dept;

	public EmployeeBean(int empid, String empname, DepartmentBean dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
	}

	public EmployeeBean() {
		super();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public DepartmentBean getDept() {
		return dept;
	}

	public void setDept(DepartmentBean dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", empname=" + empname + ", dept=" + dept + "]";
	}
	
	
	
}
