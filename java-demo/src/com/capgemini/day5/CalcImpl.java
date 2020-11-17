package com.capgemini.day5;

public class CalcImpl implements Calc{

	@Override
	public int add(int oper1, int oper2) {
		return oper1 + oper2;
		
	}

	@Override
	public int sub(int oper1, int oper2) {
		return oper1 - oper2;
		
	}

}
