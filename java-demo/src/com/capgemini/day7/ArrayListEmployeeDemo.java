package com.capgemini.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ArrayListEmployeeDemo {
	
	public static Employee searchEmployee(List<Employee> employees, int employeeId) {
		for(Employee e: employees) {
			if(e.id == employeeId) {
				return e;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(12, "Ravi", 34343.34));
		employees.add(new Employee(12, "Rahul", 34343.34));
		employees.add(new Employee(11, "Priya", 64343.34));
		employees.add(new Employee(2, "Arijit", 24343.34));
		employees.add(new Employee(14, "Saranya", 74343.34));
		
		Employee searchedEmployee = searchEmployee(employees, 2);
		System.out.println(searchedEmployee);
		
//		Collections.
		
//		Sorting lists
		// comparator will take precedence
		Collections.sort(employees , new SalaryComparator());
		
		System.out.println(employees);
		// anonymous class
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
			
		});
		System.out.println(employees);
		
		
		
	}

}
