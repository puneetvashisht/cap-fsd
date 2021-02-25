package com.capgemini.day8.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



class SumTask implements Callable<Integer>{

	int i;
	static int total = 0;

	public SumTask(int i) {
		super();
		this.i = i;
	}

	@Override
	public Integer call() {
		total+=i;
		return total;
	}
	
}

public class FindSumDemo {
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		ExecutorService service = Executors.newFixedThreadPool(2);
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for(int i= 0; i<10 ; i++) {
			Callable<Integer> task = new SumTask(i);
			Future<Integer> future = service.submit(task);
			System.out.println(future.get());
		}
		
		
		
		
		
		System.out.println("alls well!!");

	}

}
