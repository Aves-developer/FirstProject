<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
<h3>Welcome TO Edit Page</h3>
<form:form action="update" method="post" modelAttribute="ShipmentType">
<pre>
Shipment ID:<form:input path="shipId" readOnly="true"/>
Shipment Mode
<form:select path="shipMode">
<form:option value="">-select-</form:option>
<form:option value="Air">Air</form:option>
<form:option value="Ship">Ship</form:option>
<form:option value="Train">Train</form:option>
<form:option value="Truck">Truck</form:option>
</form:select>
Shipment Code:
<form:input path="shipCode"/>
Enable Shipment:
<form:select path="enbShip">
<form:option value="">-select-</form:option>
<form:option value="Yes"></form:option>
<form:option value="NO"></form:option>
</form:select>
Shipment Grad;
<form:radiobutton path="shipGrad" value="A"/>A
<form:radiobutton path="shipGrad" value="B"/>B
<form:radiobutton path="shipGrad" value="C"/>C
Discription:
<form:textarea path="shipDesc"/>
<input type="submit" value="CreateShipment"> 
</pre>
</form:form>
</body>
</html>