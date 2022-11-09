package com.learn.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> laptops=new LinkedHashSet<String>();
laptops.add("hp");
laptops.add("lenova");

laptops.add("dell");
laptops.add("hp");
laptops.add("hp");

Iterator<String> lap=laptops.iterator();
while(lap.hasNext());
System.out.println(lap.next());

	}
	

}
