<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<title>Insert title here</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="../static/css/style.css">
	</head>
	<body>
		<div id="container">
			<form action="devLogin" method="post">
				<div class="login">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;——开发者平台登录——</div>
				<div class="username-text">登录名:</div>
				<div class="password-text">登录密码:</div>
				<div class="username-field">
					<input type="text" id="devNo" name="devNo"  placeholder="请输入您的登录名"/>
				</div>
				<div class="password-field">
					<input type="password" id="password" name="password" placeholder="请输入您的登录密码" />
				</div>
				<input type="checkbox" name="remember-me" id="remember-me" /><label for="remember-me">记住密码</label>
				<div class="forgot-usr-pwd">&nbsp;&nbsp;&nbsp;&nbsp; <a href="register">新用户在此注册！</a></div>
				<input type="submit" name="submit" value="GO" />
			</form>
		</div>
	</body>
</html>