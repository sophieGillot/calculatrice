package com.m2i.devops;

import static org.junit.Assert.*;

import org.junit.Test;

import com.m2I.devops.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a=2;
		int b=3;
		
		Calculator calc = new Calculator();
		int actual = calc.add(a, b) ;
		
		assertEquals(5, actual) ;
	}

	@Test
	public void testSub() {
		int a=5;
		int b=2;
		
		Calculator calc = new Calculator();
		int actual = calc.sub(a, b) ;
		
		assertEquals(3, actual) ;
	}
	
	@Test
	public void testMulti() {
		int a=5;
		int b=2;
		
		Calculator calc = new Calculator();
		int actual = calc.multi(a, b) ;
		
		assertEquals(10, actual) ;
	}
	
	@Test
	public void testIsPair() {
		int a=6;
		
		Calculator calc = new Calculator();
		boolean actual = calc.isPair(a) ;
		
		assertTrue(actual) ;
		
		int b=5;
		boolean actual1 = calc.isPair(b) ;
		
		assertFalse(actual1) ;
		
	}
	
	@Test
	public void testIsImpair() {
		int b=5;
		
		Calculator calc = new Calculator();
		boolean actual = calc.isPair(b) ;
		
		assertFalse(actual) ;
		
		
	}
}
