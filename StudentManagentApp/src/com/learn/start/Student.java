package com.learn.start;

public class Student {

	Integer studentid;
	String studentname;
	String studentphone;
	String studentcity;
	public Student(Integer studentid, String studentname, String studentphone, String studentcity) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	public Student(String studentname, String studentphone, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	
	
}
