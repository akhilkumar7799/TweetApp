package com.learn.start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean addaStudentTODB(Student st) {
		boolean status=false;
		try {

		Connection con=ConnectionProvider.createC();
		String query1=" insert into students(stdname,phonenumber,city) values(?,?,?)";
		
			PreparedStatement pst=con.prepareStatement(query1);
			pst.setString(1, st.studentName);
			pst.setString(2, st.studentPhone);
			pst.setString(3, st.studentCity);
			
			pst.executeUpdate();
			status=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	public static boolean deleteStudentById(Integer id) {
		
		boolean status=false;
		try {
		Connection con=ConnectionProvider.createC();
		String query2="delete from students where stdid=?";
		
			PreparedStatement pst=con.prepareStatement(query2);
			pst.setInt(1, id);
			
			pst.executeUpdate();
			status=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;

	}
	
	public static boolean displayAllStudents( ) {
		boolean status=false;
		try {
			Connection con=ConnectionProvider.createC();
			String query3="select * from students";
			
				Statement st=con.createStatement();
				ResultSet set=st.executeQuery(query3);
				while(set.next()) {
					Integer id=set.getInt(1);
					String name=set.getString(2);
					String phone=set.getString(3);
					String city=set.getString("city");
					
					System.out.println("stdID :"+id);
					System.out.println("stdname :"+name);

					System.out.println("stdphone :"+phone);

				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return status;
		
	}

}
