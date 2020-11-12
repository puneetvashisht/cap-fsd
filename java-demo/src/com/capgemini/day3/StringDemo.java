package com.capgemini.day3;

public class StringDemo {

	public static void main(String[] args) {
        String str1 = "Hello";
        
        str1 = "World";
        
        
        System.out.println(str1.hashCode());
        
//        String str = str1.concat( " World!!");
        System.out.println(str1.indexOf('l'));
        
        
        
        String str2 =  new String(str1);

        if(str1 == str2) {
        	System.out.println("Equal");
        }
        else {
        	System.out.println("Not equal");
        }
        
	}
}
