package com.capgemini.day2;


// Object class is the super parent 
public class Employee {
	
	int id;
	private String name;
	private double salary;
	
	static int count;
	
//	eligibilityAge
	final static int ELIGIBILITY_AGE = 18;
	
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
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(int id, String name, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
		this(id, name);
		this.salary = salary;
	}
	
	
	
	
	

	@Override
	public boolean equals(Object obj) {
		
		Employee other = (Employee) obj;
		if (id != other.id) {
			return false;
		}	
		else {
			if(this.name.equals(other.name)) {
				return true;
			}
			else {
				return false;
			}
			
		}
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
