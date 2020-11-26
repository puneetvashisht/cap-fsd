package com.capgemini.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class EmployeeTestLamdas {
	
	public static void print(List<Employee> employees, Condition condition) {
		for(Employee e: employees) {
			if(condition.test(e)) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		
		Employee e1= new Employee(1123, "Priya", "Negi", 34343.34);
		Employee e2= new Employee(112, "Amit", "Sharma", 44343.34);
		Employee e3= new Employee(11, "Saranya", "Raghav", 34343.34);
		Employee e4= new Employee(123, "Pankaj", "Tripathi", 64343.34);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);employees.add(e2);employees.add(e3);employees.add(e4);
		
//		1. Sort Employees by names
		
		
//		Collections.sort(employees,(Employee o1, Employee o2) ->  { return o1.name.compareTo(o2.name); } );
		Comparator<Employee>  nameComparator = (o1, o2) -> o1.name.compareTo(o2.name);
		Collections.sort(employees,nameComparator);
		System.out.println(employees);
		
//		2. Print employees conditionally.. starting letter of name is "P"
//		print(employees, new FirstNameCondition());
		print(employees, (e)-> e.name.startsWith("P"));
//		3. Print employees conditionally.. starting letter of lastname is "R"
//		for(Employee e: employees) {
//			if(e.lastName.startsWith("R")) {
//				System.out.println(e);
//			}
//		}
//		print(employees);
//		print(employees, new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return e.lastName.startsWith("R");
//			}
//		});
		print(employees, (e)-> e.lastName.startsWith("R"));
		
//		4. Print Salary greater than 40k

//		print(employees, new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return e.salary > 40000;
//			}		
//		});
		Condition salaryConidtion = (e)->  e.salary > 40000;
		print(employees, salaryConidtion);
		
		System.out.println(" --------   ");
		
		print(employees, (e) -> false );
	}
	

}
