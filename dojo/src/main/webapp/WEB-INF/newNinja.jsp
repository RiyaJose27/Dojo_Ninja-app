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

      <a href="/">Go Back</a>
      
      <h1>Track a ninja</h1>
<form:form action="/createNinja" method="post" modelAttribute="ninja">
    <p>
        <form:label path="fname"> First Name</form:label>
        <form:errors path="fname"/>
        <form:input path="fname"/>
    </p>
    <p>
        <form:label path="lname">Last Name</form:label>
        <form:errors path="lname"/>
        <form:input path="lname"/>
    </p>
    <p>
        <form:label path="age"> Age</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
    </p>
    
    <form:select path="dojo">
    <c:forEach var="i" items="${dojos }">
    <form:option value="${i.id }">${i.name }</form:option>
    </c:forEach>
    </form:select><br><br>
    <input type="submit" value="Submit"/>
</form:form>    

      

</body>
</html>