<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<ul>
	<li><a href="main.action?selection=0"><spring:message
				code="label.mainPage_userInfo" /></a></li>
	<li>
		<a href="schoolBoard.action?type=0&page=0"><spring:message code="label.mainPage_schoolNotice"/></a>
		<ul>
		<li><a href="schoolBoard.action?type=0&page=0"><spring:message
				code="label.mainPage_schoolNotice_notice" /></a></li>
		<li><a href="schoolBoard.action?type=1&page=0"><spring:message
				code="label.mainPage_schoolNotice_news" /></a></li>
		<li><a href="schoolBoard.action?type=2&page=0"><spring:message
				code="label.mainPage_schoolNotice_scholarship" /></a></li>
		<li><a href="schoolBoard.action?type=3&page=0"><spring:message
				code="label.mainPage_schoolNotice_event" /></a></li>
		<li><a href="schoolBoard.action?type=4&page=0"><spring:message
				code="label.mainPage_schoolNotice_discussion"/></a></li>	
		</ul> 
	</li>
	<li><a href="main.action?selection=2"><spring:message
				code="label.mainPage_myClass" /></a><br /></li>
	<li><a href="main.action?selection=3"><spring:message
				code="label.mainPage_configuration" /></a><br /></li>
</ul>