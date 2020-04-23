<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<body>
<%@include file="CommonUse.jsp"%>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>WELCOME TO WH USER TYPE</h3>
			</div>
			<div class="card-body">
				<form:form  id="myform" action="save" method="post" modelAttribute="whUserType">

					<div class="row">
						<div class="col-4">
							<label for="userType">UserType</label>
						</div>
						<div class="col-4">
							<form:radiobutton path="userType" value="Vendor" />
							Vendor
							<form:radiobutton path="userType" value="Customer" />
							Customer
						</div>
						<div class="col-4">
							<span id=userTypeError></span>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="userCode">UserCode</label>
						</div>
						<div class="col-4">
							<form:input path="userCode" class="form-control" />
						</div>
						<div class="col-2">
							<span id="userCodeError"></span>
						</div>
						<div class="col-2">
						<form:errors path="userCode" cssClass="text-danger"/>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="userFor">UserFor</label>
						</div>
						<div class="col-4">
							<form:input path="userFor" class="form-control" readonly="true" />
						</div>
						<div class="col-4">
							<span id="userForError"></span>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="userEmail">UserEmail</label>
						</div>
						<div class="col-4">
							<form:input path="userEmail" class="form-control" />
						</div>
						<div class="col-2">
							<span id="userMailError"></span>
						</div>
						<div class="col-2">
						<form:errors path="userEmail" cssClass="text-danger"/>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="userCont">User Contact</label>
						</div>
						<div class="col-4">
							<form:input path="userCont" class="form-control" />
						</div>
						<div class="col-2">
							<span id="userContactError"></span>
						</div>
						<div class="col-2">
						<form:errors path="userCont" cssClass="text-danger"/>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="useridType">User ID Type</label>
						</div>
						<div class="col-4">
							<form:select path="useridType" class="form-control">
								<form:option value="">SELECT</form:option>
								<form:option value="PAN CARD">PAN CARD</form:option>
								<form:option value="AADHAR CARD">AADHAR CARD</form:option>
								<form:option value="VOTER ID">VOTER ID</form:option>
								<form:option value="OTHER">OTHER</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<span id="useridTypeError"></span>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="ifOther">*If Other</label>
						</div>
						<div class="col-4">
							<form:input path="ifOther" class="form-control" readonly="true" />
						</div>
						<div class="col-4">
							<span id="ifOtherError"></span>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="idNumber">ID Number</label>
						</div>
						<div class="col-4">
							<form:input path="idNumber" class="form-control" />
						</div>
						<div class="col-2">
						<span id="idNumberError"></span>
						</div>
						<div class="col-2">
						<form:errors path="idNumber" cssClass="text-danger"/>
						</div>
					</div>

					<input type="submit" value="CreateUser" id="register"
						class="btn btn-success" />
				</form:form>
				<div class="card-footer bg-info">${message}</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">

	$(document).ready(function(){
		

		$("#userContactError").hide();
		$("#userTypeError").hide();
		$("#userCodeError").hide();
		$("#userMailError").hide();
		$("#idNumberError").hide();
		$("#useridTypeError").hide();
		
		var userMailError=false;
		var userTypeError=false;
		var userCodeError=false;
		var userContactError=false;
		var idNumberError=false;
		var useridTypeError=false;

		$("#useridType").change(function(){
			validate_idType();
			});

		$("#idNumber").keyup(function(){
			validate_idNumber();
			});

		$("#userCont").keyup(function(){
			validate_userContact();
			});

		$("#userEmail").keyup(function(){
			validate_userEmail();
			});
		
		$("#userCode").keyup(function(){
			validate_userCode();
			});
		$('input[type="radio"][name="userType"]').change(function(){
			validate_userType();
			validate_autoFill();
			});


		function validate_idType(){
			var id=$("#useridType").val();
			if(id==""){
				$("#useridTypeError").show();
				$("#useridTypeError").html("please select one id");
				$("#useridTypeError").css("color","red");
				useridTypeError=false;
				}else{
					$("#useridTypeError").hide();
					useridTypeError=true;

					if(id=="OTHER"){
                     $("#ifOther").attr("readonly",false);
						}
					else {
						$("#ifOther").val("");
						$("#ifOther").attr("readonly",true);
						}

					}
			return useridTypeError;

			}

		
		function validate_idNumber(){

			var val=$("#idNumber").val();
			var exp=/^[A-Za-z0-9._]{4,20}$/;
			if(val==""){
				$("#idNumberError").show();
				$("#idNumberError").html("please enter id number");
				$("#idNumberError").css("color","red");
				idNumberError=false;
				}
			else if(!exp.test(val)){
				$("#idNumberError").show();
				$("#idNumberError").html("please enter correct<b>Id Number");
				$("#idNumberError").css("color","red");  
				}
			else{
					$("#idNumberError").hide();
					idNumberError=true;
					}
			return idNumberError;
			}

		function validate_userContact(){

			var val=$("#userCont").val();
			var exp=/^(\+91)?[6-9][0-9]{9}$/;
			if(val==""){
                $("#userContactError").show();
                $("#userContactError").html("please enter user Contact");
                $("#userContactError").css("color","red");
				userContactError=false;
				}
			else if(!exp.test(val)){
				 $("#userContactError").show();
				 $("#userContactError").html("Please Enter <b>Correct Mobile number</b>");
				 $("#userContactError").css("color","red");
				}

			else{
					$("#userContactError").hide();
			          userContactError=true;
			}
			return userContactError;
		}
		function validate_userEmail(){
            var exp=/^[A-Za-z0-9-_]+\@[A-Za-z]{0,9}\.[a-z]{2,6}$/;
			var val=$("#userEmail").val();
			if(val==""){
				$("#userMailError").show();
				$("#userMailError").html("please enter email address");
				$("#userMailError").css("color","red");
				userMailError=false;
				}
			else if(!exp.test(val))
				{
				$("#userMailError").show();
				$("#userMailError").html("please enter correct email");
				$("#userMailError").css("color","red");    
				}

			else{
					$("#userMailError").hide();
					userMailError=true;
					}
			return userMailError;
			}
		function validate_userCode(){

			var val=$("#userCode").val();
			var exp=/^[A-Z]{3,8}$/;
			if(val==""){
				$("#userCodeError").show();
				$("#userCodeError").html("please enter user code");
				$("#userCodeError").css("color","red");
				
				userCodeError=false;
				}
			else if(!exp.test(val)){
				$("#userCodeError").show();
				$("#userCodeError").html("please enter <b>A To Z</b> in capital letters");
				$("#userCodeError").css("color","red");
				}
			else{

					$("#userCodeError").hide();
					userCodeError=true;
					}
			return userCodeError;
			}
		function validate_userType(){

			var len=$('input[type="radio"][name="userType"]:checked').length;
			if(len==""){
				$("#userTypeError").show();
				$("#userTypeError").html("please choose one option")
				$("#userTypeError").css("color","red");
				userTypeError=false;
				}else{
					$("#userTypeError").hide();
					userTypeError=true;
					}
					return userTypeError;
			}	
		function validate_autoFill(){

			var val=$('input[type="radio"][name="userType"]:checked').val();
			if(val=="Vendor"){
				$("#userFor").val("Purchase");
				}
			else if(val=="Customer"){

				$("#userFor").val("Sale");
				}
			}
		$("#register").click(function(){
			userTypeError=false;
		    userCodeError=false;
		    userMailError=false;
		    userContactError=false;
		    idNumberError=false;
		    useridTypeError=false;
		    
			validate_userType();
			validate_userCode();
			validate_userEmail();
			validate_userContact();
			validate_idNumber();
			validate_idType();
			
			if(userTypeError && userCodeError && userMailError && userContactError &&
					idNumberError && useridTypeError)
				return true;
			else
				return false;
			});
		});

	
	</script>
</body>

</html>