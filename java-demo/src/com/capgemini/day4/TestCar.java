package com.capgemini.day4;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Car();
		car.maxSpeed = 344;
		System.out.println(car.maxSpeed);
		car.incrementSpeed();
		System.out.println(car.maxSpeed);
		
		car.setTyres(4);
		
		System.out.println(car.getTyres());
		
		Car car1 = new Car(400, 4);
		car1.setColor("metallic gray");
		System.out.println(car1.toString());
		

	}

}
