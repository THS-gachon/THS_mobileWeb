<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<a href="schoolBoardWrite.action?type=${type}&page=${page}"><spring:message
		code="label.schoolNotice.board.write" /></a>
<br />
<table border="1">
	<tr>
		<th><spring:message code="label.schoolNotice.board.writer" /></th>
		<th><spring:message code="label.schoolNotice.board.title" /></th>
		<th><spring:message code="label.schoolNotice.board.contents" /></th>
		<th><spring:message code="label.schoolNotice.board.viewCount"/></th>

	</tr>
	<c:forEach var="record" items="${boardList}">
		<tr>
			<td>${record.id_writer}</td>
			<td><a
				href="schoolBoardRead.action?type=${type}&date_written=${record.date_written}&writer=${record.id_writer}&page=${page}">${record.title}</a></td>
			<td>${record.dateForList}</td>
			<td>${record.readNum }</td>

		</tr>
	</c:forEach>
</table>

<c:if test="${pageNums[0] != 0}">
	<a href="schoolBoard.action?type=${type}&page=${pageNums[0]-1}">◀</a>
</c:if>
<c:forEach var="cursor" items="${pageNums}">
				&nbsp; &nbsp; <a
		href="schoolBoard.action?type=${type}&page=${cursor}"><c:if
			test="${page==cursor}">
			<b>
		</c:if>${cursor+1}<c:if test="${page==cursor}">
			</b>
		</c:if></a>
</c:forEach>
<c:if test="${more == 1}"> &nbsp; &nbsp; <a
		href="schoolBoard.action?type=${type}&page=${pageNums[4]+1}">▶</a>
</c:if>