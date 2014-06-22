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
<title>Course Enrollment</title>
<head>
<link rel="stylesheet" href="css/table_layout2.css" type="text/css" />
</head>
<!-- <link rel="stylesheet" href="<c:url value="/css/main_layout.css"/>" type="text/css" /> -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"
	type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/nav.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/javascript/nav/class_nav.js"/>"
	type="text/javascript"></script>

<script type="text/javascript">
	function addJavascript() {
		addNavScript();
		window.myJs.btnDisabled();
	}
</script>
</head>
</head>
<body onload="javascript:addJavascript()">

	<div id="header">
		<!-- 수강신청 -->
	</div>
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

		<div id="contents">
			<div id="courses">
				<form action="courseEnrollView.action" method="GET">
					<select name="department">
						<option value="all"><spring:message
								code="label.mainPage_course_allDepartment" /></option>
						<c:forEach var="dept" items="${departmentList}">
							<option value="${dept.dept_name}">${dept.dept_name}</option>
						</c:forEach>
					</select> <input type="hidden" name="id_user" value="${member.loginId}" />
					<input type="submit"
						value="<spring:message code="label.mainPage_course_select"/>" />
				</form>
				<div class="CSSTABLE2">
					<table>
						<thead>
							<tr>
								<th><spring:message code="label.mainPage_course_id_course" /></th>
								<th><spring:message code="label.mainPage_course_title" /></th>
								<th><spring:message code="label.mainPage_course_credits" /></th>
								<th><spring:message code="label.mainPage_course_location" /></th>
								<th><spring:message code="label.mainPage_course_currentNum" /></th>
								<th><spring:message code="label.mainPage_course_maxNum" /></th>
								<th><spring:message code="label.mainPage_course_enroll" /></th>
							</tr>
						</thead>
						<c:forEach var="course" items="${courseList}" varStatus="status">
							<tbody>
								<c:choose>
									<c:when test="${status.index%2 == 1}">
										<tr class="odd">
									</c:when>

									<c:otherwise>
										<tr>
									</c:otherwise>
								</c:choose>
								<td>${course.id_course}</td>
								<td>${course.title}</td>
								<td>${course.credits}</td>
								<td>${course.building}(${course.room_number})</td>
								<td>${course.currentNum}</td>
								<td>${course.maxNum}</td>
								<td><a
									href="courseEnroll.action?year=${year}&semester=${semester}&id_course=${course.id_course}&id_student=${member.loginId}&department=${member.dept_name}"><spring:message
											code="label.mainPage_course_enroll" /></a></td>
								</tr>
							</tbody>
						</c:forEach>
					</table>
				</div>
			</div>
			<div id="myCourse">
				<spring:message code="label.mainPage_course_myCourses" />
				<div class="CSSTABLE2">
					<table>
						<thead>
							<tr>
								<th><spring:message code="label.mainPage_course_id_course" /></th>
								<th><spring:message code="label.mainPage_course_title" /></th>
								<th><spring:message code="label.mainPage_course_credits" /></th>
								<th><spring:message code="label.mainPage_course_location" /></th>
								<th><spring:message code="label.mainPage_course_currentNum" /></th>
								<th><spring:message code="label.mainPage_course_maxNum" /></th>
								<th><spring:message code="label.mainPage_course_cancel" /></th>
							</tr>
						</thead>
						<c:forEach var="course" items="${myCourseList}" varStatus="status">
							<tbody>
								<c:choose>
									<c:when test="${status.index%2 == 1}">
										<tr class="odd">
									</c:when>

									<c:otherwise>
										<tr>
									</c:otherwise>
								</c:choose>
								<td>${course.id_course}</td>
								<td>${course.title}</td>
								<td>${course.credits}</td>
								<td>${course.building}(${course.room_number})</td>
								<td>${course.currentNum}</td>
								<td>${course.maxNum}</td>
								<td><a
									href="courseCancel.action?year=${course.year}&semester=${course.semester}&id_course=${course.id_course}&id_student=${member.loginId}&department=${member.dept_name}"><spring:message
											code="label.mainPage_course_cancel" /></a></td>
								</tr>
							</tbody>
						</c:forEach>
					</table>
				</div>

			</div>

		</div>
	</div>
	<div id="footer"></div>

</body>
</html>
