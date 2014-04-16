<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<a href="classBoardWrite.action?year=${year}&semester=${semester}&id_course=${id_course}&type=${type}&page=${page}"><spring:message
		code="label.schoolBoard_write" /></a><!--  -->
<br/>
<table border="1">
	<tr>
		<th><spring:message code="label.mainPage_course_writer" /></th>
		<th><spring:message code="label.schoolBoard_title" /></th>
		<th><spring:message code="label.schoolBoard_dateWritten" /></th>
		<th><spring:message code="label.schoolBoard_viewCount"/></th>
	</tr>
	<c:forEach var="record" items="${boardList}">
		<tr>
			<td>${record.name_writer}</td>
			<td><a
				href="classBoardRead.action?year=${record.year}&semester=${record.semester}&id_course=${record.id_course}&type=${record.type}&date_written=${record.date_written}&writer=${record.id_writer}&page=${page}&id_user=${member.loginId}">${record.title}</a></td>
			<td>${record.dateForList}</td>
			<td>${record.readNum }</td>

		</tr>
	</c:forEach>
</table>

<c:if test="${pageNums[0] != 0}">
	<a href="classBoard.action?year=${year}&semester=${semester}&id_course=${id_course}&type=${type}&page=${pageNums[0]-1}">◀</a>
</c:if>
<c:forEach var="cursor" items="${pageNums}">
				&nbsp; &nbsp; <a
		href="classBoard.action?year=${year}&semester=${semester}&id_course=${id_course}&type=${type}&page=${cursor}">
		<c:if test="${page==cursor}">
			<strong>
		</c:if>
		${cursor+1}
		<c:if test="${page==cursor}">
			</strong>
		</c:if></a>
</c:forEach>
<c:if test="${more == 1}"> &nbsp; &nbsp; <a
		href="classBoard.action?year=${year}&semester=${semester}&id_course=${id_course}&type=${type}&page=${pageNums[4]+1}">▶</a>
</c:if>
