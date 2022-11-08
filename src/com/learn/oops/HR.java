package com.learn.oops;

public class HR extends Dev{
Integer bouns=15000;
Integer total=bouns+basesalary;

void working() {
	System.out.println("HR cls working method");
}
public static void main(String[] args) {
	HR hr=new HR();
	System.out.println("HR total salary ="+ hr.total);
	hr.totalSalary(hr.basesalary, hr.bouns);
hr.working();
}

}
