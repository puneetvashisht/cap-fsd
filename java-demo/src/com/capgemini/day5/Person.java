package com.capgemini.day5;

public interface Person {
	
	public String commonMethod();
	
	
	// exception to rule -- default methods are allowed to be implemented
	public default String notCommon() {
		return "from Person interface";
	}
	
	public String getName();
	public int getAge();

}
