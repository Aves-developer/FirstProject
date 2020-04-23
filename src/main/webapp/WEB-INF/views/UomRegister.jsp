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
				<h3>WELCOME TO UOM REGISTER PAGE</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="Post" modelAttribute="uom">
					<div class="row">
						<div class="col-4">
							<label for="uomType">Uom Type</label>
						</div>
						<div class="col-4">
							<form:select path="uomType" class="form-control">
								<form:option value="">SELECT</form:option>
								<form:option value="NO-PACKIN">NO-PACKING</form:option>
								<form:option value="PACKING">PACKING</form:option>
								<form:option value="NA">NA</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<span id="uomTypeError"></span>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="uomModel">Uom Model</label>
						</div>
						<div class="col-4">
							<form:input path="uomModel" class="form-control" />
						</div>
						<div class="col-2">
							<span id="uomModelError"></span>
						</div>
						<div class="col-2">
							<form:errors path="uomModel" cssClass="text-danger" />
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="uomDesc">Uom Description</label>
						</div>
						<div class="col-4">
							<form:textarea path="uomDesc" class="form-control" />
						</div>
						<div class="col-2">
							<span id="uomDescError"></span>
						</div>
						<div class="col-2">
						<form:errors path="uomDesc" cssClass="text-danger"/>
						</div>
					</div>
					<input type="submit" id="register" value="creatUom" />

				</form:form>
			</div>
			<div class="card-footer">${message }</div>
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(
				function() {

					$("#uomTypeError").hide();
					$("#uomModelError").hide();
					$("#uomDescError").hide();

					var uomTypeError = false;
					var uomModelError = false;
					var uomDescError = false;

					$("#uomDesc").keyup(function() {
						valid_uomDesc();
					})
					$("#uomModel").keyup(function() {
						valid_uomModel();
					})
					$("#uomType").change(function() {
						valid_uomType();
					})
					function valid_uomDesc() {
						var val = $("#uomDesc").val();
						var exp = /^[A-Za-z0-9_.]{6,20}$/;
						if (val == "") {
							$("#uomDescError").show();
							$("#uomDescError")
									.html("please insert description");
							$("#uomDescError").css("color", "red");
							uomDescError = false;
						} else if (!exp.test(val)) {
							$("#uomDescError").show();
							$("#uomDescError").html(
									"please insert min 6 characters");
							$("#uomDescError").css("color", "red");
						} else {
							$("#uomDescError").hide();
							uomDescError = true;
						}
						return uomDescError;
					}
					function valid_uomModel() {
						var val = $("#uomModel").val();
						var exp = /^[A-Z0-9]{3,5}$/;
						if (val == "") {
							$("#uomModelError").show();
							$("#uomModelError").html("please insert UomModel");
							$("#uomModelError").css("color", "red");
							uomModelError = false;
						} else if (!exp.test(val)) {
							$("#uomModelError").show();
							$("#uomModelError").html(
									"please insert Only Capital letters");
							$("#uomModelError").css("color", "red");
						} else {
							$("#uomModelError").hide();
							uomModelError = true;
						}
						return uomModelError;
					}
					function valid_uomType() {
						var val = $("#uomType").val();
						if (val == "") {
							$("#uomTypeError").show();
							$("#uomTypeError").html("please select uom Type");
							$("#uomTypeError").css("color", "red");
							uomTypeError = false;
						} else {
							$("#uomTypeError").hide();
							uomTypeError = true;
						}
						return uomTypeError;
					}
					$("#register").click(function() {
						uomTypeError = false;
						uomModelError = false;
						uomDescError = false;
						valid_uomType();
						valid_uomModel();
						valid_uomDesc();
						if (uomTypeError && uomModelError && uomDescError)
							return true;
						else
							return false;
					})

				})
	</script>
</body>

</html>