package com.capgemini.day8;

class MyTask implements Runnable{
	
	Display display;
	String name;

	
	public MyTask(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}


	@Override
	public void run() {
		display.wish(name);
	}
	
}

public class TestDisplay {

	public static void main(String[] args) {
		Display display = new Display();
		for(int i=0;i<10;i++) {
			MyTask task = null;
			if(i%2 != 0) {
				 task = new MyTask(display, "Kolhi");
			}
			else {
				task = new MyTask(display, "Dhoni");
			}
			
			Thread t = new Thread(task);
			t.start();
		}
		
		

	}

}
