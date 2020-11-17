package com.capgemini.day5;

public interface Worker {
	
	public String commonMethod();
	
	public default String notCommon() {
		return "from Worker interface";
	}
	
	public double getSalary();

}
