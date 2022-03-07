<%@ page language="java" import="java.sql.*,java.util.*,java.io.*,util.*" contentType="text/html;charset=euc-kr" %>

<html>
<head>
<title>4번 게시판</title>
</head>


<style type="text/css">
/* boardcss_list 에서 사용되는 글 등록 버튼 테이블 크기 */
#boardcss_list_add_button_table { width: 100%; margin: 0 auto 15px; /*position: relative; background: #bddcff; font-weight: bold;*/ }

/* 화면에 보여지는 글 등록 버튼 */
#boardcss_list_add_button_table .add_button { cursor: pointer; border: 1px solid #bebebe; position: absolute; right: 10px; top: 10px; width: 85px; padding: 6px 0 6px; text-align: center; font-weight: bold; }
#boardcss_list_add_button_table .add_button a { color: #ffffff; }

/* 글 등록 버튼과 글 목록이 겹치지 않게 만들어준 아무것도 아닌것 */
#boardcss_list_add_button_table .boardcss_list_add_button ul { width: 100%; overflow: hidden; height: 10px;}

/* boardcss_list 에서 사용하는 글 목록 테이블 크기*/
.boardcss_list_table { width: 100%; }

/* 화면에 보여지는 글 목록 테이블 */
.list_table { width: 100%; }

/* 화면에 보여지는 caption */
.list_table caption { display: none; }

/* list_table 에서 사용되는 thead */
.list_table thead th { text-align: center; border-top: 1px solid #e5e5e5; border-bottom: 1px solid #e5e5e5; padding: 8px 0; background: #faf9fa; }

/* list_table 에서 사용되는 tbody */
.list_table tbody td { text-align: center;  border-bottom: 1px solid #e5e5e5; padding: 5px 0; }

</style>

<body>

<!-- 등록버튼 시작 -->
<div id="boardcss_list_add_button_table">
	<div class="boardcss_list_add_button">
		<p class="add_button">등록</p>
		<ul></ul>
	</div>
</div>
<!-- 등록버튼 종료 -->

<!-- 테이블 시작 -->
<div class="boardcss_list_table">
	<table class="list_table">
		<caption>판다의 이상한 게시판</caption>
		<colgroup>
			<col width="15%" />
			<col width="45%" />
			<col width="20%" />
			<col width="20%" />
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>이름</th>
				<th>등록일자</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>5</td>
				<td>판다의 이상한 게시판 with CSS, DIV</td>
				<td>판다(panda)</td>
				<td>2012-10-19</td>
			</tr>
			<tr>
				<td>4</td>
				<td>판다의 이상한 게시판 with CSS, DIV</td>
				<td>판다(panda)</td>
				<td>2012-10-19</td>
			</tr>
			<tr>
				<td>3</td>
				<td>판다의 이상한 게시판 with CSS, DIV</td>
				<td>판다(panda)</td>
				<td>2012-10-19</td>
			</tr>
			<tr>
				<td>2</td>
				<td>판다의 이상한 게시판 with CSS, DIV</td>
				<td>판다(panda)</td>
				<td>2012-10-19</td>
			</tr>
			<tr>
				<td>1</td>
				<td>판다의 이상한 게시판 with CSS, DIV</td>
				<td>판다(panda)</td>
				<td>2012-10-19</td>
			</tr>
		</tbody>
	</table>
</div>
<!-- 테이블 종료 -->

</body>
</html>