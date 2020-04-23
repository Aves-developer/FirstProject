<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h3>Wel come to Part Edit page</h3>
<form:form action="update" method="Post" modelAttribute="part">
<pre>
Part ID<form:input path="id" readOnly="true"/>
Part Code<form:input path="partCode"/>
Part Dimention:
Width<form:input path="ptwidth"/> length<form:input path="plength"/> hieght<form:input path="phieght"/>
Base Cost<form:input path="pbCost"/>
Base Currency<form:select path="pbCurrency">
<form:option value="">Select</form:option>
<form:option value="INR">INR</form:option>
<form:option value="USD">USD</form:option>
<form:option value="AUS">AUS</form:option>
<form:option value="ERU">ARU</form:option>
</form:select>
Discription<form:textarea path="pDesc"/>
<input type="submit" value="update"/>
</pre>
</form:form>
 ${message }
</body>
</html>