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

String id = request.getParameter("id");
if(id.equals("test")){
	out.write("test");
}else if(id.equals("test1")) {
	out.write("test1");
}else if (id.equals("test2")){
	out.write("test2");
}else {
	out.write("etc");
}





%>
</body>
</html>