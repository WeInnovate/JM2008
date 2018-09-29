<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<%=request.getParameter("u")%>
	<br /> ${paramValues.courses[0]} &nbsp; ${paramValues.courses[1]}
	&nbsp; ${paramValues.courses[2]}
	<br />
	<br> Host: ${header.host}
	<br> Accepts: ${header.accept}
	<br> Accepts Language: ${header["accept-language"]}
	<br> User Agent: ${header["user-agent"]}
	<br />
	${initParam.institute }
	<br />
	${pageContext.request.contextPath}
	<br />
	${sessionScope.MOD[0]}
${sessionScope.MOD[1]}
<br />
${requestScope.usr.name }
</body>
</html>