package com.capgemini.day6;

public class UnCheckedExceptionDemo {
	
	
	// throws is like a warning to caller method
	public static void m2(String str) {
		
		if( str.length() <= 4) {
			
			//explicitly throw an exception object
				throw new RuntimeException("Minium string length is 4");

		}
		
		System.out.println("in m2 method");
		
	}
	
	public static void m1(String str) {
		
			m2(str);
		
		System.out.println("in m1 method");
	}
	

	public static void main(String[] args) {
		String str =null;
		try {
			m1(str);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Allz well.. that ends well");

	}

}
