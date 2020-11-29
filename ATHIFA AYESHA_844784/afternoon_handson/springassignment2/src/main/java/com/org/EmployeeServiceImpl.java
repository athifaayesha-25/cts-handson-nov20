package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
private EmployeeDao employeeDao;   // <property name = "employeeDao" ref = "dao">
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void storeEmployee() {
		employeeDao.store();
		System.out.println("storeEmployee() of service");
	}
		

}
