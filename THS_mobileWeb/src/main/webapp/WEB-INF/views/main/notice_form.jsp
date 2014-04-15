<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Notice</title>
<link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>"
	type="text/css" />
</head>

<body>

	<div id="header"></div>

	<div id="body" style="width: 100%; height: 100%;">
		<div id="nav">
			<jsp:include page="main_leftnav.jsp" /><!-- menu page -->
		</div>
		<div id="contents">
			<form:form modelAttribute="schoolBoard" method="POST"
				action="schoolBoardWrite.action">
				<spring:message code="label.schoolBoard_writer" />: <form:input
					readonly="true" value="${member.loginId}" path="id_writer" />
				<br />
				<spring:message code="label.schoolBoard_title" />: <form:input
					path="title" />
				<br />
				<spring:message code="label.schoolBoard_contents" />
				<br />
				<form:textarea path="contents" />
				<br />
				<form:input path="type" value="${type}" type="hidden" />
				<input type="submit"
					value="<spring:message code="label.schoolBoard_submit"/>" />
				<br />
			</form:form>
		</div>

	</div>
	<div id="footer"></div>

</body>
</html>

<!-- 


 -->