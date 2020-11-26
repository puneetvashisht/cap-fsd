package com.capgemini.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1= new Employee(1123, "Priya", "Negi", 34343.34);
		Employee e2= new Employee(112, "Amit", "Sharma", 44343.34);
		Employee e3= new Employee(11, "Saranya", "Raghav", 34343.34);
		Employee e4= new Employee(123, "Pankaj", "Tripathi", 64343.34);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);employees.add(e2);employees.add(e3);employees.add(e4);
		
//		1. Sort Employees by names
		Collections.sort(employees, new NameComparator());
		System.out.println(employees);
		
//		2. Print employees conditionally.. starting letter of name is "P"
		for(Employee e: employees) {
			if(e.name.startsWith("P")) {
				System.out.println(e);
			}
		}
		
//		3. Print employees conditionally.. starting letter of lastname is "R"
		for(Employee e: employees) {
			if(e.lastName.startsWith("R")) {
				System.out.println(e);
			}
		}

	}
	

}
