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
String num = request.getParameter("num1");

int num1 = Integer.parseInt(num);
int ii = 0;

for(int i=0; i<=num1;i++) {
	out.print(i);
	out.print(" ");
}
out.println();
while(ii <= num1){
	out.print(ii);
	out.print(" ");
	ii++;
}
out.println();
int i=0;
do{
	out.print(i);
	out.print(" ");
	i++;
}while(i<=num1);
%>
</body>
</html>