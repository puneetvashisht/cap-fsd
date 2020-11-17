package com.capgemini.day5;

public abstract class Bicycle {
	
	int speed;
	
	
	
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}

	// common in all subclasses or implementation
	public void speedDown() {
		--this.speed;
	}

	public abstract void speedUp() ;



	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + "]";
	}
	

}
