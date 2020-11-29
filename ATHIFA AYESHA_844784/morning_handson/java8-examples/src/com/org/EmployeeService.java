package com.org;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.examples.Employee;

public class EmployeeService {
	
	public void add(Employee e){
		
		List<Employee> empl = new ArrayList<Employee>();
		/*empl.add(new Employee(55, "Edward", 35000, LocalDate.parse("2000-11-26")));
		empl.add(new Employee(45, "David", 25000, LocalDate.parse("2001-12-26")));
		empl.add(new Employee(35, "Bruce", 75000, LocalDate.parse("1998-11-21")));
		empl.add(new Employee(25, "Charles", 20000, LocalDate.parse("1999-11-23")));
		empl.add(new Employee(75, "Alex", 65000, LocalDate.parse("2003-10-16")));*/
	}
	
	 
		public int compare(Employee e1, Employee e2) {
			return e1.getId() - e2.getId();
	}
	employeesList.forEach(e -> System.out.println(e));	
		
	

}
