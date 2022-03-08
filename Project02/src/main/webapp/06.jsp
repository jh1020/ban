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
String name = request.getParameter("name");
String Email = request.getParameter("Email");

out.println("이름: "+name);
out.print("이메일: "+Email);

%>
</body>
</html>