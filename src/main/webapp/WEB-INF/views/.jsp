<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="POST">
<pre>
Shipment Mode
<select name="shipMode">
<option>-Select-</option>
<option>Air</option>
<option>Ship</option>
<option>Train</option>
<option>Truck</option>
</select>
Shipment Code <input type="text" name="shipCode">
Enable Shipment 
<select name="enbShip">
<option>-Select-</option>
<option>Yes</option>
<option>No</option>
</select>
Shipment Grad
<input type="radio" name="shipGrad" value="A"/>A
<input type="radio" name="shipGrad" value="B"/>B
<input type="radio" name="shipGrad" value="C"/>C
Description
<textarea name="shipDesc"></textarea>
<input type="submit" value="CreatShipment"/>
</pre>
</form>
 ${ message}
</body>
</html>