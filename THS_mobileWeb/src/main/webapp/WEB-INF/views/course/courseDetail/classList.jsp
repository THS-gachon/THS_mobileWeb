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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js" type="text/javascript"></script>


</head>
<body>

	<div id="header">
		<!-- 수강신청 -->
		Mobile Class
	</div>
	<div id="body">
		<button id="nav-show"><spring:message code="label.show_menu"/><!-- <img src="images/plus.png" alt="plus">--></button>
    	<button id="nav-hide"><spring:message code="label.hide_menu"/><!--<img src="images/minus.png" alt="minus">--></button>
    	<br/>
		<div id="nav"><jsp:include page="nav.jsp"></jsp:include></div>
		<div id="contents">
			<div id="classList">
				<table>
					<tr>
						<th><spring:message code="label.mainPage_course_id_course" /></th>
						<th><spring:message code="label.mainPage_course_professorInfo" /></th>
					</tr>
					<c:forEach var="course" items="${myCourseList}">
						<tr>
							<td><a href="classEnterance.action?year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&type=0&id_student=${member.loginId}">${course.title}</a></td>
							<td>${course.professor.name}</td>
						<tr/>
					</c:forEach>
				</table>
			</div>
			<div id="myReport">
				
			</div>
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
</script>
</body>
</html>
