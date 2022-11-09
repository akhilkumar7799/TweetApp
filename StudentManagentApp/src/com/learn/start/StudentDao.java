package com.learn.start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
