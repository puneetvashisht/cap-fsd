package com.cpg.inherit;

import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Employee{
	
	Double salary;

	public RegularEmployee() {}
	
	public RegularEmployee(String name, String lastName, Double salary) {
		super(name, lastName);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	

	
}
