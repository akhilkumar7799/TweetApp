package com.learn.oops;
 
 public class Employees extends Dev{
	 Integer bouns=35000;
	 Integer totalsalary=bouns+basesalary;
	 
	 public static void main(String[] args) {
		 
		 Employees emp=new Employees();
		 System.out.println("Totalsalary"+emp.totalsalary);
		
	}
 }
