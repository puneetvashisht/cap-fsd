package com.capgemini.day3;

import com.capgemini.day2.Employee;

public class WrapperDemo2 {

	public static void main(String[] args) {
		
		// casting
		double d = 344.34;
		int i = 129;
		
		byte b = 34;
		
		// Upcasting 
//		i = b;
		Object o = new String("");
		
		// Downcasting .. explicit
//		b = (byte)i;
		if(o instanceof Employee) {
			Employee emp = (Employee)o;
			System.out.println(emp);
		}
		else {
			System.out.println("not similar types");
		}
		
		
		
		d = i;
//		i = (int)d;
		
		
		System.out.println(d);
		
		
		
		
		
		
		
		

	}

}
