package com.capgemini.day7;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

//		List<String> myList = new LinkedList<>();
		
		// unique elements
		Set<String> mySet = new HashSet<>();
		
		mySet.add("first item");
		mySet.add("second item");
		boolean result = mySet.add("second item");
		System.out.println("Add method success : " + result);
		mySet.add(3 + "");
		
		//index dont work with sets
//		myList.add(1, "this will be second element");

		
		for(String s : mySet) {
			System.out.println(s.toUpperCase());
		}
		
		//printing out list
		System.out.println(mySet);

	}

}
