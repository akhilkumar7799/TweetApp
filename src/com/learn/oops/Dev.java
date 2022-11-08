package com.learn.oops;

public class Dev {

		
		Integer basesalary=55000;
		void totalSalary(Integer bs,Integer bouns) {
			Integer total=bs+bouns;
			System.out.println(total);
		}

		void totalSalary(Integer bs,Integer bouns,Integer insentive) {
			Integer total=bs+bouns+insentive;
			System.out.println(total);
			
		}
		void working() {
			System.out.println("Dev cls working method");
		}

}
