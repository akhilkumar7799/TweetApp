package com.learn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.learn.junit.Calculator;

public class BeforeEachTestCase {
	Calculator cal;
	@BeforeEach
	public void init() {
		cal=new Calculator();
		System.out.println("before each method is excuteing");
	}
	
	@AfterEach
	public void after() {
		System.out.println("after each method is executing");
	}

	@Test
	public void testMethod() {
		
		int sum=cal.add(10,10);
		assertEquals(20, sum);

		System.out.println("total sum is :"+sum);
	}
	@Test
	public void testSubMethod() {
	Integer total=cal.subtraction(30,20);
	assertEquals(10, total);
	System.out.println("subtraction :"+total);
		
	}
	@Test
	public void testMulMethod() {
		Integer total=cal.multiplication(2,4);
		assertEquals(8, total);

		System.out.println("multiplication :"+total);
	}
}
