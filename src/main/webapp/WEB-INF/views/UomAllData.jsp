<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
<h3>WELCOME TO UOMALLDATA PAGE</h3>

<c:choose>
<c:when test="${!empty list }">
<table border="1">
<tr>
<th>ID</th><th>UOM TYPE</th><th>UOM MODEL</th><th>NOTE</th>
</tr>
<c:forEach items="${list }" var="om">
<tr>
<td>${om.uomId }</td>
<td>${om.uomType }</td>
<td>${om.uomModel }</td>
<td>${om.uomDesc }</td>
<td><a href="delete?uid=${om.uomId }">Delete</a></td>
<td><a href="edit?uid=${om.uomId }">Edit</a></td>
<td><a href="view?uid=${om.uomId }">View</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>DATA NOT FOUND!!!!!!!</c:otherwise>
</c:choose>
</body>
</html>