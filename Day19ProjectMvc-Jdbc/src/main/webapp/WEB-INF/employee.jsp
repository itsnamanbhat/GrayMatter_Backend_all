<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
<c:when test="${action == 'all'}">
<h1>Employee Lists</h1>
<table>
	<tr>
	<th>Name</th>
	<th>Id</th>
	<th>Salary</th>
	</tr>
<c:forEach var="emp" items="${emp}">
<tr>
<td>${emp.empName}</td>
<td>${emp.empId}</td>
<td>${emp.empSalary}</td>
</tr>

</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1>Name: ${emp.empName}</h1>
<h1>Id: ${emp.empId}</h1>
<h1>Age: ${emp.empSalary}</h1>
</c:otherwise>
</c:choose>
</body>
</html>


