package com.capgemini.day9;

public class Employee {
	int id;
	String name;
	String lastName;
	double salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name, String lastName, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", salary=" + salary + "]";
	}


}
