package com.capgemini.day2;

//import static com.capgemini.day2.Employee.count;

public class Test {
	
//	Static sequence after class loading
//	1. Static initializers
//	2. Static blocks
//	3. static main by jvm
	
	int x;
	static int count = 0;
	
	
	
	static {
		System.out.println("Static initialization");
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	
	

	public Test(int x) {
		super();
		this.x = x;
		Test.count++;
	}




	public static void main(String[] args) {
//		count = 23;
		Test t1 = new Test(23);
		t1.x +=1;
//		Test.count +=10;
//		System.out.println(t1.x);
		System.out.println(count);
		
		Test t2 = new Test(12);
//		System.out.println(t2.x);
		System.out.println(count);

	}

}
