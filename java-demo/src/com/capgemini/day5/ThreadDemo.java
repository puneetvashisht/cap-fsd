package com.capgemini.day5;

//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("running in a thread");
//	}
//}

public class ThreadDemo {

	public static void main(String[] args) {
		// Object creation using subclass
//		Runnable runnable = new MyRunnable();
		
		
		// Object creation without using a Subclass.. name of class -- anonymous
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("in a thread.. anonymous class");
			}	
		};
		
		//Create threads
		Thread t = new Thread(runnable);
		t.start();

	}

}
