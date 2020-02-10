<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Add user</title>
	</head>
	<body>
		<a href="list">Return to user list</a><br />
		<form:form method="POST" modelAttribute="DBLogin">
			<table border="1">
				<tbody>
					<tr>
						<th>Login:</th>
						<td><form:input type="text" path="login" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="login" /></c:if></td>
					</tr>
					<tr>
						<th>Email:</th>
						<td><form:input type="text" path="email" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="email" /></c:if></td>
					</tr>
					<tr>
						<th>Password:</th>
						<td><form:input type="text" path="password" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="password" /></c:if></td>
					</tr>
					<tr>
						<th>Group:</th>
						<td><form:input type="text" path="group" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="group" /></c:if></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="submit" value="Add!" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</body>
</html>