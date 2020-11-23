package com.capgemini.day7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapsDemo {

	public static void main(String[] args) {
		// Maps are combination of keys & values
		
		//keys unordered
//		Map<Integer, Employee> employeeMap = new HashMap<>();
		
		// keys insertion order
//		Map<Integer, Employee> employeeMap = new LinkedHashMap<>();
		
		Map<Integer, Employee> employeeMap = new TreeMap<>();
		// Keys in maps are sets
		employeeMap.put(12, new Employee(12, "Ravi", 34343.34));
		employeeMap.put(12, new Employee(12, "Rahul", 34343.34));
		employeeMap.put(11, new Employee(11, "Priya", 64343.34));
		employeeMap.put(2, new Employee(2, "Arijit", 24343.34));
		employeeMap.put(14, new Employee(14, "Saranya", 74343.34));
		
		Set<Integer> keySet = employeeMap.keySet();
		
		System.out.println(keySet);
		// Iterate using keys
		for(Integer key: keySet) {
			System.out.println(employeeMap.get(key));
		}
		
		
		
//		employeeMap.add(new Employee(12, "Ravi", 34343.34));
//		employeeMap.add(new Employee(12, "Rahul", 34343.34));
//		employeeMap.add(new Employee(11, "Priya", 64343.34));
//		employees.add(new Employee(2, "Arijit", 24343.34));
//		employees.add(new Employee(14, "Saranya", 74343.34));
		
		
//		Map<String name, Bank bank>
//		("icici", new Bank(13, "icici", 5.0));
		

	}

}
