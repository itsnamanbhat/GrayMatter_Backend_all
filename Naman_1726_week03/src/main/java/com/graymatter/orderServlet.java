package com.graymatter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class orderServlet
 */
public class orderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public orderServlet() {
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
		
        String[] selectedItems = request.getParameterValues("items");

        if (selectedItems != null && selectedItems.length > 0) {
            try  {
                // Create a new order
                String insertOrderSql = "INSERT INTO orders (Order_date) VALUES (NOW())";
                ps=con.prepareStatement(insertOrderSql);
                    ps.executeUpdate();
                    try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int orderId = generatedKeys.getInt(1);

                            // Insert items into order_item table
                            String insertOrderItemSql = "INSERT INTO order_item (Order_id, Item_id, Quantity) VALUES (?, ?, ?)";
                            try (PreparedStatement pstmtOrderItem = con.prepareStatement(insertOrderItemSql)) {
                                for (String itemId : selectedItems) {
                                    String quantityParam = request.getParameter("quantity_" + itemId);
                                    int quantity = quantityParam != null ? Integer.parseInt(quantityParam) : 1;

                                    pstmtOrderItem.setInt(1, orderId);
                                    pstmtOrderItem.setInt(2, Integer.parseInt(itemId));
                                    pstmtOrderItem.setInt(3, quantity);
                                    pstmtOrderItem.addBatch();
                                }
                                pstmtOrderItem.executeBatch();
                            }
                        }
                    }
                

                response.sendRedirect("order.jsp");

            } catch (SQLException e) {
                e.printStackTrace();
                response.getWriter().println("Error processing order: " + e.getMessage());
            }
        }
         else {
            response.getWriter().println("No items selected.");
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
