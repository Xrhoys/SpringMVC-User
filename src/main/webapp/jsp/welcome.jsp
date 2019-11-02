<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table>
		<tr>
			<td>Welcome</td>
		</tr>
		<tr>
			<table>
				<tr>
					<c:forEach var="user" items="${users}">
						<td><a href="<c:url value='/profile?userID=${user.id}' />"><c:out value="${user.name}"/></a></td>
						<td><c:out value="${user.lastname}"/></td>
						<td><a href="<c:url value='/remove?userID=${user.id}'/>">Delete</a></td>
					</c:forEach>
				</tr>
			</table>
		</tr>
		<tr>
		</tr>
		<tr>
			<td><a href="home.jsp">Home</a></td>
		</tr>


	</table>
</body>
</html>