<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<title>Insert title here</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="../static/css/style1.css">
	</head>
	<body>
		<h1></h1>
		<div class="app-location">
			<h2>App信息管理平台</h2>
			<div class="line"><span></span></div>
			<div class="location"><img src="../static/images/location.png" class="img-responsive" alt="" /></div>
			<form action="register" method="post">
				<input type="text" id="devNo" name="devNo" placeholder="请输入您的编号进行注册">
				<input type="text" id="devName" name="devName" placeholder="请输入您的姓名">
				<input type="password" id="password" name="password" placeholder="请输入您的密码">
				<input type="text" id="cellphone" name="cellphone" placeholder="请输入您电话号码">
				<input type="text" id="email" name="email" placeholder="请输入您的电子邮箱">
				<input type="text" id="devInfo" name="devInfo" placeholder="请输入您的简介">
				
				<div class="submit"><input type="submit" value="注册"></div>
				<div class="clear"></div>
			</form>
		</div>
	</body>
</html>