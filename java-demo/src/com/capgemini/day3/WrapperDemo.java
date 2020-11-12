package com.capgemini.day3;



public class WrapperDemo {
	
	 

	public static void main(String[] args) {
		
		int i = 0;
		 Integer j = null;
		
		i = 34;
//		j =  new Integer(34);
		
		// Auto boxing-- auto converting primitive to a wrapper type
		j = i;
		
		
		j =  new Integer(34);
		
		// Auto unboxing -- auto converting wrapper into primitive
		i = j;
		
		Integer k = new Integer(34) * new Integer(56);
		
		int z = 34 * 56;
		
		
		System.out.println(Integer.MAX_VALUE);

	}

}
