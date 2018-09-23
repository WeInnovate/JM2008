<jsp:useBean id="user" class="com.jm2008.learn.User" />
<jsp:setProperty property="*" name="user" />
<jsp:setProperty property="type" name="user" value="Normal" />

<jsp:forward page="user.jsp">
	<jsp:param value="<%=user%>" name="u" />
</jsp:forward>