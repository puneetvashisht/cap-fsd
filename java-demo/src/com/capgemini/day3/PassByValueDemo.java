package com.capgemini.day3;

class MyNumber{
	int i;
	

	public MyNumber(int i) {
		super();
		this.i = i;
	}

	@Override
	public String toString() {
		return "MyNumber [i=" + i + "]";
	}
	
	
}


public class PassByValueDemo {
	
	// passing by reference
	public static void m1(MyNumber obj) {
		// passing by value
//		public static void m1(int z) {	
		obj.i = 43;
	}
	

	public static void main(String[] args) {
//		int x = 34;
		MyNumber x = new MyNumber(34);
		
		m1(x);
		
		System.out.println(x);

	}

}
