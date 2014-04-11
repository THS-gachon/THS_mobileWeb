<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>My Page</title>
</head>
<body>

	<div id="header"></div>

	<div id="body" style="width:100%; height:100%;">
		<div id="leftMenu" style="float:left;">
			<jsp:include page="main_leftMenu.jsp" /><!-- menu page -->			
		</div>
		<div id="contents" style="float:right;">
			<form:form modelAttribute="editedUser" action="myPage.action"
				method="POST">

				<spring:message code="label.user_loginId" />
				<form:input disabled="true" path="loginId" value="${member.loginId}" />
				<br />

				<!-- spring if else tag -->
				<c:choose>
					<c:when test="${member.position == 0}">
						<spring:message code="label.user_studentId" />
					</c:when>
					<c:otherwise>
						<spring:message code="label.user_professorId" />
					</c:otherwise>
				</c:choose>
				<form:input disabled="true" path="personId"
					value="${member.personId}" />
				<br />

				<spring:message code="label.user_pw" />
				<form:password path="pw" value="${member.pw}" />
				<br />

				<spring:message code="label.user_pwCheck" />

				<form:password path="pwCheck" />
				<br />


				<spring:message code="label.user_name" />
				<form:input disabled="true" path="name" value="${member.name}" />
				<br />


				<spring:message code="label.user_phoneNumber" />
				<form:input path="phoneNumber" value="${member.phoneNumber}" />
				<br />


				<spring:message code="label.user_department" />
				<form:input disabled="true" path="dept_name"
					value="${member.dept_name}" />
				<br />

				<input type="submit"
					value="<spring:message code="label.user_edit"/>" />
			</form:form>
		</div>
		
	</div>
	<div id="footer"></div>

</body>
</html>
