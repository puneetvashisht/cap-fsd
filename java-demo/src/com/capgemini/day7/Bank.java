package com.capgemini.day7;

import java.util.List;

public class Bank {
	
	int id;
	String name;
	int interestRate;
	
	List<Branch> branches;
	
	
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public Bank(int id, String name, int interestRate) {
		super();
		this.id = id;
		this.name = name;
		this.interestRate = interestRate;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", interestRate=" + interestRate + ", branches=" + branches + "]";
	}
	
	
	

}
