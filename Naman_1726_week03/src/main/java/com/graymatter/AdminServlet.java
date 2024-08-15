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
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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
		String action = request.getParameter("action");
		try {
		if ("add".equals(action)) {
            String name = request.getParameter("name");
            double cost = Double.parseDouble(request.getParameter("cost"));

            String sql = "INSERT INTO Item (Name, Cost) VALUES (?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, name);
                pstmt.setDouble(2, cost);
                pstmt.executeUpdate();
            }

        } else if ("remove".equals(action)) {
            String id = request.getParameter("id");

            String sql = "DELETE FROM Item WHERE Id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setInt(1, Integer.parseInt(id));
                pstmt.executeUpdate();
            }
        }

        response.sendRedirect("Admin.jsp"); // Redirect to the JSP to show the updated list

    } catch (SQLException e) {
        e.printStackTrace();
        response.getWriter().println("Error: " + e.getMessage());
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
