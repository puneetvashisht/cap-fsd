package com.capgemini.day2;

import static java.lang.Math.round;

class Fruit{
	
	Integer id;
	String name;
	String color;
	
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
        return this.id.equals(f.id);
    }


	public void setColor(String color) {
		this.color = color;
	}

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
	
	
}


public class EqualsDemo {
	
	public static void main(String[] args) {
		
		String fruit = "apple";
//		Fruit fruit = new Fruit("apple");
//		fruit.setColor("red");
//		Fruit fruit1 = fruit;
		
		Employee e1 = new Employee(44, "Priya", round(34343.34));
		Employee e2 = new Employee(44, "Priya", round(34343.34));
		
		
		
		
		String fruit1 = "apple";
//		Fruit fruit1 = new Fruit("apple");
//		fruit.setColor("red");

		
		int x = 24;
		
//		if(e1.getName().equals(e2.getName())) {
		if(e1.equals(e2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		
		
	}

}
