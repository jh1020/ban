<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Model.BoardBean" %>
<%@ page import= "java.util.Vector" %>
<%@page import="Model.BoardDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<center>
		<h2>전체 게시글 보기</h2>
		<%
		int count = 0;
		int number = 0;
		
		BoardDao bdao = new BoardDao();
		
		Vector<BoardBean> vec = bdao.getAllBoard(0, 100);
		%>
		<table width="700" board="1" bgcolor="skyblue">
			<tr height="40">
				<td align="right" colspan="5"><input type="button" value="글쓰기"
					onclick=""></td>
			</tr>
			<tr height="40">
				<td width="50" align="center">번호</td>
				<td width="320" align="center">제목</td>
				<td width="100" align="center">작성자</td>
				<td width="150" align="center">작성일</td>
				<td width="80" align="center">조회수</td>
			</tr>	
			
			<%
			for(int i=0;i<vec.size();i++){
				BoardBean bean = vec.get(i);
			
			%>
			
			
			
				<tr height="40" bgcolor="#FFFFFF">
				<td width="50" align="center"><%= bean.getNum() %></td>
				<td width="320" align="center"><%= bean.getSubject() %></td>
				<td width="100" align="center"><%= bean.getWrite() %></td>
				<td width="150" align="center"><%= bean.getReg_date() %></td>
				<td width="80" align="center"><%= bean.getReadcount() %></td>
			</tr>	
			<%
			}
			
			%>
			<tr height="40" bgcolor="#FFFFFF">
				<td width="50" align="center">1</td>
				<td width="320" align="center">안녕하세요</td>
				<td width="100" align="center">홍길동</td>
				<td width="150" align="center">2021.03.17</td>
				<td width="80" align="center">1</td>
			</tr>	
			
		</table>
	</center>
</body>
</html>