package com.capgemini.day3;

public class MutableStringDemo {
	
	
	public static void main(String[] args) {
		// Thread safe but indroduces overhead
//		StringBuffer sb = new StringBuffer("");
		
		// Not thread safe.. use it in single thread cases.. no synchronization overhead
		StringBuilder sb = new StringBuilder("");
		
//		sb.append("def").reverse().append("test").replace(1, 3, "xyz");
		
		System.out.println("sb = " + sb.toString()); 
		
		
		

//		String str = "";
		for(int i=0; i<10; i++) {
//			string immutable, create a new string object		
			sb.append(i);
			// new object on each iteration
//			str += i; 
		}
		
		String str = sb.toString();
//		sb.
		System.out.println(str.hashCode());
		
		
		sb.append("last");
		String str1 = sb.toString();
		System.out.println(str1.hashCode());
	}
}
