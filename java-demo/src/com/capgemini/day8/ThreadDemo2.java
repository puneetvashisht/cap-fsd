package com.capgemini.day8;

public class ThreadDemo2 {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("in thread : " + Thread.currentThread().getName());
			}
		}).start();
		
//		t.start();

	}

}
