<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Sign Up</title>
</head>
<body>
<form action="UserSignupServlet">
	<label for="uid">UserID:</label>
	<input type="number" name="uid" id="uid">
	<br>
	<label for="uname">UserName:</label>
	<input type="text" name="uname" id="uname">
	<br>
	<label for="email">Email</label>
	<input type="email" name="email" id="email">
	<br>
	<label for="phone">Phone Number</label>
	<input type="text" name="phone" id="phone">
	<br>
	<label for="pwd">Password</label>
	<input type="text" name="pwd" id="pwd">
	<br>
	<button type="submit" class="submit btn" >Submit</button>
</form>
</body>
</html>