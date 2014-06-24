
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet" href="css/menu.css" type="text/css" />

<div class="menu">
	<table>
		<tr>
			<td><a href="myPage.action?id_user=${member.loginId}"><spring:message
						code="label.menu.myPage" /></a></td>
		</tr>
		<tr>
			<td><a
				href="schoolBoard.action?type=0&page=0&id_user=${member.loginId}"><spring:message
						code="label.menu.schoolNotice" /></a></td>
		</tr>
		<tr>
			<td><a href="classList.action?id_user=${member.loginId}"><spring:message
						code="label.menu.myClass" /></a></td>
		<tr />
		<tr>
			<td><a
				href="courseEnrollView.action?department=all&id_user=${member.loginId}"><spring:message
						code="label.menu.courseEnroll" /></a></td>
		</tr>
	</table>
</div>