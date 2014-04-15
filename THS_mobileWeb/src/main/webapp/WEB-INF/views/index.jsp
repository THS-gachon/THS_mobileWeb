<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Mobile Class</title>
</head>
<body>
	<h1>
		<spring:message code="label.mainPage_title" />
	</h1>

	<h2>
		<a href="main.action?selection=0"><spring:message
				code="label.mainPage_userInfo" /></a>
	</h2>
	<h2>
		<a href="schoolBoard.action?type=0&page=0"><spring:message
				code="label.mainPage_schoolNotice" /></a>
	</h2>
	<h2>
		<a href="main.action?selection=2"><spring:message
				code="label.mainPage_myClass" /></a>
	</h2>
	<h2>
		<a href="main.action?selection=3"><spring:message
				code="label.mainPage_configuration" /></a>
	</h2>
</body>
</html>
