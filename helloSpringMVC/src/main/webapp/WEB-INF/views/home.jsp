<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
	<p><a href="${pageContext.request.contextPath}/offers"> Show current offers </a></p>
	<p><a href="${pageContext.request.contextPath}/createoffer"> Add a new offers </a></p>
	
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<a href="javascript:document.getElementById('Logout').submit()">Logout</a>
	</c:if>
	
	<form id="Logout" action="<c:url value="/logout"/>" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
	
</body>
</html>
