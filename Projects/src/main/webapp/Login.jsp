<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Login</title>    
<link rel="stylesheet" href="login.css">
</head>  

<body>   

	<div class="login-box"> 
		<h2>Login</h2>
 
		<form action="Login" method="post"> 
 
			<label>User </label> <input type="text" name="nm"
				placeholder="Enter username" required> <label>Password</label>
			<input type="password" name="pass" placeholder="Enter password"required>
 
			<button type="submit">Login</button>

			<p class="register"> 
				New user? <a href="Register.jsp">Register here</a>
			</p>
  
		</form> 
	</div>

</body>
</html>
