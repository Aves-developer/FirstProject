<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
<h3>WELCOME TO WHUSER EDIT PAGE</h3>
<form:form action="update" method="post" modelAttribute="WhUserType">
<pre>
User ID<form:input path="userId" readOnly="true"/>
UserType<form:radiobutton path="userType" value="Vendor"/>Vendor <form:radiobutton path="userType" value="Customer"/>Customer
UserCode<form:input path="userCode"/>
UserFor<form:select path="userFor">
<form:option value="">-SELECT-</form:option>
</form:select>
User Email<form:input path="userEmail"/>
User Contact<form:input path="userCont"/>
User ID Type<form:select path="useridType">
<form:option value="">SELECT</form:option>
<form:option value="PAN CARD">PAN CARD</form:option>
<form:option value="AADHAR CARD">AADHAR CARD</form:option>
<form:option value="VOTER ID">VOTER ID</form:option>
<form:option value="OTHER">OTHER</form:option>
</form:select>
*If Other<form:input path="ifOther"/>
ID Number<form:input path="idNumber"/>
<input type="submit" value="updateWhUser"/>
</pre>
</form:form>
  ${message}

</body>
</html>