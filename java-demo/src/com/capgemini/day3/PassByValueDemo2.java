package com.capgemini.day3;




public class PassByValueDemo2 {
	
	
	public static void m1(StringBuilder z) {
		//copy of value in x
//		z = 43;
		z.append("change");
	}
	

	public static void main(String[] args) {
//		int x = 34;
		StringBuilder x = new StringBuilder("test");
		// Call to m1, passing x as primitive value
		m1(x);
		
		System.out.println(x);

	}

}
