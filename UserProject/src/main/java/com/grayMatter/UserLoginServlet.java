package com.grayMatter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UserLoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
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
		try {
			con=dc.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement st=null;
		
		String name=request.getParameter("user_name");
		String pwd=request.getParameter("pwd");
		 String query="select * from user ";

		       try {

		    	   System.out.println(con.toString());

					st=con.createStatement();

					ResultSet rs = st.executeQuery(query);

					RequestDispatcher dispatcher;

					System.out.println(rs);

					System.out.println(name);

					System.out.println(pwd);

					while(rs.next())

					{

						System.out.println(rs.getString(2)+" "+rs.getString(5));

						if(rs.getString(2).equals(name) && rs.getString(5).equals(pwd))

						{

							request.setAttribute("username", name);

							dispatcher=request.getRequestDispatcher("WelcomeServlet");

							dispatcher.forward(request, response);

						}

					}

					dispatcher=request.getRequestDispatcher("signin.jsp");

					dispatcher.forward(request, response);
		 
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
