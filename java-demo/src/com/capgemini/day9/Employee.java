package com.capgemini.day9;

public class Employee {
	int id;
	String name;
	String lastName;
	double salary;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
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
