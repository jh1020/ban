<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 30px;
  background-color: white;
  width: 50%;
  margin: 0 auto;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
<script src="<%=request.getContextPath()%>/lib/SHA256.js"></script>
</head>
<body>
<jsp:include page="/Header.jsp"/>
<script type="text/javascript">
	$(document).ready(function() {
	 	<%-- if(<%request.getParameter("error"); %> != null){
	 		alert("아이디 또는 비밀번호가 잘못되었습니다.");
	 	} --%>
	 	
		$('#sha').click(function() {
			var origin = $('#psw').val();
			var user_pw = SHA256(origin);
			$('#psw').val(user_pw);
			$('#sha').submit();
		});
	});

</script>
<form action="/shopping/clientPage/signupPage.do" method="post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
    <label for="account"><b>Account</b></label>
    <input type="text" placeholder="Enter Account" name="account" id="account" required>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
    
    <label for="phone_number"><b>Phone Number</b></label>
    <input type="text" placeholder="010-0000-0000" name="phone_number" id="phone_number" required>
    <input type="hidden" class="pass" name="newPass">
    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" id="sha" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
</form>

</body>
</html>