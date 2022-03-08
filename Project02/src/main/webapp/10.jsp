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


String[] chk1 = request.getParameterValues("chk1");

%>
<%= chk1[0] %>
<%= chk1[1] %>
</body>
</html>