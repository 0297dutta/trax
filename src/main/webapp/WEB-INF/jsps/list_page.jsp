<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
<a href="viewCreateLead">Create New Lead</a>
<h2>List All The Data</h2>
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Lead Source</th>
<th>Email
<th>Mobile</th>
</tr>
<c:forEach items="${list}" var="list">
<tr>
<th><a href="leadInfo?id=${list.id}">${list.firstName}</a></th>
<th>${list.lastName}</th>
<th>${list.leadSource}</th>
<th>${list.email}</th>
<th>${list.mobile}</th>
</tr>
</c:forEach>
</table>
</body>
</html>