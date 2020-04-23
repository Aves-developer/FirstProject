
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<body>
	<div class="container">
		<div class="card">
			<form action="save" method="POST">
				<%@include file="CommonUse.jsp"%>

				<div
					class="card-header bg-primary text-center text-white text-uppercase">
					<h3>WELCOME TO REGISTER PAGE</h3>
				</div>
				<div class="card-body">

					<div class="row">
						<div class="col-4">
							<label for="shipMode">SHIPMENT MODE</label>
						</div>
						<div class="col-4">
							<select name="shipMode" id="shipMode" class="form-control">
								<option value="">-Select-</option>
								<option value="Air">Air</option>
								<option value="Ship">Ship</option>
								<option value="Train">Train</option>
								<option value="truck">Truck</option>
								<option>
							</select>
						</div>
						<div class="col-4">
							<span id="shipModeError"></span>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="shipCode">SHIPMENT CODE</label>
						</div>
						<div class="col-4">
							<input type="text" name="shipCode" id="shipCode" class="form-control" />
						</div>
						<div class="col-2">
							<span id="shipCodeError"></span>
						</div>
						<div class="col-2">
						<form:errors name="shipCode" cssClass="text-danger"/>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="enbShip">SHIPMENT ENABLE</label>
						</div>
						<div class="col-4">
							<select name="enbShip" id="enbShip" class="form-control">
								<option value="">-select-</option>
								<option value="Yes">Yes</option>
								<option value="No">No</option>
							</select>
						</div>
						<div class="col-4">
							<span id="enbShipError"></span>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="shipGrad">SHIPMENT GRAD</label>
						</div>
						<div class="col-4">
							<input type="radio" name="shipGrad"  value="A" />A <input
								type="radio" name="shipGrad" value="B" />B <input type="radio"
								name="shipGrad" value="C" />C
						</div>
						<div class="col-4">
							<span id="shipGradError"></span>
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipDesc">DESCRIPTION</label>
						</div>

						<div class="col-4">
							<textarea name="shipDesc" id="shipDesc" class="form-control"></textarea>
						</div>
						<div class="col-4">
							<span id="shipDescError"></span>
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<input type="submit" value="CreatShipment" id="register"
								class="btn btn-success" />
						</div>
					</div>
				</div>
				<c:if test="${!empty message }">
					<div class="card-footer bg-info text-white text-center">
						<b>${message}</b>
					</div>
				</c:if>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			
			$("#shipModeError").hide();
			$("#shipCodeError").hide();
			$("#enbShipError").hide();
			$("#shipGradError").hide();
			$("#shipDescError").hide();
			
			var shipModeError=false;
			var shipCodeError=false;
			var enbShipError=false;
			var shipGradError=false;
			var shipDescError=false;

			$("#shipDesc").keyup(function(){
				valid_shipDesc();
				});

			$('input[type="radio"][name="shipGrad"]').change(function (){
                  valid_shipGrad();
               });

			$("#enbShip").change(function(){
				valid_enbShip();
				});
			$("#shipCode").keyup(function(){
				valid_shipCode();
				});
			$("#shipMode").change(function(){
				valid_shipMode();
				});
			function valid_shipDesc(){
        var val=$("#shipDesc").val();
        var exp=/^[A-Za-z0-9_,]{3,20}$/;
        if(val==""){
        	$("#shipDescError").show();
        	$("#shipDescError").html("please Fill Description");
        	$("#shipDescError").css("color","red");
        	shipDescError=false;
            }
        else if(!exp.test(val)){
        	$("#shipDescError").show();
        	$("#shipDescError").html("please insert minimum 3 letters");
        	$("#shipDescError").css("color","red");
            }
        else{
            	$("#shipDescError").hide();
                shipDescError=true;
				}
		return shipDescError;
			}
			function valid_shipGrad(){
       var len=$('input[type="radio"][name="shipGrad"]:checked').length;
       if(len=='0'){
           $("#shipGradError").show();
           $("#shipGradError").html("please select shipGrad");
           $("#shipGradError").css("color","red");
             shipGradError=false;
           }else{
        	   $("#shipGradError").hide();
               shipGradError=true;
               }
             return shipGradError;
				}
			function valid_enbShip(){
         var val=$("#enbShip").val();
         if(val==""){
         $("#enbShipError").show();
         $("#enbShipError").html("please Enable Ship");
         $("#enbShipError").css("color","red");
         enbShipErrro=false;
             } else{
         $("#enbShipError").hide();
         enbShipError=true;
				}
			return enbShipError;
			}
			function valid_shipCode(){
            var val=$("#shipCode").val();
            var exp=/^[A-Za-z0-9]{3,6}$/;
            if(val==""){
           $("#shipCodeError").show();
           $("#shipCodeError").html("Please Enter ShipCode ");
           $("#shipCodeError").css("color","red");
           shipCodeError=false;
                }
            else if(!exp.test(val)){
            	$("#shipCodeError").show();
            	$("#shipCodeError").html("please insert minimum three character");
            	$("#shipCodeError").css("color","red");
                }

            else{
            $("#shipCodeError").hide();
            shipCodeError=true;
				}
			return shipCodeError;
			}
			function valid_shipMode(){
                  var val=$("#shipMode").val();
                  if(val==""){
                      $("#shipModeError").show();
                      $("#shipModeError").html("please select one option");
                      $("#shipModeError").css("color","red");
                       shipModeError=false;
                      }else{
                    	  $("#shipModeError").hide();
                        shipModeError=true;
                          }
                  return shipModeError;
				}
			$("#register").click(function(){
				shipModeError=false;
				shipCodeError=false;
				enbShipError=false;
				shipGradError=false;
				shipDescError=false;
				valid_shipMode();
				valid_shipCode();
				valid_enbShip();
				valid_shipGrad();
				valid_shipDesc();
				if(shipModeError && shipCodeError && enbShipError && shipGradError && shipDescError)
					return true;
				else
					return false;
				});
		});
	</script>
</body>
</html>
