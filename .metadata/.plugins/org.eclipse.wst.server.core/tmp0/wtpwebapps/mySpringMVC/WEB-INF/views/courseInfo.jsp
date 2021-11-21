<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Course Info</title>
</head>
<body>
	<p><a href="${pageContext.request.contextPath}/courses"> 학기별 이수 학점 조회 </a></p>
	<p><a href="${pageContext.request.contextPath}/createCourse"> 수강 신청하기 </a></p>
	<p><a href="${pageContext.request.contextPath}/courses?year=2022&semester=1"> 수강 신청 조회 </a></p>
</body>
</html>