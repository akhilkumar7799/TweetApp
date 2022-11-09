package com.learn.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> names=new HashSet<String>();

names.add("akhil");
names.add("mahesh");
names.add("amar");
names.add("uday");

	Iterator<String> name=names.iterator();
	while(name.hasNext());
	System.out.println(name.next());

}
}
