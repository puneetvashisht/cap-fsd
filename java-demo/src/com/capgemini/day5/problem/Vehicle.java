package com.capgemini.day5.problem;

public abstract class Vehicle {
	
	int maxSpeed;
	String color;
	Engine engine;
	
	public void startVehicle() {
		this.engine.startEngine();
		System.out.println("starting vehicle...");
	}
	
	public Vehicle(int maxSpeed, String color, Engine engine) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.engine = engine;
	}
	public Vehicle() {
		super();
	}
	
	

}
