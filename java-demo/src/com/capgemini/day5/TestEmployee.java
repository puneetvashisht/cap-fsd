package com.capgemini.day5;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(23, "Ravi", 34343.34);
		
//		Worker emp = e;
		
//		emp.setAge(25);
		// Person interface
//		System.out.println(emp.getName());
		
		// Worker interface
		System.out.println(emp.getSalary());
		
		// Common method
		System.out.println(emp.commonMethod());
		
		// Not common method
		System.out.println(emp.notCommon());

	}

}
