
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<table>
	<tr>
		<td><a href="main.action?selection=0"><spring:message
					code="label.mainPage_userInfo" /></a></td>
		<td><a href="schoolBoard.action?type=0&page=0"><spring:message
					code="label.mainPage_schoolNotice" /></a></td>
	</tr>
	<tr>
		<td><a href="main.action?selection=2"><spring:message
					code="label.mainPage_myClass" /></a></td>
		<td><a href="classList.action?id_user=${member.loginId}"><spring:message
					code="label.mainPage_course_courseList" /></a></td>
	</tr>
	<tr>
		<td><a
			href="courseView.action?department=all&id_student=${member.loginId}"><spring:message
					code="label.mainPage_course_courseEnroll" /></a></td>
		<td></td>
	</tr>
</table>
