<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Notice</title>
<link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>" type="text/css" />
</head>
<body>

	<div id="header">
	
	</div>

	<div id="body">
		<div id="nav">
			<jsp:include page="main_leftnav.jsp" /><!-- menu page -->	
		</div>
		<div id="contents">
			<div id="record">
			<h3><spring:message code="label.schoolBoard_title"/>: ${record.title}</h3>
			<h5><spring:message code="label.schoolBoard_dateWritten"/>: ${record.dateForRecord}</h5>
			<h5><spring:message code="label.schoolBoard_viewCount"/>: ${record.readNum}</h5>
			<h4><spring:message code="label.schoolBoard_contents"/>: </h4>
			<p>
				${record.contents}
			</p>
			<h5><spring:message code="label.schoolBoard_ip"/>: ${record.ip}</h5>
			<h5><spring:message code="label.schoolBoard_writer"/>: ${record.id_writer}</h5>
			<br/>
			<a href="schoolBoard.action?type=${record.type}&page=${page}"><spring:message code="label.schoolBoard_back"/></a>
			</div>
			<div id="reply_form"> <!-- 원하는건 ajax -->
				<form:form modelAttribute="schoolBoardReply" method="POST" action="schoolBoardReply.action">
					<form:input path="id_writer" value="${member.loginId}" readonly="true" /><br/>
					<spring:message code="label.reply_contents"/>: <br/>
					<form:textarea path="contents"/><br/>
					<form:hidden path="board_date" value="${record.date_written}"/>
					<form:hidden path="board_writer" value="${record.id_writer}"/>
					<form:hidden path="board_type" value="${record.type}"/>
					<form:hidden path="page" value="${page}"/>
					<input type="submit" value="<spring:message code="label.reply_submit"/>"/>
				</form:form>
			</div>
			<div id="reply_list">
				<c:forEach var="reply" items="${replyList}">
					<br/><br/>
					<spring:message code="label.reply_writer"/>: ${reply.id_writer}<br/>
					<spring:message code="label.reply_contents"/>:<br/>
					<p>	${reply.contents}</p>
					<spring:message code="label.reply_ip"/>: ${reply.ip}<br/>
					<spring:message code="label.reply_date"/>: ${reply.dateForRecord}
				</c:forEach>
			</div>
			
		</div>
	</div>
	<div id="footer"></div>

</body>
</html>
