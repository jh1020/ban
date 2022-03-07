<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Index
<%
	for(int i=1;i<10;i++) {
		System.out.println(i);
		out.println(i);
	}
%>

<%
	for(int i=1;i<10;i++) {
%>		
<h1>test</h1>
	<%=i %>	
<%
	}


%>
</body>
</html>