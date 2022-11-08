package com.learn.exception;

public class TryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int num=100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		System.out.println("continue");
	}

}
