package com.capgemini.day8.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
//		queue.add("first");
//		queue.add("second");
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					queue.add("1");
					queue.add("2");
				}
	
			}
		});
		
		
//		queue.
		try {
			System.out.println("waiting for elements to be produced..");
			while(true) {
				System.out.println(queue.take());
			}
			
//			System.out.println(queue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
