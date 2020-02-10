<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>User list:</title>
	</head>
	<body>
		<a href="<c:url value="add" />">Add user</a><br />
		<table border="1">
			<thead>
				<tr>
					<th>#</th>
					<th>User login:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${user}" var="user" varStatus="status">
				<tr>
					<td>${status.index}</td>
					<td><a href="<c:url value="user-${status.index}" />">${user.login}</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>