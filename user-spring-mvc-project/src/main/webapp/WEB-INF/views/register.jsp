<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="u" action="reg" method="post">
<form:label path="name">Name</form:label>
<form:input path="name"/>
<br>
<form:label path="age">Age</form:label>
<form:input path="age"/>
<br>
<form:label path="phone">Phone</form:label>
<form:input path="phone"/>
<br>
<form:label path="password">Password</form:label>
<form:input path="password"/>
 <br>
 <form:button>REGISTER</form:button>
</form:form>

</body>
</html>