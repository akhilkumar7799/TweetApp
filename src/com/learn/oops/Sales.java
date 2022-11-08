package com.learn.oops;

public class Sales extends Dev {
	
	Integer bouns=30000;
	Integer insentive;
	public static void main(String[] args) {
		
		Sales s=new Sales();
		s.insentive=40000;
		s.totalSalary(s.basesalary,s.bouns, s.insentive);
	}

}
