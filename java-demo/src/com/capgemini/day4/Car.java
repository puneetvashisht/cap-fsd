package com.capgemini.day4;

public class Car extends Vehicle{
	
	// In addition to Vehicle fields
	int tyres;
	
	String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car() {
		
	}
	
//	public Car(int maxSpeed, int tyres) {
////		this.maxSpeed = maxSpeed;
//		super(maxSpeed);
//		this.tyres = tyres;
//	}
	
	

	public int getTyres() {
		return tyres;
	}

	public Car(int maxSpeed, int tyres) {
		super(maxSpeed);
		this.tyres = tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "Car [tyres=" + tyres + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	
	
	
	
//	public Car() {
//		super();
//	}

}
