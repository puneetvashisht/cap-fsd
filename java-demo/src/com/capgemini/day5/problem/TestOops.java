package com.capgemini.day5.problem;

public class TestOops {

	public static void main(String[] args) {


		Engine engine = new Engine("Ford");
		Engine engine1 = new Engine("Hawk");
		Car car = new Car(500, "red", engine);
		Car car1 = new Car(600, "black", engine1);
		
		
		// 
		Engine engine2 = new PlaneEngine("Boeing", 34343);
		Plane plane = new Plane(1000, "white", engine2, 10000);
		
		Vehicle vehicles[] = {car, car1, plane};
		for(Vehicle v : vehicles) {
			System.out.println(v);
			v.startVehicle();
		}
		
//		System.out.println(car);
//		System.out.println(car1);
//		System.out.println(plane);
		
		
		

	}

}
