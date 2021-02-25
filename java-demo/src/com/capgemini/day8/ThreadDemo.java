package com.capgemini.day8;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.day7.Employee;

public class ThreadDemo {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(12, "Ravi", 34343.34));
		employees.add(new Employee(12, "Rahul", 34343.34));
		employees.add(new Employee(11, "Priya", 64343.34));
		employees.add(new Employee(2, "Arijit", 24343.34));
		employees.add(new Employee(14, "Saranya", 74343.34));
		
		long startTime = System.currentTimeMillis();
		// operation on a bulk 
		for(Employee e: employees) {
			e.incrementSalary();
			System.out.println(e);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time taken to process: " + (endTime - startTime));
		
		
		

	}

}
