package com.onebill.spring.SpringXMLDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.EmployeeBean;

public class EmployeeDepartment {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee_department_config.xml");
		EmployeeBean employeebean = context.getBean("emp", EmployeeBean.class);
		
		System.out.println("ID : "+ employeebean.getEmpid());
		System.out.println("Name : " + employeebean.getEmpname());
		System.out.println("dept ID : "+ employeebean.getDept().getDeptid());
		System.out.println("dept name : "+ employeebean.getDept().getDeptname());
		
	}

}
