package com.capgemini.day4;

public class TestBicycle {

	public static void main(String[] args) {
//		Bicycle b = new Bicycle(5);
		RoadBicycle rb = new RoadBicycle(5);
		MountainBicycle mb = new MountainBicycle(5);
		
		Bicycle bicycles[] = { rb, mb};
		
		for(Bicycle bicycle: bicycles) {
			System.out.println(bicycle);
			bicycle.speedUp();
//			bicycle.gear
			System.out.println(bicycle);
		}
		
		
		
		
//		System.out.println(mb);
//		mb.speedUp();
//		System.out.println(mb);

	}

}
