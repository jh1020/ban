<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            background-color: #f1f1f1;
            padding: 20px;
            margin: 0;
            padding-left: 0;
            font-family: Arial;
        }
        
        .navbar {
            overflow: hidden;
            background-color: #333;
            position: fixed;
            top: 0;
            width: 100%;
        }

        .navbar>.side {
            float: right;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 18.5px 16px;
            text-decoration: none;
            font-size: 10px;
        }
        
        .navbar a {
            float: left;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 15px 16px;
            text-decoration: none;
            font-size: 17px;
        }

        .navbar a:hover {
            background: #ddd;
            color: black;
        }
    </style>
</head>

<body>

    <div class="navbar">
        <a class="topMenu" href="MainPage.jsp">Home</a>
        <a class="topMenu" href="#news">News</a>
        <a class="topMenu" href="#contact">Contact</a>
        <c:choose>
    	<c:when test="${sessionScope.user eq null}">
    		<a class="side" href="loginPage.jsp">로그인</a>
    	</c:when>
    	<c:otherwise>
	    	<a class="side" href="#myinfo">내정보</a>
	        <a class="side" href="/shopping/clientPage/basket.do?user_id=${sessionScope.user.data.id}">장바구니</a>
    		<a class="side" href="/shopping/clientPage/logout.do">로그아웃</a>
    	</c:otherwise>
    </c:choose>
        
    </div>