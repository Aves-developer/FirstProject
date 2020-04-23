<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<body>
<h3>WELCOME TO PURCHASE ORDER EDIT PAGE</h3>
<form:form action="update" method="post" modelAttribute="PurchaseOrder">
<pre>
PurchaseOrder ID<form:input path="perId" readOnly="true"/>
Order Code<form:input path="perCode"/>
Refrence Number<form:input path="perRefNum"/>
Quality Check
<form:radiobutton path="perQuality" value="Required"/>Required
<form:radiobutton path="perQuality" value="Not Required"/>Not Required
Purchase Status<form:input path="perStatus"/>
Purchase Description<form:textarea path="perDesc"/>
<input type="submit" value="EditPurchaseOrder"/>
</pre>
</form:form>
</body>
</html>