<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Login page</title>
<script type="text/javascript">
	function sendIdPw(){
		var id = document.forms["loginForm"]["loginId"].value;
		var pw = document.forms["loginForm"]["pw"].value;
		window.myJs.sendIdPw(id,pw);
	}

</script>
</head>

<body>
	<form:form modelAttribute="user" name="loginForm" method="POST" action="login.action" onsubmit="javsscript:sendIdPw()">
		<table align="center" cellspacing="5px">
			<tr>
				<td>I D <form:input path="loginId" />
				</td>
				<td rowspan=2><input type="submit" value="Login"
					style="height: 70px; width: 70px" /></td>
			</tr>
			<tr>
				<td>PW <form:password path="pw" />
				</td>
			</tr>
			<tr>
				<td><a href="signUp.action"><spring:message
							code="label.signUp" /> </a> <c:if test="${member != null}">
						<a href="logOut.action"><spring:message code="label.logOut" /></a>
					</c:if></td>
			</tr>
		</table>
	</form:form>
</body>


</html>
