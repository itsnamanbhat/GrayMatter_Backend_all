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
		PrintWriter out=response.getWriter();
		DataSourceClass dc = new DataSourceClass();
		Connection con=null;
		PreparedStatement ps= null;
		RequestDispatcher dispatcher;
		
		try {
			con=dc.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String fEmail = request.getParameter("email");
        String fPwd = request.getParameter("password");
        String query = "SELECT Name,Mobile,Email,Password FROM Customer WHERE Email = ? AND Password = ?";

		
        	try {
				ps= con.prepareStatement(query);
				 ps.setString(1, fEmail);
		         ps.setString(2, fPwd);

		         ResultSet rs = ps.executeQuery();
		         if(rs.next()){
		        	 String name = rs.getString("Name");
		                String mobile = rs.getString("Mobile");
		                request.setAttribute("name", name);
		                request.setAttribute("mobile", mobile);
		                request.setAttribute("email", fEmail);
		                request.getRequestDispatcher("home.jsp").forward(request, response);
		         }else {
		                // Invalid credentials
		                response.getWriter().println("Invalid email or password.");
		                request.getRequestDispatcher("login.jsp").forward(request, response);
		            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
