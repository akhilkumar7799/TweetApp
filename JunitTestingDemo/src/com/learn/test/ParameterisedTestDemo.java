package com.learn.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterisedTestDemo {

	
	@ParameterizedTest(name= "{index} -Run with the args= {0}")
	@ValueSource(ints= {1,3,5,7})
	public void valueSourceTest(int args) {
		System.out.println(args);
	}
	
	//...........Enumsource.......
	enum Tv{
		lg,samsung,pansonic
	}
	
	@ParameterizedTest
	@EnumSource(Tv.class)
	public void enumSourceTest(Tv tv) {
		System.out.println(tv);
		
	}
	
	
	//..........methodsource..........
	
	
	private static String []cars(){
		return new String[] {"marthi","swift","honda"};
	}
	
	@ParameterizedTest
	@MethodSource("cars")
	public void methodsourceTest(String cars) {
		System.out.println(cars);
		
	}
//...................csv.......
	@ParameterizedTest
	@CsvSource({"akhil","Raghava","mahesh","uday"})
	public void csvSourceTest(String names) {
		
		System.out.println(names);
	}
}
