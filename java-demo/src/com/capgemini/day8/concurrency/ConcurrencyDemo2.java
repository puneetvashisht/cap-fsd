package com.capgemini.day8.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo2 {
	
	// Creates a thread pool .. thread are used and put back in pool


	public static void main(String[] args) {
		
	  ExecutorService service = new ThreadPoolExecutor(2, 4,
                0L, TimeUnit.MILLISECONDS,
//                new ArrayBlockingQueue<Runnable>(4));
                new LinkedBlockingQueue<Runnable>());
		
		
		for(int i=0;i<8;i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Runnning in thread : " + Thread.currentThread().getName());
				}
			};
			
			service.submit(runnable);
			
//			service.shutdown();
			
			
			
			// Thread t = new Thread(runnable);
		}
		


		service.shutdown();

	}

}
