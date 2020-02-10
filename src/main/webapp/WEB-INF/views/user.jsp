<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>User details:</title>
	</head>
	<body>
		<a href="list">Return to user list</a><br />
		<table border="1">
			<tbody>
				<tr>
					<th>Login:</th>
					<td>${user.login}</td>
				</tr>
				<tr>
					<th>Email:</th>
					<td>${user.email}</td>
				</tr>
				<tr>
					<th>Password:</th>
					<td>${user.password}</td>
				</tr>
				<tr>
					<th>Group:</th>
					<td>${user.group}</td>
				</tr>
			</tbody>
		</table>
	</body>
</html>