package com.capgemini.day5.problem;

public class Car extends Vehicle {

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int maxSpeed, String color, Engine engine) {
		super(maxSpeed, color, engine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", color=" + color + ", engine=" + engine + "]";
	}
	
	

}
