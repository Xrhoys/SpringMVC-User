<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body class="bg-dark container">
	<div class="jumbotron shadow rounded position-relative row d-flex justify-content-center" style="min-width: 1110px">
		<h1>Welcome! ${id}</h1>
		<table class="table">
			<thread>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Name</th>
					<th scope="col">First Name</th>
					<th scope="col">Home Phone</th>
					<th scope="col">Mobile Phone</th>
					<th scope="col">Work Phone</th>
					<th scope="col">Address</th>
					<th scope="col">Postal code</th>
					<th scope="col">City</th>
					<th scope="col">Email</th>
				</tr>
			</thread>
			<tbody>

				<c:forEach var="user" items="${users}">
				<tr>
					<th scope="row"><c:out value="${user.id}"/></th>
					<td><c:out value="${user.name}"/></td>
					<td><c:out value="${user.lastname}"/></td>
					<td><c:out value="${user.home_phone}"/></td>
					<td><c:out value="${user.mobile_phone}"/></td>
					<td><c:out value="${user.work_phone}"/></td>
					<td><c:out value="${user.address}"/></td>
					<td><c:out value="${user.postal}"/></td>
					<td><c:out value="${user.city}"/></td>
					<td><c:out value="${user.email}"/></td>
					<c:if test="${user.username == 'admin'}">
						<td>
							<a><c:url value='/remove?userID=${user.id}'/>Delete</a>
						</td>
					</c:if>

					<c:if test="${user.username == 'admin'}">
						<td>
							<a><c:url value='/profile?userID=${user.id}'/>Delete</a>
						</td>
					</c:if>
				</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>