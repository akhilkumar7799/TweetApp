package com.learn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		
list.add("kullayappa");
list.add("mahesh");
list.add("uday");
list.add("amar");
list.add("akhil");

System.out.println(list);

Iterator<String> itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
