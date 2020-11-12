package com.capgemini.day3;

import java.util.Scanner;

public class ScannerDemo {
	
	
	public static void m1() {
		// time delay
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter your age : ");
//		int age = sc.nextInt();
//		System.out.println(age);
		
		
		long startTime = System.currentTimeMillis();
		
		// performace of this method in terms of time
		m1();
		
		long endTime = System.currentTimeMillis();
	
		System.out.println(endTime - startTime);
		
	}

}
