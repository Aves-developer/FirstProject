<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@include file="CommonUse.jsp" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<div class="container">
<div class="card">
<div class="card-header">
<h3>welcome to part register page</h3>
</div>
<form:form action="save" method="Post" modelAttribute="part">
<div class="row">
<div class="col-4">
<label for="partCode">Part Code</label>
</div>
<div class="col-4">
<form:input path="partCode" class="form-control"/>
</div>
<div class="col-4">
<span id="partCodeError"></span>
</div>
</div>
<div class="row">
<div class="col-12">
<label>Part Dimention:</label>
</div>
</div>
<div class="row">
<div class="col-4">
<label for="ptwidth">Width</label>
</div>
<div class="col-4">
<form:input path="ptwidth" class="form-control"/> 
</div>
<div class="col-4">
<span id="widthError"></span>
</div>
</div>

<div class="row">
<div class="col-4">
<label for="plength">Length</label>
</div>
<div class="col-4">
<form:input path="plength" class="form-control"/> 
</div>
<div class="col-4">
<span id="plengthError"></span>
</div>
</div>
<div class="row">
<div class="col-4">
<label for="phieght">HIEGHT</label>
</div>
<div class="col-4">
<form:input path="phieght" class="form-control"/> 
</div>
<div class="col-4">
<span id="phieghtError"></span>
</div>
</div>

<div class="row">
<div class="col-4">
<label for="pbCost">Base Cost</label>
</div>
<div class="col-4">
<form:input path="pbCost" class="form-control"/> 
</div>
<div class="col-4">
<span id="pbCostError"></span>
</div>
</div>

<div class="row">
<div class="col-4">
<label for="pbCurrency">Base Currency</label>
</div>
<div class="col-4">
<form:select path="pbCurrency" class="form-control"> 
<form:option value="">Select</form:option>
<form:option value="INR">INR</form:option>
<form:option value="USD">USD</form:option>
<form:option value="AUS">AUS</form:option>
<form:option value="ERU">ARU</form:option>
</form:select>
</div>
<div class="col-4">
<span id="pbCurrencyError"></span>
</div>
</div>
<div class="row">
<div class="col-4">
<label for="pDesc">Discription</label>
</div>
<div class="col-4">
<form:textarea path="pDesc" class="form-control"/>
</div>
</div>

<input type="submit" value="creatPart"/>
</form:form>
<div class="card-footer">
 ${message }
 </div>
 </div>
 </div>
</body>
</html>