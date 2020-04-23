<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="CommonUse.jsp"%>
<!DOCTYPE html>
<html>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header">
				<h3>WelCome To OrderMethod Page</h3>
			</div>
			
			<div class="card-body">
			<form:form action="save" method="post" modelAttribute="orderMethod">
			<div class="row">
						<div class="col-4">
							<label for="orderMode">Order Mode</label>
						</div>
						<div class="col-4">
							<form:radiobutton path="orderMode" value="Vendor" />
							Vendor
							<form:radiobutton path="orderMode" value="Customer" />
							Customer
						</div>
						<div class="col-4">
							<span id=orderModeError></span>
						</div>
					</div>
			
</form:form>
			
			
			</div>
			<div class="card-footer">${message }</div>

		</div>
</div>
</body>
</html>