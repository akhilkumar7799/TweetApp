package com.learn.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	System.out.println("inside try block");
	int num=100/0;
	System.out.println(num);
}
catch(NullPointerException e){
	System.out.println(e);
	
}
finally {
	System.out.println("finally block is excuited if try and catch block is execuited or not");
	
}
System.out.println("continue the code");
	}

}
