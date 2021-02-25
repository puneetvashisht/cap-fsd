package com.capgemini.day4;

public class Manager extends Employee {
	
	int resources;

	public Manager(int id, String name, double salary, int resources) {
		super(id, name, salary);
//		super();
		this.resources = resources;
	}
	
	public void approveLeaves() {
		System.out.println("approve leave!!");
	}

	@Override
	public String toString() {
//		super.toString();
		
		return "Manager [resources=" + resources + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
	
	
	
	

}
