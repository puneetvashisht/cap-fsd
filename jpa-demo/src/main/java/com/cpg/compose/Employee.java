package com.cpg.compose;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="EMP_COMPOSE")
@Table(name="EMP_COMPOSE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String lastName;
	double salary;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Address> addresses;
	
	public Employee() {
		
	}
	public Employee( String name, String lastName, double salary, List<Address> addresses) {
		super();
//		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
		this.addresses = addresses;
	}

	
	
	
	
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", salary=" + salary + "]";
	}



}
