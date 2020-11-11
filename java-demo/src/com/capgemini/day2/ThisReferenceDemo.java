package com.capgemini.day2;

public class ThisReferenceDemo {
	
	int id;
	public ThisReferenceDemo(int id) {
		this.id = id;
	}
	
	public void m1() {
		System.out.println(this.id);
	}

	public static void main(String[] args) {
		
		ThisReferenceDemo t1 = new ThisReferenceDemo(23);
		t1.m1();
		
		new ThisReferenceDemo(2).m1();
		
//		System.out.println(this);

	}

}
