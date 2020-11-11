package com.capgemini.day2;

public class EmployeeTest {

	public static void main(String[] args) {
		// Create objects using new keyword
		Employee e1 = new Employee();
//		e1.id = 434;
		
		//optional setters
		e1.setId(-434);
		e1.setName("Ravi"); 
//		e1.salary= 23443.34;
		e1.setSalary(34343.34);
		
		//mandatory
		Employee e2 = new Employee(44, "Priya", 34343.34);
		double incrementedAmount = e2.incrementSalary(5000);
		System.out.println(incrementedAmount);
		
		
//		e2.id = 44;
//		e2.name = "Priya";
//		e2.salary= 33443.34;
		
		System.out.println(e2);
//		System.out.println(e2.toString());
		System.out.println(e1.toString());
		
		
		Address address = new Address(34, "GK", "New Delhi");
		System.out.println(address);

	}

}
