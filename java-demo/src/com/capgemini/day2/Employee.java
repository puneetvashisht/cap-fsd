package com.capgemini.day2;


// Object class is the super parent 
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	// no argument / default constructor
	public Employee() {
		System.out.println("Initialize...");
	}
	// agrs
//	public Employee(int id, String name, double amount) {
//		this.id = id;
//		this.name = name;
//		this.salary = amount;
//	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//method 
	public double incrementSalary(double amount) {
		return this.salary += amount;
	}
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		if(id>0) {
			this.id = id;
		}
	}
	
	public String toString() {
        return "name: " + this.name + " - id: " + this.id + " - salary: " + this.salary;
        
    }


}
