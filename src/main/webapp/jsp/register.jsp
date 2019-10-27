<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="user" action="registerProcess"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" name="username" id="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td><form:label path="name">FirstName</form:label></td>
				<td><form:input path="name" name="name"
                                id="name" /></td>
			</tr>
			<tr>
				<td><form:label path="lastname">LastName</form:label></td>
				<td><form:input path="lastname" name="lastname" id="lastname" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" name="address" id="address" /></td>
			</tr>
			<tr>
				<td>
					<form:label path="postal">Postal code</form:label>
				</td>
				<td>
					<form:input path="postal" name="postal" id="postal" />
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="city">City</form:label>
				</td>
				<td>
					<form:input path="city" name="city" id="city" />
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="mobile_phone">Mobile Phone</form:label>
				</td>
				<td>
					<form:input path="mobile_phone" name="mobile_phone" id="mobile_phone" />
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="home_phone">Home phone</form:label>
				</td>
				<td>
					<form:input path="home_phone" name="home_phone" id="home_phone" />
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="work_phone">Work phone</form:label>
				</td>
				<td>
					<form:input path="work_phone" name="work_phone" id="work_phone" />
				</td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>

</body>
</html>