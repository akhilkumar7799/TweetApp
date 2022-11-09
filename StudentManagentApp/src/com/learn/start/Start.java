package com.learn.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
System.out.println("hello world");

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true) {
	
	System.out.println("press 1 to add a student");
	System.out.println("press 2 to delete a student");
	System.out.println("press 3 to  display a student");
	System.out.println("press 4 to exit the app");
int press=Integer.parseInt(br.readLine());
if(press==1) {
	//add student
	System.out.println("enter student's fullname :") ;
	String name=br.readLine();

    System.out.println("enter student's phonenumber :") ;
	String phonenumber=br.readLine();
	
System.out.println("enter student's city:") ;
	
	String city=br.readLine();
	
	
	Student st=new Student(name,phonenumber, city);
	System.out.println(st);
	
	boolean status=StudentDao.addaStudentTODB(st);
	
	if(status) {
		System.out.println("student added successfully");
	}
	else {
		System.out.println("student not added please check it");
	}
	
	
}
else if(press==2) {
	//delete student
}
else if(press==3) {
	//display a student
}
else if(press==4) {
	//exit the app
}
else {
	
}
System.out.println("Thanks for using student managent app");
}
}

}
