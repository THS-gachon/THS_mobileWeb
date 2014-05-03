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
<!--  <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>" type="text/css" />-->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js" type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/nav.js"/>" type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/class_nav.js"/>" type="text/javascript"></script>

<script type="text/javascript">
	function addJavascript()
	{
		addNavScript();
		addClassNavScript();
	}
</script>

</head>
<body onload="addJavascript()">

	<div id="header">
	
	</div>

	<div id="body">
		<button id="nav-show"><spring:message code="label.menu.show"/><!-- <img src="images/plus.png" alt="plus">--></button>
    	<button id="nav-hide"><spring:message code="label.menu.hide"/><!--<img src="images/minus.png" alt="minus">--></button>
    	<br/>
		<div id="nav">
			<jsp:include page="../nav/nav.jsp"></jsp:include>
		</div>
		<button id="class_nav-show"><spring:message code="label.menu.class.show"/></button>
		<button id="class_nav-hide"><spring:message code="label.menu.class.hide"/></button>
		<div id="class_nav">
			<jsp:include page="../nav/class_nav.jsp"/>
		</div>
		
		<div id="contents">
			<div id="record">
			<h3><spring:message code="label.myClass.board.title"/>: ${record.title}</h3>
			<h5><spring:message code="label.myClass.board.date"/>: ${record.dateForRecord}</h5>
			<h5><spring:message code="label.myClass.board.viewCount"/>: ${record.readNum}</h5>
			<h4><spring:message code="label.myClass.board.contents"/>: </h4>
			<p>
				${record.contents}
			</p>
			<h5><spring:message code="label.myClass.board.ip"/>: ${record.ip}</h5>
			<h5><spring:message code="label.myClass.board.writer"/>: ${record.name_writer}</h5>
			<br/>
			<a href="classBoard.action?year=${record.year}&semester=${record.semester}&id_course=${record.id_course}&type=${record.type}&page=${page}&id_user=${member.loginId}"><spring:message code="label.myClass.board.backToList"/></a>
			</div>
			<div id="reply_form"> <!-- 원하는건 ajax -->
				<form:form modelAttribute="classBoardReply" method="POST" action="classBoardReply.action">
					<form:input path="id_writer" value="${member.loginId}" readonly="true" /><br/>
					<spring:message code="label.myClass.board.reply.contents"/>: <br/>
					<form:textarea path="contents"/><br/>
					<form:hidden path="year" value="${record.year}"/>
					<form:hidden path="semester" value="${record.semester}"/>
					<form:hidden path="id_course" value="${record.id_course}"/>
					<form:hidden path="board_date" value="${record.date_written}"/>
					<form:hidden path="board_writer" value="${record.id_writer}"/>
					<form:hidden path="board_type" value="${record.type}"/>
					<form:hidden path="page" value="${page}"/>
					<input type="submit" value="<spring:message code="label.myClass.board.reply.submit"/>"/>
				</form:form>
			</div>
			<div id="reply_list">
				<c:forEach var="reply" items="${replyList}">
					<br/><br/>
					<spring:message code="label.myClass.board.reply.writer"/>: ${reply.name_writer}<br/>
					<spring:message code="label.myClass.board.reply.contents"/>:<br/>
					<p>	${reply.contents}</p>
					<spring:message code="label.myClass.board.reply.ip"/>: ${reply.ip}<br/>
					<spring:message code="label.myClass.board.reply.date"/>: ${reply.dateForRecord}
				</c:forEach>
			</div>
			
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>