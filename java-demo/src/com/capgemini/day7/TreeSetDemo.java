package com.capgemini.day7;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		//sorted .. the objects should be comparable -- implementing comparable interface
		
		// defining new criteria for comparison basis salary
		SalaryComparator salaryComparator = new SalaryComparator();
		Set<Employee> employees = new TreeSet<>(salaryComparator);
		employees.add(new Employee(12, "Ravi", 34343.34));
		employees.add(new Employee(12, "Rahul", 34343.34));
		employees.add(new Employee(11, "Priya", 64343.34));
		employees.add(new Employee(2, "Arijit", 24343.34));
		employees.add(new Employee(14, "Saranya", 74343.34));
		
		System.out.println(employees);
		
		Employee e1 = new Employee(145, "Ravi", 34343.34);
		Employee e2 = new Employee(12, "Ravi", 34343.34);
		
		System.out.println(e1.compareTo(e2));
		
		// sorted
//		Set<String> fruits = new TreeSet<>();
		
		Set<Fruit> fruits = new TreeSet<>();
		fruits.add(new Fruit("orange"));
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("pineapple"));
		
		System.out.println(fruits);
		
		for(Fruit f : fruits) {
			System.out.println(f);
		}
		
	}

}
