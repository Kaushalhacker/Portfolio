<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${user!=null }">
<h3><a href="load?choice=2">Edit</a></h3>
<h3><a href="view.jsp">Profile</a></h3>
<h3><a href="delete?id=${user.getId() }">Delete</a></h3>
<h3><a href="logout">logout</a></h3>
</c:if>
</body>
</html>