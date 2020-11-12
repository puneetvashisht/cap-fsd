package com.capgemini.day4;

public abstract class Bicycle {
	
	int speed;
	
	
	
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}



	public abstract void speedUp() ;



	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + "]";
	}
	

}
