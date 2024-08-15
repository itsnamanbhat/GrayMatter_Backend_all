package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoOnJDBC {
	public static void main (String args[]) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		String url="jdbc:mysql://localhost:3306/graymatterdb";
		String username="root";
		String password ="password";
		
		Connection con=DriverManager.getConnection(url,username,password);
		 System.out.println("Connection established");
	 
//		 Statement st= con.createStatement();
//		 String query= "select first_name,employee_id from employees ";
//		 ResultSet rs=st.executeQuery(query);
//		 
//		 while(rs.next()) {
//			 System.out.println(rs.getString(1)+" "+rs.getInt(2));
//		 }
		 
		 
		
		 String query2 ="insert into regions values(?,?)";
		 PreparedStatement ps=con.prepareStatement(query2);
		 ps.setInt(1, 7);
		 ps.setString(2, "Antarctica");
		int row= ps.executeUpdate();
		 System.out.println(row);
		 
		 ps.close();
		 Statement st= con.createStatement();
		 String query1= "select * from regions ";
		 ResultSet rs=st.executeQuery(query1);
		 
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+" "+rs.getString(2));
		 }
		 rs.close();
		 st.close();
		 
		 con.close();
		 
	}
	
	
}
