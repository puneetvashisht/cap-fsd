package com.capgemini.day8.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		
		// Creates a thread pool .. thread are used and put back in pool
		ExecutorService service = Executors.newFixedThreadPool(20);
		
		
		for(int i=0;i<1000;i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					System.out.println("Runnning in thread : " + Thread.currentThread().getName());
				}
			};
			
			service.submit(runnable);
			
			// Thread t = new Thread(runnable);
		}

	}

}
