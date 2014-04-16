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
<title>Notice</title>
<!-- <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>"
	type="text/css" /> -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js" type="text/javascript"></script>

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
		$('#coures_nav').slideDown();
	});
	$('#class_nav-hide').click(function(){
		$('#class_nav-hide').toggle();
		$('#class_nav-show').toggle();
		$('#class_nav').slideUp();
	});
</script>
</head>
<body>

	<div id="header">
		<!-- 수강신청 -->
		Mobile Class
	</div>
	<div id="body">
		<button class="nav-show"><spring:message code="label.show_menu"/><!-- <img src="images/plus.png" alt="plus">--></button>
    	<button class="nav-hide"><spring:message code="label.show_menu"/><!--<img src="images/minus.png" alt="minus">--></button>
    	<br/>
		<div id="nav"><jsp:include page="nav.jsp"></jsp:include></div>
		<button class="class_nav-show"><spring:message code="label.show_courseMenu"/></button>
		<button class="class_nav-hide"><spring:message code="label.hide_courseMenu"/></button>
		<div id="class_nav"><jsp:include page="class_nav.jsp"/></div>
		<div id="contents">
			<div id="classes">
				<table>
					<tr>
						<th><spring:message code="label.mainPage_course_id_course" /></th>
						<th><spring:message code="label.mainPage_course_title" /></th>
					</tr>
					<c:forEach var="course" items="${myCourseList}">
						<tr>
							<td>${course.title} (${course.professor.name})</td>
						<tr />
					</c:forEach>
				</table>
			</div>
			<div id="myReport">
				
			</div>
		</div>
	</div>
	<div id="footer"></div>

</body>
</html>
