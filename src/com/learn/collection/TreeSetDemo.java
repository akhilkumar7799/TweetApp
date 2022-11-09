package com.learn.collection;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> st=new TreeSet<String>();

st.add("akhil");
st.add("mahesh");
st.add("raja");
st.add("ragahav");
st.add("amar");

Iterator<String> names=st.iterator();
while(names.hasNext()) {
	System.out.println(names.next());
}

	
	
	}

}
