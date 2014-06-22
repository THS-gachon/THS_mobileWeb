<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Mobile Class</title>
<link rel="stylesheet" href="css/table_layout3.css" type="text/css" />
<!--  <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>"
	type="text/css" />-->
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

<body onload="javascript:addJavascript()">

	<div id="header"></div>

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
			<form:form modelAttribute="classBoard" method="POST"
				action="classBoardWrite.action">
				<div class="MYPAGE">
					<table>
						<tr>
							<th><spring:message code="label.myClass.board.writer" /></th><td> <form:input
					readonly="true" value="${member.loginId}" path="id_writer" /></td></tr>
				<tr><th>
				<spring:message code="label.myClass.board.title" /></th><td> <form:input
					path="title" /></td></tr>
					<tr><th>
				<spring:message code="label.myClass.board.contents" /></th><td>
				<form:textarea path="contents" /></td></tr>
				
				<form:input path="year" value="${year}" type="hidden"/>
				<form:input path="semester" value="${semester}" type="hidden"/>
				<form:input path="id_course" value="${id_course}" type="hidden"/>
				<form:input path="type" value="${type}" type="hidden" />
				<tr><td colspan="2"><input type="submit"
					value="<spring:message code="label.myClass.board.submit"/>" /></td></tr></table></div>
				<br/>
			</form:form>
		</div>

	</div>
	<div id="footer"></div>

</body>
</html>

<!-- 


 -->