package com.onebill.spring.bean;

public class DepartmentBean {

		private int deptid;
		private String deptname;
		public DepartmentBean(int deptid, String deptname) {
			super();
			this.deptid = deptid;
			this.deptname = deptname;
		}
		public DepartmentBean() {
			super();
		}
		public int getDeptid() {
			return deptid;
		}
		public void setDeptid(int deptid) {
			this.deptid = deptid;
		}
		public String getDeptname() {
			return deptname;
		}
		public void setDeptname(String deptname) {
			this.deptname = deptname;
		}
		@Override
		public String toString() {
			return "DepartmentBean [deptid=" + deptid + ", deptname=" + deptname + "]";
		}
	
}
