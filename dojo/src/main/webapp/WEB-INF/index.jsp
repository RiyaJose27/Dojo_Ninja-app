
   
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
     <h1>Ninja</h1>  
     <a href="/newNinja">New Ninja</a>
     <a href="/newDojo">New Dojo</a>
     
		    
      <table>
      <tbody>
		  <tr>
		    <th>First Name</th>
		    <th>Last Name</th>
		    <th>Age</th>
		    <th>Dojo</th>
		    <th>Actions</th>
		  </tr>
		  <c:forEach var="i" items="${ninjas}" >
		  <tr>
		      <td><a href="/oneNinja/${i.id}"><c:out value="${i.fname}"></c:out></a> </td>
		       <td> <c:out value="${i.lname}"></c:out> </td>
		        <td> <c:out value="${i.age}"></c:out> </td>
		        <td> <a href="/oneDojo/${i.dojo.id }"> <c:out value="${i.dojo.name}"></c:out></a></td>
		         <td> <a href="/editNinja/${i.id }">Edit</a>  <a href="destroy/${i.id }">Delete</a> </td>
		  </tr>
		  </c:forEach>
     </tbody>	    
     </table>
     
</body>
</html>