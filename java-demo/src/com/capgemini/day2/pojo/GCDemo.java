package com.capgemini.day2.pojo;

public class GCDemo {
	
	
	public static String trimString(String str) {
		return str.trim();
	}
	
	public static void main(String[] args) {
		// Immutable
		String str = "";
		
		// Mutable
		StringBuffer sb = new StringBuffer("");
		
		for(int i=0; i<100000; i++) {
//			string immutable, create a new string object
//			str += i;
			
//			if(i == 50000 ) {
//				System.gc();
//			}
			
			sb.append(i);
		}
		
		
		System.out.println(sb.toString());
		
//		String str = new String(" test");
//		System.out.println(str);
//		
//		String str1 =  trimString(str);
//		
//		System.out.println(str1);
		
	}

}
