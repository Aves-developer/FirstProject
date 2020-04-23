<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h3>Welcome To Document Page</h3>
<form action="upload" method="post" enctype="Multipart/form-data">
<pre>
ID:<input type="text" name="fileId"/>
Document<input type="file" name="fileOb"/>
<input type="Submit" value="upload"/>
</pre>
</form>
</body>
</html>