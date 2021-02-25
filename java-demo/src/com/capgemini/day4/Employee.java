package com.capgemini.day4;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Employee() {
		
	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}
	

	public Employee(int id, String name, double salary) {
//		super();
		this(id,name);
//		super(id, name);
		this.salary = salary;
	}

	public void incrementSalary() {
		this.salary *= 1.1; 
	}
	
//	public double incrementSalary() {
//		return this.salary *= 1.1; 
//	}
	
	public final void incrementSalary(int amount) {
		this.salary += amount;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
