package com.learn.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> customers=new PriorityQueue<>();	

	customers.add("ammit");
	customers.add("akhil");
	customers.add("mahesh");
	customers.add("narendra");
	customers.add("Raja");
	customers.add("Raghava");
	customers.add("suresh");
	System.out.println("LEAD is "+customers.peek());
	
	Iterator<String> itr=customers.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

			
	
	}

}
