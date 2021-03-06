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
<link rel="stylesheet" href="css/table_layout3.css" type="text/css" />
<link rel="stylesheet" href="css/button.css" type="text/css" />
<!-- <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>"
	type="text/css" /> -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"
	type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/nav.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/schoolNotice_nav.js"/>"
	type="text/javascript"></script>

<script type="text/javascript">
	function addJavascript() {
		addNavScript();
		addSchoolNoticeNavScript();
		window.myJs.btnDisabled();
	}
</script>

</head>

<body onload="javascript:addJavascript()">

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
		<button id="school_nav-show">
			<spring:message code="label.menu.schoolNotice.show" />
		</button>
		<button id="school_nav-hide">
			<spring:message code="label.menu.schoolNotice.hide" />
		</button>
		<div id="school_nav">
			<jsp:include page="../nav/schoolNotice_nav.jsp" />
		</div>

		<div id="contents">
			<form:form modelAttribute="schoolBoard" method="POST"
				action="schoolBoardWrite.action">
				<div class="MYPAGE">
					<table>
						<tr>
							<th><spring:message code="label.schoolNotice.board.writer" /></th>
							<td><form:input readonly="true" value="${member.loginId}"
									path="id_writer" /></td>
						</tr>
						<tr>
							<th><spring:message code="label.schoolNotice.board.title" /></th>
							<td><form:input path="title" /></td>
						</tr>
						<tr>
							<th><spring:message code="label.schoolNotice.board.contents" />
							</th>
							<td><form:textarea path="contents" /></td>
						</tr>
						<tr>
							<td colspan="2"><form:input path="type" value="${type}"
									type="hidden" /> <input type="submit"
								value="<spring:message code="label.schoolNotice.board.submit"/>" />
							</td>
						</tr>
					</table>
				</div>
			</form:form>
		</div>
	</div>
	<div id="footer"></div>

</body>
</html>

<!-- 


 -->