package com.capgemini.day8;

class TestRunnable implements Runnable{
	
	int i = 0;
	
	public void incrementValue() {
		i++;
		System.out.println(Thread.currentThread().getName());
		System.out.println(i);
	}
	
	@Override
	public void run() {
		// Synchronized block allows only one thread at a time
		
		incrementValue();
		//race condition.. controlling threads to enter one at time
//		synchronized(this) {
//			
//		}
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {

		TestRunnable runnable = new TestRunnable();
		
		for(int i=0;i<100000;i++) {	
			
			Thread t = new Thread(runnable);
			t.start();
		}
		

	}

}
