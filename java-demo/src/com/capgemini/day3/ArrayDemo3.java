package com.capgemini.day3;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		String str [] = {"Ravi", "Amit", "Priya", "Neha", "Rahul"};
		
		
		
		
		for(String s : str) {
			System.out.println(s);
		}
		
		Arrays.sort(str);
		
		int result = Arrays.binarySearch(str, "Puneet");
		System.out.println(result);
		
//		str[result];
		
		
		for(String s : str) {
			System.out.println(s);
		}

	}

}
