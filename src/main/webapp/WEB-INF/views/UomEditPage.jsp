<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
<h3>WELCOME TO UOM EDIT PAGE</h3>
<form:form action="update" method="Post" modelAttribute="uom">
<pre>
Uom Id<form:input path="uomId" readOnly="true"/>
Uom Type <form:select path="uomType">
<form:option value="">SELECT</form:option>
<form:option value="NO-PACKIN">NO-PACKING</form:option>
<form:option value="PACKING">PACKING</form:option>
<form:option value="NA">NA</form:option>
</form:select>
Uom Model<form:input path="uomModel"/>
Uom Description<form:textarea path="uomDesc"/>
<input type="submit" value="update"/>
</pre>
</form:form>
 ${message }

</body>
</html>