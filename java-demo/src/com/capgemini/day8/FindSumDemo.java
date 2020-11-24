package com.capgemini.day8;

class SumTask implements Runnable{

	int i;
	static int total = 0;

	public SumTask(int i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		synchronized(SumTask.class) {
			total = total + i;
		}
		
//		return total;
	}
	
}

public class FindSumDemo {
	

	public static void main(String[] args) {


		for(int i= 0; i<50 ; i++) {
			Thread t = new Thread(new SumTask(i));
			t.start();
		}
		
		System.out.println(SumTask.total);

	}

}
