
<!-- Scriplet Tag -->
<%
	int i = 10;
	int j = 20;
	int sum = i + j;
	out.println(sum);
	out.println(sum + globalVal);
	out.println(sumIt(100, 400));
%>

<br />

<!-- Expression Tag -->
<%=sum%><br />
<%=sum + 100%><br />
<%=sum + 100 + " Subham"%><br />

<!-- Declaration Tag -->
<%!
int globalVal = 100;
public int sumIt(int a, int b) {
		return a + b;
	}
%>