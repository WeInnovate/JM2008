<%@ page import="java.util.*" %>
<jsp:useBean id="user" class="com.jm2008.learn.User" />
<jsp:setProperty property="*" name="user" />
<jsp:setProperty property="type" name="user" value="Normal" />
<%
List<String> modules = new ArrayList<>();
modules.add("Apple");
modules.add("Banana");
 

session.setAttribute("MOD", modules);

request.setAttribute("usr", user);

%>
<jsp:forward page="user.jsp">
	<jsp:param value="<%=user%>" name="u" />
</jsp:forward>