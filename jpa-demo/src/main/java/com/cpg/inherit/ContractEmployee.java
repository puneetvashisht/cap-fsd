package com.cpg.inherit;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee{
	
	Double payPerHour;

	public ContractEmployee() {}
	
	public ContractEmployee(String name, String lastName, Double payPerHour) {
		super(name, lastName);
		this.payPerHour = payPerHour;
	}

	@Override
	public String toString() {
		return "Contract Employee [payPerHour=" + payPerHour + ", id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	

	
}
