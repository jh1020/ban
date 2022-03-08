<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String check = "test";
		String id = request.getParameter("id");
	
	
		if (check.equals("test")) {
%>
		<h2>checked</h2> <%= id %>
			<%
		}else {
			%>
			<h2>unchecked</h2><%= id %>
			<%
		}
	%>
	
</body>
</html>