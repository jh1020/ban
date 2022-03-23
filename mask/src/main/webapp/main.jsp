<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html lang="en"> 
<head> 
  <title>마스크 메인</title> 
  <meta charset="utf-8"> 
  <meta name="viewport" content="width=device-width, initial-scale=1"> 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script> 
</head> 

<style>

.contentCenter{
	left: 25%;
	top : 15%;
}

.content{ /*컨텐츠 넓이지정*/
  position:relative;
  width:600px;
}
.slides { /*슬라이드 아이템이 나올 뼈대 지정*/
  width:600px;
  height:300px;
  position:relative;

}
.slide_item { /*슬라이드 아이템을 absolute로 겹쳐놓고 투명하게 하기*/
  position:absolute;
  width:600px;
  height:300px;
  opacity:0;
   transition:all 0.3s;
}
.ontheSlide { /*현재 아이템에 붙여줄 클래스*/
  opacity:1;
  transition:all 0.3s;
}
.ontheThumbnail { /*현재 썸네일에 붙여줄 클래스*/
  border: 1px dashed red;
}
.nextButton,.prevButton { /*다음,이전 버튼을 드래그되지 않게 방지해주기*/
 -webkit-user-select: none;
-ms-user-select: none;
user-select: none
}
.nextButton { /*다음 버튼을 오른쪽으로 보내기*/
  float:right;
}
.prevButton{ /*왼쪽 버튼을 왼쪽으로 보내기*/
  float:left;
}
.Thumbnail { /*썸네일 아이템을 감쌀 뼈대*/
  display:flex;
  flex-flow:row wrap;
  width:100%;
  height:50px;
  position:absolute;
  bottom:0px;
  justify-content:center;
}
.slide_item:nth-of-type(1),.thumbnail_item:nth-of-type(1) { /*예제를 위해 썸네일 아이템들의 색깔을 구분*/
  background:yellow;
}
.slide_item:nth-of-type(2),.thumbnail_item:nth-of-type(2) {
  background:blue;
}
.slide_item:nth-of-type(3),.thumbnail_item:nth-of-type(3) {
  background:red;
}
.slide_item:nth-of-type(4),.thumbnail_item:nth-of-type(4) {
  background:orange;
}
.slide_item:nth-of-type(5),.thumbnail_item:nth-of-type(5) {
  background:black;
}
.slide_item:nth-of-type(6),.thumbnail_item:nth-of-type(6) {
  background:green;
}
.thumbnail_item { /*썸네일 아이템의 길이 설정*/
  width:98px;
}


a  {
   list-style:none;
   }

.innerd {
	position: absolute;
	top : 10%;
	left: 50%;
	transform: translateX(-50%);
}

.loginBtn {
	position: absolute;
	top : 20%;
	left: 90%;
	transform: translateX(-50%);
}
</style>

<body> 
<nav  class="navbar  navbar-expand-sm bg-light" > 
	<a class="navbar-brand" href="main.jsp" >마스크</a>
	<a></a>
	<div class="innerd">
	  <ul  class="navbar-nav"> 
	    <li  class="nav-item"> 
	      <a class="nav-link" href="size.jsp">사이즈</a> 
	    </li> 
	    <li class="nav-item"> 
	      <a class="nav-link" href="color.jsp">색상</a> 
	    </li> 
	    <li class="nav-item"> 
	      <a class="nav-link" href="func.jsp">기능</a>
	    </li> 
	  </ul>
	</div>
	<div class="loginBtn navbar-nav ">
			<input type="button" value="로그인" id="login" onclick="location.href='login.jsp'" />
			<input type="button" value="회원가입" id="signUpBtn" onclick="location.href='signUp.jsp'"/>
	</div>
</nav> 

<div class="content contentCenter"> <!--전체를 감쌀 뼈대-->
<div class="slides">  <!--슬라이드 아이템을 감쌀 뼈대-->
  <div class="slide_item"></div>  <!--슬라이드될 아이템들 -->
  <div class="slide_item"></div>
  <div class="slide_item"></div>
  <div class="slide_item"></div>
  <div class="slide_item"></div>
  <div class="slide_item"></div>
</div>
<span class="nextButton">▶</span>  <!--다음 버튼 -->
<span class="prevButton">◀</span>   <!--이전 버튼 -->
  <div class="Thumbnail">  <!--썸네일을 감쌀 뼈대 -->
 <div class="thumbnail_item"></div>   <!--썸네일 아이템들 -->
  <div class="thumbnail_item"></div>
  <div class="thumbnail_item"></div>
  <div class="thumbnail_item"></div>
  <div class="thumbnail_item"></div>
  <div class="thumbnail_item"></div>
  </div> 
</div>
</body> 
</html>