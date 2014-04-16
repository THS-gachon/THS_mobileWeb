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
			<jsp:include page="main_schoolNotice_leftnav.jsp" /><!-- menu page -->			
		</div>
		<div id="contents">
			<jsp:include page="school_board_list.jsp"/>
		</div>
	</div>
	<div id="footer"></div>

</body>
</html>
