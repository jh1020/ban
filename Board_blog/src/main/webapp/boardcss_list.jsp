<%@ page language="java" import="java.sql.*,java.util.*,java.io.*,util.*" contentType="text/html;charset=euc-kr" %>

<html>
<head>
<title>4�� �Խ���</title>
</head>


<style type="text/css">
/* boardcss_list ���� ���Ǵ� �� ��� ��ư ���̺� ũ�� */
#boardcss_list_add_button_table { width: 100%; margin: 0 auto 15px; /*position: relative; background: #bddcff; font-weight: bold;*/ }

/* ȭ�鿡 �������� �� ��� ��ư */
#boardcss_list_add_button_table .add_button { cursor: pointer; border: 1px solid #bebebe; position: absolute; right: 10px; top: 10px; width: 85px; padding: 6px 0 6px; text-align: center; font-weight: bold; }
#boardcss_list_add_button_table .add_button a { color: #ffffff; }

/* �� ��� ��ư�� �� ����� ��ġ�� �ʰ� ������� �ƹ��͵� �ƴѰ� */
#boardcss_list_add_button_table .boardcss_list_add_button ul { width: 100%; overflow: hidden; height: 10px;}

/* boardcss_list ���� ����ϴ� �� ��� ���̺� ũ��*/
.boardcss_list_table { width: 100%; }

/* ȭ�鿡 �������� �� ��� ���̺� */
.list_table { width: 100%; }

/* ȭ�鿡 �������� caption */
.list_table caption { display: none; }

/* list_table ���� ���Ǵ� thead */
.list_table thead th { text-align: center; border-top: 1px solid #e5e5e5; border-bottom: 1px solid #e5e5e5; padding: 8px 0; background: #faf9fa; }

/* list_table ���� ���Ǵ� tbody */
.list_table tbody td { text-align: center;  border-bottom: 1px solid #e5e5e5; padding: 5px 0; }

</style>

<body>

<!-- ��Ϲ�ư ���� -->
<div id="boardcss_list_add_button_table">
	<div class="boardcss_list_add_button">
		<p class="add_button">���</p>
		<ul></ul>
	</div>
</div>
<!-- ��Ϲ�ư ���� -->

<!-- ���̺� ���� -->
<div class="boardcss_list_table">
	<table class="list_table">
		<caption>�Ǵ��� �̻��� �Խ���</caption>
		<colgroup>
			<col width="15%" />
			<col width="45%" />
			<col width="20%" />
			<col width="20%" />
		</colgroup>
		<thead>
			<tr>
				<th>��ȣ</th>
				<th>����</th>
				<th>�̸�</th>
				<th>�������</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>5</td>
				<td>�Ǵ��� �̻��� �Խ��� with CSS, DIV</td>
				<td>�Ǵ�(panda)</td>
				<td>2012-10-19</td>
			</tr>
			<tr>
				<td>4</td>
				<td>�Ǵ��� �̻��� �Խ��� with CSS, DIV</td>
				<td>�Ǵ�(panda)</td>
				<td>2012-10-19</td>
			</tr>
			<tr>
				<td>3</td>
				<td>�Ǵ��� �̻��� �Խ��� with CSS, DIV</td>
				<td>�Ǵ�(panda)</td>
				<td>2012-10-19</td>
			</tr>
			<tr>
				<td>2</td>
				<td>�Ǵ��� �̻��� �Խ��� with CSS, DIV</td>
				<td>�Ǵ�(panda)</td>
				<td>2012-10-19</td>
			</tr>
			<tr>
				<td>1</td>
				<td>�Ǵ��� �̻��� �Խ��� with CSS, DIV</td>
				<td>�Ǵ�(panda)</td>
				<td>2012-10-19</td>
			</tr>
		</tbody>
	</table>
</div>
<!-- ���̺� ���� -->

</body>
</html>