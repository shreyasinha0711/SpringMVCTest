<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Display User List</title>
</head>
<body>
	<h3 align="center">${headerMessage}</h3>
	<br><br>
	<div align="center">
	<c:forEach items="${list}" var="user">
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Country</th>
				<th>Email</th>
				<th>Age</th>
				<th>Phone</th>
			</tr>
			<tr>
				<td><c:out value="${user.name}" /></td>
				<td><c:out value="${user.country}" /></td>
				<td><c:out value="${user.email}" /></td>
				<td><c:out value="${user.age}" /></td>
				<td><c:out value="${user.phone}" /></td>
		</table>
	</c:forEach>
	</div>
</body>
</html>