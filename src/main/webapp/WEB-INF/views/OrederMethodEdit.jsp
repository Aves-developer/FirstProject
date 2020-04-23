<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
	<h3>Welcome To Edit Page</h3>
	<form:form action="update" method="post" modelAttribute="OrderMethod">
		<pre>
Order ID<form:input path="orderId" readOnly="true"/>
Order Mode
          <form:radiobutton path="orderMode" value="Purchase" />Purchase
          <form:radiobutton path="orderMode" value="Sale" />Sale
 Order Code:<form:input path="orderCode" />
 Order Method<form:select path="orderType">
 <form:option value="-Select-">-Select-</form:option>
 <form:option value="FIFO">FIFO</form:option>
 <form:option value="LIFO">LIFO</form:option>
 <form:option value="FCFO">FCFO</form:option>
 <form:option value="FEFO">FEFO</form:option>
 </form:select>   
 Order Accept
  <form:checkbox path="orderAccept" value="Return-Accept" />Return-Accept
  <form:checkbox path="orderAccept" value="Multi-Model" /> Multi-Model     

  Description <form:textarea path="orderDesc" /> 
  <input type="submit" value="Update" />    
</pre>
	</form:form>

</body>
</html>