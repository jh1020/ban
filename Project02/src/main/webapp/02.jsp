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

int inum1 = Integer.parseInt(num1);
int inum2 = Integer.parseInt(num2);

if(op.equals("+")){
	int sum = inum1+inum2;
	
	out.print(sum);
	
}else if(op.equals("-")){
	int mi = inum1-inum2;
	
	out.print(mi);
	
}else if(op.equals("*")){
	int mu = inum1*inum2;
	
	out.print(mu);
	
}else if(op.equals("/")){
	double div = inum1/inum2;
	
	out.print(div);
	
}

%>
</body>
</html>