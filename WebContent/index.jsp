<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,java.io.*"%>
<%@ page errorPage="fail.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JSP</title>
</head>
<body>
	<%-- <%@ include file="header.jsp"%> --%>
	<jsp:include page="header.jsp" />
	<h1>
		<a href="scripting.jsp">JSP Scripting Tags</a>
	</h1>
	<ul>
		<li>Scriptlet Tags</li>
		<li>Expression Tag</li>
		<li>Declaration Tag</li>
	</ul>
	<h1>Flows</h1>
	<ul>
		<li><a href="login.jsp">Login Flow</a></li>
	</ul>

	<%
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Guava");
		out.print(list);
	%>
	
	<hr />
	<br>${param.name }
	<br>${param.percentage }
	<br>${param.key }

	<%-- <%
		int i = 10 / 0;
	%> --%>

	<br />
	<%-- <%@ include file="footer.jsp"%> --%>
	<jsp:include page="footer.jsp" />
</body>
</html>