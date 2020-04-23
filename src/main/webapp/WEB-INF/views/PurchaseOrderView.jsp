<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO VIEW PAGE</h3>
<table border="1">
<tr><th>ID</th><td>${ob.perId }</td></tr>
<tr><th>CODE</th><td>${ob.perCode }</td></tr>
<tr><th>REF-NUMBER</th><td>${ob.perRefNum }</td></tr>
<tr><th>QUALITY</th><td>${ob.perQuality }</td></tr>
<tr><th>STATUS</th><td>${ob.perStatus }</td></tr>
<tr><th>DESCRIPTION</th><td>${ob.perDesc }</td></tr>
</table>
</body>
</html>