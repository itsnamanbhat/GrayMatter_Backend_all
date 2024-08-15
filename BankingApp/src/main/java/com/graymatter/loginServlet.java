package com.graymatter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		DriverClass dc= new DriverClass();
		Connection con= null;
		PreparedStatement ps= null;
		RequestDispatcher dispatcher;
		String fpwd=null;
		try {
			con=dc.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String username= request.getParameter("username");
		String pwd= request.getParameter("password");
		
		String query1="Select user_name,accountType,password,mobile,email from bankuser where user_name=?";
		
		try {
			ps=con.prepareStatement(query1);
			ps.setString(1, username);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				fpwd= rs.getString(3);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pwd.equals(fpwd)) {
			dispatcher=request.getRequestDispatcher("current.jsp");
			dispatcher.forward(request, response);
			System.out.println("valid");
		}else {
			dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			System.out.println("invalid");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
