package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsingJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		String url= "jdbc:mysql://localhost:3306/graymatterdb";
		String username= "root";
		String password="password";
		
		Connection con= DriverManager.getConnection(url,username,password);
		System.out.println("Connection established");
		
		Statement st= con.createStatement();
		String query="update regions set region_name=? where region_id=? ";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, "bharath");
		ps.setInt(2, 6);
		ps.executeUpdate();
		System.out.println("updated successfully");
		
		query ="delete from regions where region_id=?";
		ps=con.prepareStatement(query);
		ps.setInt(1, 7);
		ps.executeUpdate();
		System.out.println("row deleted");
		
		String query1= "Select * from regions";
		ResultSet rs= st.executeQuery(query1);
		while(rs.next()) {
			 System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
		rs.close();
		st.close();
		con.close();
		

	}

}
