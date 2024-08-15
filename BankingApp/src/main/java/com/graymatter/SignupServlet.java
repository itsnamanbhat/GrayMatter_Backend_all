package com.graymatter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
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
		try {
			con= dc.getConnection()	;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("Connection established");
		String user_name= request.getParameter("username");
		String email= request.getParameter("email");
		String mobile= request.getParameter("mobile");
		String password= request.getParameter("password");
		String aadhar= request.getParameter("aadhar");
		String accountType=request.getParameter("accountType");
		
		
		try {
			ps=con.prepareStatement("insert into bankuser values(?,?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ps.setString(3,aadhar);
			ps.setString(2, email);
			ps.setString(1, user_name);
			ps.setString(5,mobile);
			ps.setString(6,password);
			ps.setString(4, accountType);
			int val  =ps.executeUpdate();
			if(val>0) {
				System.out.println("Inserted successfully");
			}else {
				System.out.println("error");
			}
			
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dispatcher=request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
