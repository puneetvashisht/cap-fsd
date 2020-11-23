package com.capgemini.day7;

import java.util.ArrayList;
import java.util.List;


class Fruit{

	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
	
	
}
public class ArrayListOps {

	public static void main(String[] args) {
		
//		List<String> fruits = new ArrayList<>();
//		
//		fruits.add("apple");
//		fruits.add("orange");
//		fruits.add("pineapple");
		
		List<Fruit> fruits = new ArrayList<>();
		
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("orange"));
		fruits.add(new Fruit("pineapple"));
		
		
//		boolean isFound = fruits.contains("banana");
		Fruit fruitToBeSearched = new Fruit("apple");
		boolean isFound = fruits.contains(fruitToBeSearched);
		System.out.println(isFound);
		
		

	}

}
