package com.learn.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> link=new LinkedList<String>();
		
		link.add("mango");
		link.add("apple");
		link.add("banana");
		
		Iterator<String> it=link.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
