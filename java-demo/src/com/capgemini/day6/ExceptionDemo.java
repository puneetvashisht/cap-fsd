package com.capgemini.day6;

public class ExceptionDemo {
	
	
	public static void m2(String str) {
		
//		if(condition)
//		m2(str);
//		int x = 3;
//		int result = x/0;
		
		try {
		// error prone code is
			System.out.println(str.substring(2,7));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Handling code");
			System.out.println(str.substring(2, str.length()));
		}
		finally {
			System.out.println("finally always executes");
		}
		
		System.out.println("in m2 method");
		
	}
	
	public static void m1(String str) {
		m2(str);
		System.out.println("in m1 method");
	}
	

	public static void main(String[] args) {
		String str = "testing";
		m1(str);
		System.out.println("Allz well.. that ends well");

	}

}
