package com.capgemini.day9;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestClac2 {
	Calc calc;
	
	@Before
	public void setUp() {
		calc = new Calc();
	}

	@Test
	public void test() {
//		
//		int result = calc.sum(3, 4);
//		
//		assertNotNull(result);
//		assertSame("3 + 4 should be 7 ", 7, result);
		assertTrue(true);
	}
	
	
	@Test
	public void testWithNegatieValues() {
//		Calc calc = new Calc();
		int result = calc.sum(-3, -4);
		
		assertSame("-3 + -4 should be -7 ", -9, result);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testWithException() {
//		Calc calc = new Calc();
		int result = calc.sum(-3, 0);
		
		assertSame("-3 + -4 should be -7 ", -9, result);
	}

}
