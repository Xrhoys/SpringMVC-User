<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body class="bg-dark container">

	<form:form id="loginForm" modelAttribute="login" action="loginProcess"
		method="post" class="jumbotron shadow rounded">
		<table align="center">
			<tr>
				<td style="font-style: italic; color: red;">${message}</td>
			</tr>
		</table>

		<div class="form-group">
			<form:label path="username" class="">Username: </form:label>
			<form:input path="username" name="username" id="username" class="form-control" />
			<form:errors path="username"/>
		</div>
		<div class="form-group">
			<form:label path="password">Password:</form:label>
			<form:password path="password" name="password" id="password" class="form-control"/>
			<form:errors path="password"/>
		</div>
		<form:button id="login" name="login" class="btn btn-primary">Login</form:button>
		<p class=""><a href="#"> Forgot password?</a></p>
	</form:form>

</body>
</html>