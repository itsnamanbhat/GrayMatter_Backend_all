<%@ page import="java.sql.Connection, java.sql.DriverManager, java.sql.PreparedStatement, java.sql.ResultSet, java.sql.SQLException" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Item Management</title>
    <link rel="stylesheet" href="Admin.css">

</head>
<body>
    <h2>Item Management</h2>

    <!-- Form to Add a New Item -->
    <h3>Add New Item</h3>
    <form action="AdminServlet" method="post">
        <input type="hidden" name="action" value="add">
        <label for="name">Item Name:</label>
        <input type="text" id="name" name="name" required>
        <br>
        <label for="cost">Cost:</label>
        <input type="number" id="cost" name="cost" step="0.01" required>
        <br>
        <input type="submit" value="Add Item">
    </form>

    <!-- Form to Remove an Existing Item -->
    <h3>Remove Item</h3>
    <form action="AdminServlet" method="post">
        <input type="hidden" name="action" value="remove">
        <label for="id">Item ID:</label>
        <input type="number" id="id" name="id" required>
        <br>
        <input type="submit" value="Remove Item">
    </form>

    <!-- Display Existing Items -->
    <h3>Existing Items</h3>
    <ul>
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
        <li>Item ID: <%= id %>, Name: <%= name %>, Cost: $<%= cost %></li>
        <%
                }
            } catch (SQLException e) {
                e.printStackTrace();
                %><li>Error fetching items: <%= e.getMessage() %></li><%
            }
        %>
    </ul>
</body>
</html>
