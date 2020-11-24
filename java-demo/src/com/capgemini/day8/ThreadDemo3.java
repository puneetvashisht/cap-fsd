package com.capgemini.day8;

import java.lang.reflect.Method;

class Count {
	static int i = 0;
}

class TestRunnable implements Runnable{
	
	int i = 0;
	// t1 this key obj1

	public  synchronized void incrementValue() {
		i++;
		System.out.println(Thread.currentThread().getName());
		System.out.println(i);
	}
//	t2 this obj2
	public  synchronized void decrementValue() {
		i--;
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
		
		// Class level object
		System.out.println();
		
		Method methods[] = TestRunnable.class.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
		for(int i=0;i<1;i++) {	
			
			Thread t = new Thread(runnable);
			t.start();
		}
		

	}

}
