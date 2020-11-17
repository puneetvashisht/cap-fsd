package com.capgemini.day5;

public class Employee implements Person, Worker {
	
	private int id;
	private String name;
	private double salary;
	private int age;
	
	
	//has-a relationship
	private Address address;
	
	
	
	
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Employee(int id, String name, double salary, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


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
		super();
	}


	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public void incrementSalary(int amount) {
		this.salary += amount;
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}

	

	@Override
	public String commonMethod() {
		
		return "our common method implementation";
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", address=" + address
				+ "]";
	}


	@Override
	public String notCommon() {
		
		// if you want Person implementation
		return Person.super.notCommon() + Worker.super.notCommon();
		
		// if you want Worker implemetation
//		return Worker.super.notCommon();
	}
	
	
	

}
