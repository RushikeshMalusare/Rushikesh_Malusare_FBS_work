<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="regis.css">
</head>
<body>


	<div class="register-box">

		<h2>Register</h2>

		<form action="Register" method="post">

			<label>Full Name</label> <input type="text" name="name" required>

			<label>Email</label> <input type="email" name="email" required>

			<label>Password</label> <input type="password" name="password"
				required> <label>Mobile</label> <input type="text"
				name="mobile">
				<a href="Login.jsp">
			<button type="submit">Register</button>
			</a>
		</form>

		<a href="Login.jsp">Already have an account? Login</a>

	</div>
</body>
</html>