package com.learn.exception;

public class Eligiblity {
	
	public static void eligiblity(Integer exp) {
		if(exp<=10) 		{
	throw new ArithmeticException("this persion is not eligibale he is seniour system architect ");
		} 
		else {
			System.out.println("this persion is eligible");
		}
	}
	public static void main(String[] args) {
		eligiblity(05);
	}
}
