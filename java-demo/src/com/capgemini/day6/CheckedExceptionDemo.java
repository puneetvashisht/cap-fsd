package com.capgemini.day6;

public class CheckedExceptionDemo {
	
	
	// throws is like a warning to caller method
	public static void m2(String str) throws WrongInputException {
		
		if(str.length() <= 4) {
			
			//explicitly throw an exception object
			
//			Thread.sleep(3000);
			
//			try {
//				throw new Exception("Minium string length is 4");
			throw new WrongInputException("string value passed is less than 4 in length");
//			}
//			catch(Exception e) {
//				
//			}
		}
		
		System.out.println("in m2 method");
		
	}
	
	public static void m1(String str) {
		try {
			m2(str);	
		} 
		// specific exception first
		catch (WrongInputException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("always executed");
		}
		
		
		System.out.println("in m1 method");
	}
	

	public static void main(String[] args) {
		String str = "tes";
//		try {
			m1(str);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Allz well.. that ends well");

	}

}
