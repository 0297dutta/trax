<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill | List</title>
</head>
<body>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email
<th>Mobile</th>
<th>Product Name</th>
<th>Amount</th>
</tr>
<c:forEach items="${bill}" var="bill">
<tr>
<th>${bill.firstName}</th>
<th>${bill.lastName}</th>
<th>${bill.email}</th>
<th>${bill.mobile}</th>
<th>${bill.product}</th>
<th>${bill.amount}</th>
</tr>
</c:forEach>
</table>



</body>
</html>