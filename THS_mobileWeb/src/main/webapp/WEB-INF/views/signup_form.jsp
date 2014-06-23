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
<link rel="stylesheet" href="css/button.css" type="text/css" />
<link rel="stylesheet" href="css/table_layout3.css" type="text/css" />
<script lang="JAVASCRIPT">
	function hello() {

		alert("hello");
		var id = document.getElementById("id").value;
		alert(id);

	}
</script>
</head>
<body>
	<form:form modelAttribute="user" method="POST" action="signUp.action">
		<div class="MYPAGE">
			<table>
				<tr>
					<th><spring:message code="label.user_loginId" /></th>
					<td><form:input id="id" path="loginId" /><br/> <input
						type="button" onclick="javascript:hello()" style="background-color:#AFEEEE;"
						value="<spring:message code="label.user_loginIdCheck"/>" /></td>
				</tr>
				<tr>
					<th><spring:message code="label.user_pw" /></th>
					<td><form:password path="pw" /></td>
				</tr>
				<tr>
					<th><spring:message code="label.user_pwCheck" /></th>
					<td><form:password path="pwCheck" /></td>
				</tr>
				<tr>
					<th><spring:message code="label.user_personId" /><br/> <spring:message
							code="label.studentOrProfessor" /></th>
					<td><form:input path="personId" /></td>
				</tr>
				<tr>
					<th><spring:message code="label.user_name" /></th>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<th><spring:message code="label.user_phoneNumber" /></th>
					<td><form:input path="phoneNumber" /></td>
				</tr>
				<tr>
					<th><spring:message code="label.user_position" /></th>
					<td><form:input path="position" /></td>
				</tr>
				<!-- must be combo box, 0 학생 1 교수 -->
				<tr>
					<th><spring:message code="label.user_department" /></th>
					<td><form:input path="dept_name" /></td>
				</tr>
				<!-- must be selector -->

				<tr>
					<td colspan=2><input type="submit" style="font-size:20px; background-color:#AFEEEE;"
						value="<spring:message code="label.signUp"/>"  /></td>
				</tr>
			</table>
		</div>
	</form:form>
</body>
</html>
