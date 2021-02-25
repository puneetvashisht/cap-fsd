package com.capgemini.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class EmployeeTestLamdas2 {
	
	public static void print(List<Employee> employees, Predicate<Employee> predicate, Consumer<Employee> consumer) {
		for(Employee e: employees) {
			if(predicate.test(e)) {
//				System.out.println(e);
				consumer.accept(e);
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
		Comparator<Employee>  nameComparator = (o1, o2) -> o1.name.compareTo(o2.name);
		Collections.sort(employees,nameComparator);
		System.out.println(employees);
		
//		2. Print employees conditionally.. starting letter of name is "P"
//		print(employees, (e)-> e.name.startsWith("P"), (e)->  System.out.println(e));
		print(employees, (e)-> e.name.startsWith("P"), System.out::println);
//		3. Print employees conditionally.. starting letter of lastname is "R"
		print(employees, (e)-> e.lastName.startsWith("R"), (e)->  System.out.println(e));
		
//		4. Print Salary greater than 40k
		Predicate<Employee> salaryConidtion = (e)->  e.salary > 40000;
		print(employees, salaryConidtion, (e)->  System.out.println(e));
		
		System.out.println(" --------   ");
		
//		5. Print all employees
		print(employees, (e) -> true, (e)->  System.out.print(e) );
	}
	

}
