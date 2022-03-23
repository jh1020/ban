<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Model.BoardDAO"%>
<%@ page import="Model.BoardBean"%>
<%@ page import ="java.util.Vector"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정하기</title>
</head>
<body>
<center>
	<h2>수정하기</h2>
	<% 
		//해당 게시글 번호를 통하여 게시글을 수정할지
		int num = Integer.parseInt(request.getParameter("num").trim());
	
		//하나의 게시글의 대한 정보를 리턴 
		BoardDAO bdao = new BoardDAO();
		BoardBean bean = bdao.getOneUpdateBoard(num);
	%>
	<form action="BoardUpdateProc.jsp" method ="post">
		<table width = "600" border = "1" bgcolor="skyblue">
			<tr height= "40">
				<td width="120" align="center">작성자</td>
				<td width="180" align="center"><%=bean.getWrite()%></td>
				<td width="120" align="center">작성일자</td>
				<td width="180" align="center"><%=bean.getReg_date()%></td>
			</tr>
			
			<tr height= "40">
				<td width="120" align="center">제목</td>
				<td width="480" colspan="3">&nbsp;<input type="text" name="subject" value="<%=bean.getSubject()%>" size="60"></td>
			</tr>
			
			<tr height= "40">
				<td width="120" align="center">패스워드</td>
				<td width="480" colspan="3">&nbsp;<input type="password" name="password" size="60"></td>
			</tr>
			
			<tr height= "40">
				<td width="120" align="center">글내용</td>
				<td width="480" colspan="3"><textarea rows="10" cols="60" name="content" align="left"><%=bean.getContent()%></textarea></td>
			</tr>
			
			<tr height= "40">
				<td colspan="4" align="center">
					<input type="hidden" name="num" value="<%=bean.getNum() %>">
					<input type="submit" value="글수정">&nbsp;&nbsp;
					<input type="button" onclick = "location.href='BoardList.jsp'" value="전체 글 보기">
				</td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>