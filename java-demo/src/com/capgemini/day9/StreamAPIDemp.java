package com.capgemini.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



public class StreamAPIDemp {

	public static void main(String[] args) {


		List<Employee> employees = new ArrayList<>();

		Employee e1= new Employee(1123, "Priya", "Negi", 84343.34);
		Employee e2= new Employee(112, "Amit", "Sharma", 44343.34);
		Employee e5= new Employee(112, "Amit", "Sharma", 44343.34);
		Employee e3= new Employee(11, "Saranya", "Raghav", 54343.34);
		Employee e4= new Employee(123, "Pankaj", "Tripathi", 64343.34);
		employees.add(e1);employees.add(e2);employees.add(e5);employees.add(e3);employees.add(e4);
		
		
//		select * from employee where emp.salary> ?
		
		// Imperative
		int count = 0;
		for(Employee e: employees) {
			
			if(e.salary>40000) {
//				System.out.println(e);
				count ++;
				if(count == 3) break;
			}
		}
		System.out.println(count);
		
		//Declarative
		 employees.stream().parallel() // from employee
//		.distinct()
		.filter(e -> e.salary>40000) // where
//		.skip(2)
		.forEach(System.out::println); // all employees
//		.count();
//		System.out.println(total);
		
		List<String> strs = new ArrayList<>();
		strs.add("abc"); strs.add("xyz");
		
		Stream<String> stream = strs.stream();
		stream.forEach(System.out::println);

	}

}
