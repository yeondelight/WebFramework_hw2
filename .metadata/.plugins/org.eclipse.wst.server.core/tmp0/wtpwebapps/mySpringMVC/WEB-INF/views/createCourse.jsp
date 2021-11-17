<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Course</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
	<sf:form method = "POST" action="${pageContext.request.contextPath}/doCreate" modelAttribute="course">
		<table class = "formtable">
			<tr>
				<td class = "label"> Year : </td>
				<td>
				<sf:input class = "control" type = "text" path = "year" value = "2022" readonly = "true"/> <br/>
				<sf:errors class = "error" path = "year"/>
				</td>
			</tr>
			<tr>
				<td class = "label"> Semester : </td>
				<td>
				<sf:input class = "control" type = "text" path = "semester" value="1" readonly = "true"/> <br/>
				<sf:errors class = "error" path = "semester"/>
				</td>
			</tr>
			<tr>
				<td class = "label"> Name : </td>
				<td>
				<sf:input class = "control" type = "text" path = "name"/> <br/>
				<sf:errors class = "error" path = "name"/>
				</td>
			</tr>
			<tr>
				<td class = "label"> Type : </td>
				<td>
				<sf:input class = "control" type = "text" path = "type"/> <br/>
				<sf:errors class = "error" path = "type"/>
				</td>
			</tr>
			<tr>
				<td class = "label"> Professor : </td>
				<td>
				<sf:input class = "control" type = "text" path = "professor"/> <br/>
				<sf:errors class = "error" path = "professor"/>
				</td>
			</tr>
			<tr>
				<td class = "label"> Credit : </td>
				<td>
				<sf:input class = "control" type = "number" path = "credit" value=""/> <br/>
				<sf:errors class = "error" path = "credit"/>
				</td>
			</tr>
			<tr>
				<td> </td>
				<td> <input class = "control" type = "submit" value = "수강 신청하기"> </td>
			</tr>
		</table>
	</sf:form>
</body>
</html>