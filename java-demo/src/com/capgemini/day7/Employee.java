package com.capgemini.day7;

public class Employee implements Comparable<Employee>{
	
	Integer id;
	String name;
	Double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
//		if(this.id<o.id) {
//			return -1;
//		}
//		else if(this.id == o.id) {
//			return 0;
//		}
//		else {
//			return 1;
//		}
		if(this.id.equals(o.id)) {
			return this.name.compareTo(o.name);
		}
		
		return this.id.compareTo(o.id);
	
	}
	
	
	

}
