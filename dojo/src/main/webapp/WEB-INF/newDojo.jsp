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
	        <h1> New Dojo</h1>
	
           <a href="/">Go Back</a>
      
      <h1>Track a dojo</h1>
   <form:form action="/createDojo" method="post" modelAttribute="dojo">
    <p>
        <form:label path="name"> Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
   
   
    <input type="submit" value="Create"/>
</form:form>     







</body>
</html>