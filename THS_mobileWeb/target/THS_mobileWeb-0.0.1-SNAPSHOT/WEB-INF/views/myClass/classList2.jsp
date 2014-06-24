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
<title>Class List</title>
<!-- <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>"
	type="text/css" /> -->
<link rel="stylesheet" href="css/button.css" type="text/css" />
<link rel="stylesheet" href="css/table_layout.css" type="text/css" />

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"
	type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/nav.js"/>"
	type="text/javascript"></script>
<script type="text/javascript">
	function addJavascript() {
		addNavScript();
		window.myJs.btnDisabled();
	}
</script>

</head>

<body onload="javascript:addJavascript()">

	<div id="header">Mobile Class</div>
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
		<div id="nav"><jsp:include page="../nav/nav.jsp"></jsp:include></div>
		<div id="contents">
			<div id="classList">
				<div class="CSSTABLE">
					<table>
						<thead>
							<tr>
								<th><spring:message code="label.myClass.course.title" /></th>
								<th><spring:message
										code="label.myClass.course.professor.name" /></th>
							</tr>
						</thead>
						<c:forEach var="myClass" items="${myClassList}" varStatus="status">
							<tbody>
								<c:choose>
									<c:when test="${status.index%2 == 1}">
										<tr class="odd">
									</c:when>

									<c:otherwise>
										<tr>
									</c:otherwise>
								</c:choose>
								<td><a
									href="classEnterance.action?year=${myClass.year}&semester=${myClass.semester}&id_course=${myClass.id_course}&type=0&id_student=${member.loginId}">${myClass.title}</a></td>
								<td>${myClass.professor.name}</td>
								<tr />
							</tbody>
						</c:forEach>
					</table>
				</div>
			</div>
			<div id="myReport"></div>
		</div>
	</div>
	<div id="footer"></div>

</body>
</html>
