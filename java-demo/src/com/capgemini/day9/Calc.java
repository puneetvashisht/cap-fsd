package com.capgemini.day9;

public class Calc {
	
	int sum(int x, int y) {
		if(y==0) {
			throw new ArithmeticException("divide be zero");
		}
		return x + y;
	}

}
