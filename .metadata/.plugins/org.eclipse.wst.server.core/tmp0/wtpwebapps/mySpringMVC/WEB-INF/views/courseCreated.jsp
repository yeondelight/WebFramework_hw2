<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청 성공</title>
</head>
<body>
	${course.name}의 수강신청이 완료되었습니다.
	
	<p>
	<a href="${pageContext.request.contextPath}/courses?year=${course.year}&semester=${course.semester}">
		Click here to review creation
	</a>
	</p>
</body>
</html>