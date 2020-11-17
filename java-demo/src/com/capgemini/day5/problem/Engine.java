package com.capgemini.day5.problem;

public class Engine {
	
	String make;
	
	
	
	public Engine() {
		super();
	}



	public Engine(String make) {
		super();
		this.make = make;
	}



	public void startEngine() {
		System.out.println("starting engine..");
	}



	@Override
	public String toString() {
		return "Engine [make=" + make + "]";
	}
	
	

}
