<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet" href="css/menu.css" type="text/css" />
<div class="menu">
	<table>
		<tr>
			<td><spring:message code="label.menu.class.courseInfo" /></td>
			<td><spring:message code="label.menu.class.professorInfo" /></td>
		</tr>
		<tr>
			<td><a
				href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=0&page=0"><spring:message
						code="label.menu.class.notice" /></a></td>
			<td><a
				href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=1&page=0"><spring:message
						code="label.menu.class.freeBoard" /></a></td>
		</tr>
		<tr>
			<td><a
				href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=2&page=0"><spring:message
						code="label.menu.class.classMaterials" /></a></td>
			<td><a
				href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=3&page=0"><spring:message
						code="label.menu.class.materials" /></a></td>
		</tr>
		<tr>
			<td><a
				href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=4&page=0"><spring:message
						code="label.menu.class.report" /></a></td>
			<td></td>
		</tr>
		<tr>
			<td><spring:message code="label.menu.class.chat" /></td>
			<td><spring:message code="label.menu.class.findLocation" /></td>
		</tr>

		<!-- app -->
		<tr>
			<td><spring:message code="label.menu.class.attendance" /></td>
			<td><spring:message code="label.menu.class.remoteControl" /></td>
		</tr>


	</table>
</div>
