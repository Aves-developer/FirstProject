<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<body>
<H3>WELCOME TO VIEW PART PAGE</H3>
<table border="1">
<tr><th>ID</th><td>${pt.id}</td></tr>
<tr><th>CODE</th><td>${pt.partCode }</td></tr>
<tr><th>WIDTH</th><td>${pt.ptwidth }</td></tr>
<tr><th>LENGTH</th><td>${pt.plength }</td></tr>
<tr><th>HIEGHT</th><td>${pt.phieght }</td></tr>
<tr><th>COST</th><td>${pt.pbCost }</td></tr>
<tr><th>CURRENCY</th><td>${pt.pbCurrency }</td></tr>
<tr><th>NOTE</th><td>${pt.pDesc }</td></tr>
</table>

</body>
</html>