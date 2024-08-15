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
<a href="addStd"> Add new Student</a>
<a href="showStd"> Show all Students</a>
<a href="fetchStd"> Get Student by ID</a>
<a href="updateStd"> Update Student</a>
<a href="delStd"> Delete Student</a>
</div>

</body>
</html>