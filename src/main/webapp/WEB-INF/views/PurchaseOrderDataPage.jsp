<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO ALL DATA PAGE</h3>
<c:choose>
<c:when test="${!empty list }">
<table 	border="1">
<tr>
<th>PID</th><th>PCODE</th><th>REF NUMBER</th><th>QUALITY</th><th>STATUS</th><th>NOTE</th>
</tr>
<c:forEach items="${list }" var="ob">
<tr>
<td>${ob.perId}</td>
<td>${ob.perCode}</td>
<td>${ob.perRefNum}</td>
<td>${ob.perQuality}</td>
<td>${ob.perStatus}</td>
<td>${ob.perDesc}</td>
<td><a href="delete?perId=${ob.perId}">Delete</a></td>
<td><a href="edit?perId=${ob.perId }">Edit</a></td>
<td><a href="view?perId=${ob.perId }">View</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise><h3>DATA NOT FOUND</h3></c:otherwise>
</c:choose>
</body>
</html>