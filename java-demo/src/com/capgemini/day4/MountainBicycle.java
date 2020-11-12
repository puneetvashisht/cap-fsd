package com.capgemini.day4;

public class MountainBicycle extends Bicycle{
	
	int gear;

	public MountainBicycle(int speed) {
		super(speed);
		
	}

	@Override
	public String toString() {
		return "MountainBicycle [speed=" + speed + "]";
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		this.speed +=2;
	}
	
//	public void speedUp() {
//		this.speed += 2;
//		
//	}
	
	

}
