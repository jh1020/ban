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
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");

String op = request.getParameter("op");

switch(op){
case "sum" :
	int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
	out.print(sum);
	break;
case "mi" :
	int mi = Integer.parseInt(num1) - Integer.parseInt(num2);
	out.print(mi);
	break;
case "div" :
	int div = Integer.parseInt(num1) / Integer.parseInt(num2);
	out.print(div);
	break;
case "mu" :
	int mu = Integer.parseInt(num1) * Integer.parseInt(num2);
	out.print(mu);
	break;
}

%>
</body>
</html>