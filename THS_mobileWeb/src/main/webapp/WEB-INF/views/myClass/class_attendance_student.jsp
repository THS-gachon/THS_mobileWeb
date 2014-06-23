<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Attendance</title>
<!--  <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>" type="text/css" />-->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"
	type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/nav.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/class_nav.js"/>"
	type="text/javascript"></script>


<script type="text/javascript">
	function addJavascript(ip, isOnline) {
		addNavScript();
		addClassNavScript();
		if (isOnline == 1)
			window.myJs.btnEnabled(ip);
	};
	
	function onLoadAction(ip, isOnline)
	{
		//alert("hello");
		addJavascript(ip,isOnline);
	};
</script>

</head>

<body onload="javascript:onLoadAction('${classServer.ip}',${classServer.isOnline()})">

	<div id="header"></div>

	<div id="body">
		<button id="nav-show">
			<spring:message code="label.menu.show" />
			<!-- <img src="images/plus.png" alt="plus">-->
		</button>
		<button id="nav-hide">
			<spring:message code="label.menu.hide" />
			<!--<img src="images/minus.png" alt="minus">-->
		</button>
		<br />
		<div id="nav">
			<jsp:include page="../nav/nav.jsp"></jsp:include>
		</div>
		<button id="class_nav-show">
			<spring:message code="label.menu.class.show" />
		</button>
		<button id="class_nav-hide">
			<spring:message code="label.menu.class.hide" />
		</button>
		<div id="class_nav">
			<jsp:include page="../nav/class_nav.jsp" />
		</div>
		<div id="contents">
			<h3><spring:message code="label.myClass.attendance.studentTitle"/></h3>
			<table border="1">
			<tr>
				<th><spring:message code="label.myClass.attendance.week"/></th>
				<th><spring:message code="label.myClass.attendance.day"/></th>
				<th><spring:message code="label.myClass.attendance.state"/></th>
			</tr>
			<c:forEach var="attendance" items="${attendanceList}">
				<tr>
					<td>${attendance.week}</td>
					<td>${attendance.day}</td>
					<td>
					<c:if test="${attendance.state == 0}"><spring:message code="label.myClass.attendance.state.present"/></c:if>
					<c:if test="${attendance.state == 1}"><spring:message code="label.myClass.attendance.state.absent"/></c:if>
					<c:if test="${attendance.state == 2}"><spring:message code="label.myClass.attendance.state.late"/></c:if>
					</td>
				</tr>
			</c:forEach>
			</table>
		</div>
	</div>

	<div id="footer"></div>
</body>
</html>
