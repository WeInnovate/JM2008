<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*, com.jm2008.learn.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>
	<h3>Out</h3>
	<br />
	<c:out value="Hello, " />
	<c:out value="${initParam.institute }" />

	<h3>Set</h3>
	<c:set var="userName" scope="request" value="atuldwivedi" />
	<c:out value="${requestScope.userName}" />

	<h3>Import</h3>
	<c:import var="data" url="http://www.google.com" />
	<%-- <c:out value="${data}"/>  --%>

	<h3>If</h3>
	<c:if test="${requestScope.userName eq 'atuldwivedi'}">
		<c:out value="${userName}" />
	</c:if>
	<c:if test="${requestScope.userName ne 'atuldwivedi1'}">
		<c:out value="Nothing is matching" />
	</c:if>

	<h3>URL</h3>
	<c:url value="index.jsp" var="myUrl">
		<c:param name="name" value="Atul Dwivedi" />
		<c:param name="percentage" value="99%" />
		<c:param name="key" value="@ is #" />
	</c:url>
	<c:out value="${myUrl}" />
	<br>
	<a href="${myUrl}">Home</a>
	<br>Redirect to
	<%-- <c:redirect url="${myUrl}" /> --%>

	<h3>For Each</h3>
	<%
		User user1 = new User("One", "one@onc.com", "11", 1, "Male", "M1,M2,M3".split(","), "BLR", "Comm One",
				"Admin");
		User user2 = new User("Two", "two@two.com", "22", 2, "Female", "M1,M2".split(","), "Delhi", "Comm Two",
				"CEO");
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		request.setAttribute("users", users);
	%>
	<c:forEach var="u" items="${requestScope.users}">
	Name: ${u.name} &nbsp; Email: ${u.email} &nbsp; ${u.mobile} &nbsp; ${u.age} &nbsp; ${u.gender} &nbsp; ${u.city} &nbsp; ${u.comment} &nbsp; ${u.type}
	<br>
	</c:forEach>

	<h3>Switch Case</h3>
	<c:set var="age" scope="session" value="90" />
	<c:out value="Age is: ${age}" />
	<br>

	<c:choose>
		<c:when test="${age <= 6 }">
You are baby.
</c:when>

		<c:when test="${age > 6 and age < 18 }">
You are teen.
</c:when>

		<c:when test="${age >= 18 and age < 60 }">
You are adult.
</c:when>

		<c:otherwise>
You must be senior citizen.
</c:otherwise>
	</c:choose>
	
	<h3>Catch</h3>
	<c:catch var="ex">
<% 
int val = 10/1; 
out.print(val);
%>
</c:catch>

<c:if test="${ex != null }">
<c:out value="${ex }" />
</c:if>
</body>
</html>