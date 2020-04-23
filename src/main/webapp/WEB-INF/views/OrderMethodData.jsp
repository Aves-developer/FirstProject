<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<body>
<h3>Welcome To OrderMethod Data Page</h3>
<c:choose >
<c:when test="${!empty list }">
<table border="1">
<tr>
<th>ID</th><th>MODE</th><th>CODE</th><th>TYPE</th><th>ORDACCEPT</th><th>NOTE</th>
<th colspan="3">Operation</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.orderId }</td>
<td>${ob.orderMode }</td>
<td>${ob.orderCode }</td>
<td>${ob.orderType }</td>
<td>${ob.orderAccept }</td>
<td>${ob.orderDesc }</td>
<td><a href="delete?ordid= ${ob.orderId}"><img src="../resource/images/dlte.png" width="30" height="30"/></a></td>
<td><a href="edit?ordid= ${ob.orderId }">Edit</a></td>
<td><a href="view?ordid=${ob.orderId }">View</a></td>
</tr>
</c:forEach>
</table>
</c:when>
</c:choose>
</body>
</html>