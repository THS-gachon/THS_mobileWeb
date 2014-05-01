<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title><spring:message code="label.app.title"/></title>


<!-- <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>" type="text/css" /> -->

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js" type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/nav.js"/>" type="text/javascript"></script>
<script type="text/javascript">
	function addJavascript()
	{
		addNavScript();
	}
</script>
</head>

<body onload="javascript:addJavascript()">

	<div id="header"></div>

	<div id="body">
		<button id="nav-show"><spring:message code="label.menu.show"/> <!-- <img src="images/plus.png" alt="plus">--></button>
    	<button id="nav-hide"><spring:message code="label.menu.hide"/> <!-- <img src="images/minus.png" alt="minus">--></button>
 
		<div id="nav">
			<jsp:include page="../nav/nav.jsp" /><!-- menu page -->			
		</div>
		
		
		<div id="contents" >
			<form:form modelAttribute="user" action="editUser.action"
				method="POST">

				<spring:message code="label.user.loginId" />
				<form:input readonly="true" path="loginId" value="${member.loginId}" />
				<br/>

				<!-- spring if else tag -->
				<c:choose>
					<c:when test="${member.position == 0}">
						<spring:message code="label.user.personId.student" />
					</c:when>
					<c:otherwise>
						<spring:message code="label.user.personId.professor" />
					</c:otherwise>
				</c:choose>
				<form:input readonly="true" path="personId"
					value="${member.personId}" />
				<br />

				<spring:message code="label.user.pw" />
				<form:password path="pw" value="${member.pw}" />
				<br />

				<spring:message code="label.user.checkPw" />
				<form:password path="pwCheck" />
				<br />


				<spring:message code="label.user.name" />
				<form:input  readonly="true" path="name" value="${member.name}" />
				<br />


				<spring:message code="label.user.phoneNumber" />
				<form:input path="phoneNumber" value="${member.phoneNumber}" />
				<br />


				<spring:message code="label.user.department" />
				<form:input readonly="true" path="dept_name" value="${member.dept_name}" />
				<br/>
				
				<input type="submit"
					value="<spring:message code="label.user.edit"/>" />
			</form:form>
		</div>
		
	</div>
	<div id="footer"></div>
</body>
</html>
