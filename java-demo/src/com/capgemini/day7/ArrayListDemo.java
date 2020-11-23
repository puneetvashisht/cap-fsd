package com.capgemini.day7;

import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Created list 
//		ArrayList myList = new ArrayList();
		List<String> myList = new LinkedList<>();

//		1000 1004 1008 ..
//		Arraylist . index based access
//		1000 + (4 * 50) = 1200
		// add to list
		myList.add("first item");
		myList.add("second item");
		myList.add(3 + "");
		myList.add(1, "this will be second element");
		
		myList.remove(2);
		myList.set(1, "this will be the replaced element");
		
		System.out.println(myList.get(1));
		
		for(String s : myList) {
			System.out.println(s.toUpperCase());
		}
		
		//iterate list
//		for(Object obj : myList) {
//			System.out.println(obj);
//			String s = (String)obj;
//			System.out.println(s.toUpperCase());
//			
//		}
		
		//printing out list
		System.out.println(myList);

	}

}
