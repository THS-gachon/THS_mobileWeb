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
			<td><c:if test="${type==0}">
					<strong>
				</c:if> <a href="schoolBoard.action?type=0&page=0"><spring:message
						code="label.menu.schoolNotice.notice" /></a> <c:if test="${type==0}">
					</strong>
				</c:if></td>
		</tr>
		<tr>
			<td><c:if test="${type==1}">
					<strong>
				</c:if> <a href="schoolBoard.action?type=1&page=0"><spring:message
						code="label.menu.schoolNotice.news" /></a> <c:if test="${type==1}">
					</strong>
				</c:if></td>
		</tr>

		<tr>
			<td><c:if test="${type==2}">
					<strong>
				</c:if> <a href="schoolBoard.action?type=2&page=0"><spring:message
						code="label.menu.schoolNotice.scholarship" /></a> <c:if
					test="${type==2}">
					</strong>
				</c:if></td>
		</tr>
		<tr>
			<td><c:if test="${type==3}">
					<strong>
				</c:if> <a href="schoolBoard.action?type=3&page=0"><spring:message
						code="label.menu.schoolNotice.event" /></a> <c:if test="${type==3}">
					</strong>
				</c:if></td>
		</tr>


		<tr>
			<td><c:if test="${type==4}">
					<strong>
				</c:if> <a href="schoolBoard.action?type=4&page=0"><spring:message
						code="label.menu.schoolNotice.discussion" /></a> <c:if
					test="${type==4}">
					</strong>
				</c:if></td>
		</tr>
	</table>
</div>
