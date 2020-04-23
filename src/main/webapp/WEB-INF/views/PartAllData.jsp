<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h3>WELCOME TO PART DATA PAGE</h3>
<c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr>
<th>ID</th><th>CODE</th><th>WIDTH</th><th>LENGTH</th><th>HIEGHT</th><th>COST</th><th>CURRENCY</th><th>NOTE</th><th colspan=3>OPERATION</th>
</tr>
<c:forEach items="${list}" var="pt">
<tr>
<td> ${pt.id} </td>
<td>${pt.partCode }</td>
<td>${pt.ptwidth }</td>
<td>${pt.plength }</td>
<td>${pt.phieght }</td>
<td>${pt.pbCost }</td>
<td>${pt.pbCurrency }</td>
<td>${pt.pDesc }</td>
<td ><a href="delete?pid=${pt.id }">Delete</a></td>
<td><a href="edit?pid=${pt.id }">Edit</a></td>
<td><a href="view?pid=${pt.id }">View</a></td>
</tr>
</c:forEach>

</table>
</c:when>
<c:otherwise>Data not found!!!!!!!!</c:otherwise>
</c:choose>

</body>
</html>