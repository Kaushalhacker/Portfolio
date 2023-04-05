<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${message!=null }">
<h2>${message }</h2>

</c:if>
<form action="loginuser" method="post">
<input type="tel" name="phone" placeholder="Enter the phone number"><br>
<input type="password" name="password" placeholder="Enter the password"><br>
<input type="submit" value="LOGIN">

</form>
<h3>
<a href="load?choice=1"> click to go For Registeration</a>
</h3>
</body>
</html>