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

      <h1>Ninja Details</h1>
    
		       <a href="/">Go Back</a>
		       <p>First Name:<c:out value="${ ninja.fname}"></c:out></p>
		       <p>Last Name:<c:out value="${ ninja.lname}"></c:out></p>
		       <p>Age:<c:out value="${ninja.age}"></c:out></p>
		       <p>Dojo location:<c:out value="${ninja.dojo.name }"></c:out></p>
		    
		    
		    
		    

        
</body>
</html>