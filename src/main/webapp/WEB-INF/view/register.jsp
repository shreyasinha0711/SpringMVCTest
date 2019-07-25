<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registeration</title>
<style>
.error {color ="red";
	
}
</style>
</head>
<body>
	<h3>${messageHeader}</h3>
	<h1 align="center">USER REGISTERATION DESK</h1>
	<div align="center">
	<form:form action="/SpringMVCTest/registerSuccess" method="post"
		modelAttribute="user">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><form:select path="country" >
				 <form:option value="India">India</form:option>
					<form:option value="US">US</form:option>
					 <form:option value="UK">UK</form:option></form:select>
				</td>
				<td><form:errors path="country" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssClass="error" /></td>
			</tr>
		</table>
		<input type="submit" value="Register Here" />
	</form:form></div>
</body>
</html>