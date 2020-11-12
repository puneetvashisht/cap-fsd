package com.capgemini.day3;

public class ArraysDemo {

	public static void main(String[] args) {
		
//		1000 1004 1008 ....
		
//		int scores[] = new int[10];
		
		int scores[] = {34, 34, 55, 56, 45, 45, 45};
		
//		System.out.println(scores[9]);
		
		for(int score: scores) {
			System.out.println(score);
		}
		
		String weekdays[] = {"Mon", "Tues"};
		for(String weekday: weekdays) {
			System.out.println(weekday);
		}
		
		
//		for(int i=0; i<= scores.length ; i++ ) {
////			scores[i] = i+1;
//			System.out.println(scores[i]);
//		}

	}

}
