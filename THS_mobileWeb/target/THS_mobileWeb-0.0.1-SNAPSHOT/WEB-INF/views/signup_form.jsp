<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
	<head>
		<meta charset="utf-8">
		<title>Login page</title> 
		<script lang="JAVASCRIPT">
			function hello(){
		
				alert("hello");
				var id = document.getElementById("id").value;
				alert(id);
				

			}
		</script>
	</head> 
	<body>
	<form:form modelAttribute="user" method="POST" action="signUp.action" >
		 	<spring:message code="label.user_loginId"/> <form:input id="id" path="loginId"/>
		 	<input type="button" onclick="javascript:hello()" value="<spring:message code="label.user_loginIdCheck"/>"/><br/>
			<spring:message code="label.user_pw"/> <form:password path="pw"/><br/>
			<spring:message code="label.user_pwCheck"/> <form:password path="pwCheck"/><br/>
			<spring:message code="label.user_personId"/>&nbsp;<spring:message code="label.studentOrProfessor"/>  <form:input path="personId"/><br/>
			<spring:message code="label.user_name"/> <form:input path="name"/><br/>
			<spring:message code="label.user_phoneNumber"/><form:input path="phoneNumber"/><br/>
			<spring:message code="label.user_position"/> <form:input path="position"/><br/><!-- must be combo box, 0 학생 1 교수 -->
			<spring:message code="label.user_department"/> <form:input path="dept_name"/><br/><!-- must be selector -->
			
			<input type="submit" value="<spring:message code="label.signUp"/>"/>
		</form:form>
		 
	</body>
</html>
