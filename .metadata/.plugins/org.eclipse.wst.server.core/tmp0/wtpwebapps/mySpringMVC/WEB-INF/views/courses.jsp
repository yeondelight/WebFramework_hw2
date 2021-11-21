<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학기별 이수 학점 조회</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/table.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>년도</th> <th>학기</th> <th>취득 학점</th> <th>상세보기</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="sums" items="${sums}">
			<tr>
				<td><c:out value="${sums.getYear()}"/></td>
				<td><c:out value="${sums.getSemester()}"/></td>
				<td><c:out value="${sums.getCredit()}"/></td>
				<td>
					<c:url value="/courses" var="url">
						<c:param name="year" value="${sums.getYear()}" />
						<c:param name="semester" value="${sums.getSemester()}" />
					</c:url>
					<a href="${url}">링크</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td>총계</td>
				<td></td>
				<td><c:out value="${total}"/></td>
				<td></td>
			</tr>
		</tfoot>
	</table>
</body>
</html>