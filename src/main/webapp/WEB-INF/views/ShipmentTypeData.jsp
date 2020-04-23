<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="CommonUse.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="card-header bg-primary text-white">
<h3>Welcome To Shipment Data Page</h3>
</div>
<div class="card-body">
<c:choose>
<c:when test= "${!empty list }">
<a href="excel"><img src="../resourcess/images/excel.png" width="40" height="40"></a>
<a href="pdf"><img src="../resourcess/images/pdf.png" width="70" height="50"></a>
<table border="1" class="table table-hover">
<tr class="bg-danger">
<th>ID</th> <th>MODE</th> <th>CODE</th><th>ENABLE</th><th>GRAD</th><th>NOTE</th>
<th colspan="3">OPERATION</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.shipId}</td>
<td>${ob.shipMode}</td>
<td>${ob.shipCode}</td>
<td>${ob.enbShip}</td>
<td>${ob.shipGrad}</td>
<td>${ob.shipDesc}</td>
<td>
<a href="delete?sid=${ob.shipId }"><img src="../resourcess/images/delte.png" width="40" height="40"/></a>
</td>
<td>
<a href="edit?sid=${ob.shipId }" ><img src="../resourcess/images/edit.png" width="40" height="40"/></a>
</td>
<td>
<a href="view?sid=${ob.shipId }"><img  src="../resourcess/images/view.png" width="40" height="40"/></a>
</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>Data Not Found!</c:otherwise>
</c:choose>
</div>
</div>
</body>
</html>
