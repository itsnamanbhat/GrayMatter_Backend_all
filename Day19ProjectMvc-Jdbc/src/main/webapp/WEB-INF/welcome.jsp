<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>

a{
text-decoration:none;
color:white;
height:2rem;
background-color:black;
padding:0.5rem;
border-radius:10px;
}
.buttons{
margin:1rem;
display:flex;
justify-content:space-evenly;
}
</style>
<h1>Welcome ${stdName} </h1>
<h2>Tell Us what you want to do</h2>
<div class="buttons">
<a href="addEmp"> Add new Employee</a>
<a href="employee"> Show all Students</a>
<a href="fetchEmp"> Get Employee by ID</a>
<a href="updateEmp"> Update Employee</a>
<a href="delEmp"> Delete Employee</a>
</div>

</body>
</html>