package com.capgemini.day8;
//2. Runnable implementation
class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("running in thread: " + Thread.currentThread().getName());
	}
	
}

public class BasicThread{

	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
//			1. Create a Thread Object with Runnable
			Thread t = new Thread(new MyRunnable());
//			3. Start the thread
			t.start();
		}
		
		System.out.println("running main... in thread: " + Thread.currentThread().getName());
//		Thread t1 = new Thread(new MyRunnable());
//		t1.start();

	}

}
