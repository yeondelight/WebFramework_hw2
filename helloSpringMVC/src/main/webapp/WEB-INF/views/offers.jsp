<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>csemall pages</title>
</head>
<body>
	<c:forEach var="offer" items="${offers}">
		<p> <c:out value="${offer}"></c:out>
	</c:forEach>
</body>
</html>