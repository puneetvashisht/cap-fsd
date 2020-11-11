package com.capgemini.day2;

public class GCDemo {
	static Employee emp;
	static int count;
	static {
		System.out.println("Initialized as the first thing");
		emp = new Employee(12, "Aish", 3434.34);
		
	}
	

	public static void m1() {
		System.out.println("m1 method start...");
		System.out.println(emp);
		System.out.println("m1 method end...");
	}
	
	public static void main(String[] args) {
		System.out.println("main method start...");
		System.out.println(++Employee.count);
		System.out.println(emp);
		
		Employee emp1 = new Employee(13, "Ravi", 3434.34);
//		emp1.count
		emp1.setId(emp.getId() + 1);
		System.out.println(++emp1.count);
		
		Employee emp2 = new Employee(7, "Ravi", 3434.34);
//		emp1.count
		System.out.println(++emp2.count);
		
		m1();
		
		System.out.println("main method end...");
	}

}
