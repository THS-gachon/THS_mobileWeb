<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<ul>

	<li><a href="main.action?selection=0"><spring:message
				code="label.mainPage_userInfo" /></a></li>
	<li><a href="schoolBoard.action?type=0&page=0"><spring:message
				code="label.mainPage_schoolNotice" /></a></li>
	<li><a href="classList.action?id_user=${member.loginId}"><spring:message
			code="label.mainPage_course_courseList" /></a></li>
	<li><a href="main.action?selection=3"><spring:message
				code="label.mainPage_configuration" /></a><br /></li>
	<li><a href="courseView.action?department=all&id_student=${member.loginId}"><spring:message
				code="label.mainPage_course_courseEnroll" /></a><br/></li>
</ul>
