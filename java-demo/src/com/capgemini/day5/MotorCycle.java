package com.capgemini.day5;

public class MotorCycle extends Bicycle implements Motor{
	
	int gear;

	public MotorCycle(int speed) {
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

	@Override
	public void startEngine() {
		System.out.println("start Engine");
		
	}
	
//	public void speedUp() {
//		this.speed += 2;
//		
//	}
	
	

}
