<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Employee</title>
    

</head>
<body>
    <div class="signup-container">
        <form class="signup-form" action="employee/add">
            <h1>Sign Up</h1>
            <label for="empname">EmployeeName:</label>
            <input type="text" id="empName" name="empName" required>
            
            
            <label for="empid">Employee Id:</label>
            <input type="text" id="empId" name="empId" required>
            
            

            <label for="empSal">Account Type:</label>
            <input type="text" id="empSal" name="empSal" required>
            
            <button type="submit" >Sign Up</button>
        </form>
    </div>
</body>
</html>
