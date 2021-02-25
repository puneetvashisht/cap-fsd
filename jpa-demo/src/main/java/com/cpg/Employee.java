package com.cpg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String lastName;
	Double salary;
	
	public Employee() {
		
	}
	public Employee( String name, String lastName, double salary) {
		super();
//		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}
	public Employee(int id, String name, String lastName, double salary) {
		this(name, lastName, salary);
		this.id = id;
//		this.name = name;
//		this.lastName = lastName;
//		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", salary=" + salary + "]";
	}


}
