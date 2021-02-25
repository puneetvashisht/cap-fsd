package com.capgemini.day8.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		return "returned from a thread";
	}
	
}

public class FutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		

		ExecutorService service = Executors.newFixedThreadPool(2);
		Callable<String> task = new MyCallable();
		
		Future<String> future = service.submit(task);
		
		System.out.println(future.get());
		
		System.out.println("alls well!!");

	}

}
