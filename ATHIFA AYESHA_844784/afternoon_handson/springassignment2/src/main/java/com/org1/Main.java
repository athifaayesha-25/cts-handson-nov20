package com.org1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		EmployeeService service = (EmployeeService)context.getBean("employeeService");
		service.storeEmployee();
	}

}
