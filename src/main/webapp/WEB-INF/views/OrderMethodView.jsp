<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<h3>Welcome to view Page</h3>
<body>
<table>
<tr><th>ID</th><td>${om.orderId}</td></tr>
<tr><th>MODE</th><td>${om.orderMode }</td></tr>
<tr><th>CODE</th><td>${om.orderCode }</td></tr>
<tr><th>TYPE</th><td>${om.orderType }</td></tr>
<tr><th>ACCEPT</th><td>${om.orderAccept }</td></tr>
<tr><th>NOTE</th><td>${om.orderDesc }</td></tr>
</table>

</body>
</html>