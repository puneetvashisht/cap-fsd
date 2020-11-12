package com.capgemini.day3;

import static java.lang.Math.round;

import com.capgemini.day2.Employee;

public class ArraysDemo2 {
	
//	This will not work.. varargs have to be used at the end
//	public static void printEmployees(Employee... employees,Employee emp ) {
	
	public static void printEmployees(Employee emp, Employee... employees ) {
		for(Employee employee: employees) {
			System.out.println(employee);
		}
	}
	

	public static void main(String[] args) {

		Employee e1 = new Employee(44, "Priya", round(34343.34));
		Employee e2 = new Employee(14, "Ravi", round(34343.34));
		Employee e3 = new Employee(15, "Vaishali", round(34343.34));
		
		//create an array with e1 and e2 as values
		Employee employees[] = {e1, e2};
//		Employee employees[] = new Employee[10];
		
		//overwrite with new value e3
		employees[1] = e3;
		
//		printEmployees(employees);
		printEmployees(e1, e2, e3);
		

	}

}
