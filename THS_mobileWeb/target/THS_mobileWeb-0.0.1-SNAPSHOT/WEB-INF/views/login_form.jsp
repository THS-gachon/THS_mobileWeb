<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Login page</title> 
	</head> 
	<body>
	<form:form modelAttribute="user" method="POST" action="login.action" >
			ID <form:input path="loginId"/>
			<br/>
			Password <form:password path="pw"/>
						
			<input type="submit"/>
		</form:form>
	</body>
	<a href="signUp.action"><spring:message code="label.signUp"/> </a>
	<c:if test="${member != null}"><a href="logOut.action"><spring:message code="label.logOut"/></a></c:if>

	
</html>
