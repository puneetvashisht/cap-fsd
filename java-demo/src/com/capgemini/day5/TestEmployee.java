package com.capgemini.day5;

public class TestEmployee {

	public static void main(String[] args) {
		
		//create the composed object
		Address address = new Address(45, "GK", "New Delhi");
		
		// pass it inside constructor
		Employee emp = new Employee(23, "Ravi", 34343.34, 33, address);
		
		System.out.println(emp);
		
		Address newAddress = new Address(15, "Jangpura", "New Delhi");
		emp.setAddress(newAddress);
		
		System.out.println(emp);
		
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
