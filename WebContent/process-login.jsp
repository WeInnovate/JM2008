<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String userName = request.getParameter("username");
	String password = request.getParameter("password");

	if (userName.equals(password)) {
		request.setAttribute("msg", "Login successfull!");
		RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		rd.forward(request, response);
	} else {
		%>
		<c:redirect url="login.jsp?msg=Login+Failed" />
		<!-- response.sendRedirect("login.jsp?msg=Login+Failed"); -->
		<%
	}
%>