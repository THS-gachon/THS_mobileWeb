<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title><spring:message code="label.app.title" /></title>
<link rel="stylesheet" href="css/index.css" type="text/css" />
</head>
<body>
	<h1>
		<spring:message code="label.app.title" />
	</h1>

	<div class="index">
		<table>
			<tr>
				<td><h2>
						<a href="myPage.action?id_user=${member.loginId}"><spring:message
								code="label.menu.myPage" /></a>
					</h2></td>
			</tr>
			<tr>
				<td><h2>
						<a
							href="schoolBoard.action?type=0&page=0&id_user=${member.loginId}"><spring:message
								code="label.menu.schoolNotice" /></a>
					</h2></td>
			</tr>
			<tr>
				<td><h2>
						<a href="classList.action?id_user=${member.loginId}"><spring:message
								code="label.menu.myClass" /></a>
					</h2></td>
			</tr>

			<tr>
				<td><h2>
						<a
							href="courseEnrollView.action?department=all&id_user=${member.loginId}"><spring:message
								code="label.menu.courseEnroll" /></a>
					</h2></td>
			</tr>
		</table>
	</div>
</body>
</html>
