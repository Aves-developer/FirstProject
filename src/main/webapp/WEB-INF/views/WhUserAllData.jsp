<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
<H3>WELCOME TO WHUSER DATA PAGE</H3>
<c:choose>
<c:when test="${!empty list }">
<table border="1">
<tr><th>ID</th><th>UTYPE</th><th>UCODE</th><th>USERFOR</th><th>UEMAIL</th><th>UCONTACT</th><th>UIDTYPE</th><th>IFOTHER</th><th>IDNUMBER</th></tr>

<c:forEach items="${list }" var="ur">
<tr>
<td>${ur.userId }</td>
<td>${ur.userType }</td>
<td>${ur.userCode }</td>
<td>${ur.userFor }</td>
<td>${ur.userEmail }</td>
<td>${ur.userCont }</td>
<td>${ur.useridType }</td>
<td>${ur.ifOther }</td>
<td>${ur.idNumber}</td>
<td><a href="delete?uid=${ur.userId }">Delete</a></td>
<td><a href="edit?uid=${ur.userId }">Edit</a></td>
<td><a href="view?uid=${ur.userId }">View</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise><h3>Data not found!!!!!</h3></c:otherwise>
</c:choose>
</body>
</html>