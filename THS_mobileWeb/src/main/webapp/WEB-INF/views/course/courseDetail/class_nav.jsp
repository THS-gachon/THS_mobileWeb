<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<table>
	<tr>
		<td>
			<spring:message code="label.mainPage_course_info"/>
		</td>
		<td>
			<spring:message code="label.mainPage_course_professorInfo"/>
		</td>
	</tr>
	<tr>
		<td>
			<a href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=0&page=0"><spring:message code="label.mainPage_course_notice"/></a>
		</td>
		<td>
			<a href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=1&page=0"><spring:message code="label.mainPage_course_freeBoard"/></a>
		</td>
		
	</tr>
	<tr>
		<td>
			<a href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=2&page=0"><spring:message code="label.mainPage_course_classMaterials"/></a>
		</td>
		<td>
			<a href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=3&page=0"><spring:message code="label.mainPage_course_materials"/></a>
		</td>
	</tr>
	<tr>
		<td>
			<a href="classBoard.action?id_user=${member.loginId}&year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=4&page=0"><spring:message code="label.mainPage_course_report"/></a>
		</td>
		<td>
		</td>
	</tr>
	<tr>
		<td>
			<spring:message code="label.mainPage_course_attendance"/>
		</td>
		<td>
			<spring:message code="label.mainPage_course_findClassRoom"/>	
		</td>
	</tr>
	
	<!-- app -->
	<tr>
		<td>
			<spring:message code="label.mainPage_course_chatting"/>
		</td>
		<td>
			<spring:message code="label.mainPage_course_remoteControl"/>
			
		</td>
	</tr>


</table>
