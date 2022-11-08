package com.learn.oops;

public class Student {
	
	String StdName;
	Integer Stdid;
  Address address;
	
	public void  addStudent(String name,Integer stdid,Address address) {
		this.StdName=name;
		this.Stdid=stdid;
		this.address=address;
		
	}
	void displayStudent() {
		System.out.println(StdName+" "+address.city+" "+address.state);
	}
public static void main(String[] args) {
	Address add=new Address("anantapur", "ap", "india");
	
	
	Student st=new Student();
	st.addStudent("mahesh", 448, add);
	st.displayStudent();
	
	
	
}
}
