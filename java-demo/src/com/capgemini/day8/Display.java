package com.capgemini.day8;

public class Display {

	public void wish(String name) {
		
		synchronized(this) {
			System.out.print("Hello ");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name + " : " + Thread.currentThread().getName());
		}
		
		
	}
}
