package com.capgemini.day5;

public class TestCalc {

	public static void main(String[] args) {
		
		// Super type referencing subtype object
//		Calc calc = new CalcImpl();
		
		Calc calc1 = new Calc() {

			@Override
			public int add(int oper1, int oper2) {
				return oper1 + oper2;
			}

			@Override
			public int sub(int oper1, int oper2) {
				return oper1 - oper2;
			}
		
		};
		

//		Calc.startValue = 34;
		
		System.out.println(calc1.add(3,4));

	}

}
