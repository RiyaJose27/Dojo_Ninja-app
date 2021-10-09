<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isErrorPage="true" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9kGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
<a href="/">Home</a>
<h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
<c:forEach var="i" items="${dojo.ninjas }">
<tr>
<td><c:out value="${i.fname }"></c:out></td>
<td><c:out value="${i.lname }"></c:out></td>
<td><c:out value="${i.age}"></c:out></td>

</tr>
          
</c:forEach>
</table>




</body>
</html>