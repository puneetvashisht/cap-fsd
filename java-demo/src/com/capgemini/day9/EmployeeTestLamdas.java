package com.capgemini.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



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
		
		Optional<Double> totalSalary = employees.stream()
		.map(e-> e.salary)
		.reduce((salary1, salary2)-> salary1+ salary2);
		
		System.out.println(totalSalary.get());
//		.sorted()
//		.filter(e->e.salary> 50000)
//		.map(e->e.name)
//		.forEach(System.out::println);
//		.max((o1,o2)-> o1.salary.compareTo(o2.salary));
//		.collect(Collectors.toList());
		
//		System.out.println(employeeWithMaxSalary.get());
//		
//		distinctEmployees.get(0).lastName;
		
		OptionalInt maxValue = IntStream.of().max();
		if(maxValue.isPresent()) {
			System.out.println(maxValue.getAsInt());
		}
		
		
		
//		Collections.sort(employees,(Employee o1, Employee o2) ->  { return o1.name.compareTo(o2.name); } );
		
		Comparator<Employee>  nameComparator = (o1, o2) ->  {
			if(o1.name.equals(o2.name)) {
				return o1.salary.compareTo(o2.salary);
			}
			return o1.name.compareTo(o2.name);
			
					
		};
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
