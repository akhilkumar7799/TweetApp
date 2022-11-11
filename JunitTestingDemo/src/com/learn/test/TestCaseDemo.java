package com.learn.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.learn.junit.Calculator;

public class TestCaseDemo {

	@Test
	public void testMethod() {
		Calculator cal=new Calculator();
		
		int sum=cal.add(10,10);
		assertEquals(20, sum);

		System.out.println("total sum is :"+sum);
	}
	@Test
	public void testSubMethod() {
	Calculator cal=new Calculator();
	Integer total=cal.subtraction(30,20);
	assertEquals(10, total);
	System.out.println("subtraction :"+total);
		
	}
	@Test
	public void testMulMethod() {
		Calculator cal=new Calculator();
		Integer total=cal.multiplication(2,4);
		assertEquals(8, total);

		System.out.println("multiplication :"+total);
	}
}
