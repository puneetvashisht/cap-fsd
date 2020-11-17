package com.capgemini.day5.problem;

public class Plane extends Vehicle {
	
	int maxAltitude;

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plane(int maxSpeed, String color, Engine engine, int maxAltitude) {
		super(maxSpeed, color, engine);
		this.maxAltitude = maxAltitude;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Plane [maxAltitude=" + maxAltitude + ", maxSpeed=" + maxSpeed + ", color=" + color + ", engine="
				+ engine + "]";
	}

	
	

}
