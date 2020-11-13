package com.capgemini.day4;

public class RoadBicycle extends Bicycle{

	public RoadBicycle(int speed) {
		super(speed);
		
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}
	
	public void speedUp() {
		this.speed += 1;
		
	}
	
	

}
