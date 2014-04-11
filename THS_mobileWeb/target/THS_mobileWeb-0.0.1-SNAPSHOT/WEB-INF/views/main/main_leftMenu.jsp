<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<meta charset="utf-8">
	</head> 
	<body>
		
		<a href="main.action?selection=0"><spring:message code="label.mainPage_userInfo"/></a><br/>
		<a href="main.action?selection=1"><spring:message code="label.mainPage_notice"/></a><br/>
		<a href="main.action?selection=2"><spring:message code="label.mainPage_myClass"/></a><br/>
		<a href="main.action?selection=3"><spring:message code="label.mainPage_configuration"/></a><br/>
	</body>
</html>
