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
	String num = request.getParameter("num");
	if (num.equals("1")) {
		out.write("1");
	} else if (num.equals("2")) {
		out.write("2");
	} else if (num.equals("3")) {
		out.write("3");
	} else if (num.equals("4")) {
		out.write("4");
	} else if (num.equals("5")) {
		out.write("5");
	} else {
		out.write("out of range");
	}
	%>
</body>
</html>