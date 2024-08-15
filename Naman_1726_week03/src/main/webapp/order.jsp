<%@ page import="java.sql.Connection, java.sql.DriverManager, java.sql.PreparedStatement, java.sql.ResultSet, java.sql.SQLException" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Select Items</title>
    <link rel="stylesheet" href="order.css">
</head>
<body>
    <div class="container">
        <h2>Select Items for Your Order</h2>
        <form action="orderServlet" method="post">
            <%
                String jdbcUrl = "jdbc:mysql://localhost:3306/shoppingdb";
                String jdbcUser = "root";
                String jdbcPassword = "password";
                String sql = "SELECT * FROM Item";

                try (Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
                     PreparedStatement pstmt = conn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery()) {

                    while (rs.next()) {
                        int id = rs.getInt("Id");
                        String name = rs.getString("Name");
                        double cost = rs.getDouble("Cost");
            %>
            <div class="item">
                <input type="checkbox" name="items" value="<%= id %>">
                <label for="<%= id %>"><%= name %> - $<%= cost %></label>
                <input type="number" name="quantity_<%= id %>" min="1" placeholder="Quantity" style="width: 100px;">
            </div>
            <%
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    %><p class="error">Error fetching items: <%= e.getMessage() %></p><%
                }
            %>
            <br>
            <input type="submit" value="Submit Order">
        </form>
    </div>
</body>
</html>
