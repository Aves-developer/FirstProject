<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO PURCHASE ORDER REGISTER PAGE</h3>
<form:form action="save" method="post" modelAttribute="purchaseOrder">
<pre>
Order Code<form:input path="perCode"/>
<%-- Shipment Code<form:select path="shipOb.shipId">
              <form:option value="">select</form:option>
              <form:options items="${shipMap}"/>
</form:select> --%>
Refrence Number<form:input path="perRefNum"/>
Quality Check
<form:radiobutton path="perQuality" value="Required"/>Required
<form:radiobutton path="perQuality" value="Not Required"/>Not Required
Purchase Status<form:input path="perStatus"/>
Purchase Description<form:textarea path="perDesc"/>
<input type="submit" value="PurchaseOrder"/>
</pre>
</form:form>
 ${ message}
</body>
</html>