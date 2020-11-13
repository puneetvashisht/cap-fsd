package com.capgemini.day4;

public class Vehicle {
	
	int maxSpeed;
	String color = "yellow";
	
	
	
	// Constructor
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Vehicle() {
	}
	public Vehicle(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}
	// Method
	public void incrementSpeed() {
		this.maxSpeed++;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

//	@Override
//	public String toString() {
//		return "Vehicle [maxSpeed=" + maxSpeed + "]";
//	}
	
	
	
	
}
