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
<!--  <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>"
	type="text/css" />-->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js" type="text/javascript"></script>

</head>

<body>

	<div id="header"></div>

	<div id="body" style="width: 100%; height: 100%;">
		<button id="nav-show"><spring:message code="label.show_menu"/><!-- <img src="images/plus.png" alt="plus">--></button>
    	<button id="nav-hide"><spring:message code="label.hide_menu"/><!--<img src="images/minus.png" alt="minus">--></button>
    	<br/>
		<div id="nav"><jsp:include page="nav.jsp"></jsp:include></div>
		<button id="class_nav-show"><spring:message code="label.show_courseMenu"/></button>
		<button id="class_nav-hide"><spring:message code="label.hide_courseMenu"/></button>
		<div id="class_nav"><jsp:include page="class_nav.jsp"/></div>
		
		
		<div id="contents">
			<form:form modelAttribute="classBoard" method="POST"
				action="classBoardWrite.action">
				<spring:message code="label.schoolBoard_writer" />: <form:input
					readonly="true" value="${member.loginId}" path="id_writer" />
				<br />
				<spring:message code="label.schoolBoard_title" />: <form:input
					path="title" />
				<br />
				<spring:message code="label.schoolBoard_contents" />
				<br />
				<form:textarea path="contents" />
				<br/>
				<form:input path="year" value="${year}" type="hidden"/>
				<form:input path="semester" value="${semester}" type="hidden"/>
				<form:input path="id_course" value="${id_course}" type="hidden"/>
				<form:input path="type" value="${type}" type="hidden" />
				<input type="submit"
					value="<spring:message code="label.schoolBoard_submit"/>" />
				<br/>
			</form:form>
		</div>

	</div>
	<div id="footer"></div>

<script type="text/javascript">
	$('#nav').hide();
	$('#nav-show').show();
	$('#nav-hide').hide();
	$('#nav-show').click(function(){
		$('#nav-show').toggle();
		$('#nav-hide').toggle();
		$('#nav').slideDown();
	});
	$('#nav-hide').click(function(){
		$('#nav-hide').toggle();
		$('#nav-show').toggle();
		$('#nav').slideUp();
	});
	
	
	$('#class_nav').hide();
	$('#class_nav-show').show();
	$('#class_nav-hide').hide();
	$('#class_nav-show').click(function(){
		$('#class_nav-show').toggle();
		$('#class_nav-hide').toggle();
		$('#class_nav').slideDown();
	});
	$('#class_nav-hide').click(function(){
		$('#class_nav-hide').toggle();
		$('#class_nav-show').toggle();
		$('#class_nav').slideUp();
	});
</script>
</body>
</html>

<!-- 


 -->