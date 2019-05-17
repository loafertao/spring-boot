<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../static/css/appstyle.css">
	</head>
	<body>
	<div class="testing">
				<header class="main">
					<h1><strong>APP信息管理平台</strong></h1>
					<input type="text" value="查找" />
				</header>
		<section class="user">
			<div class="profile-img">
				<p><img src="../static/images/uiface2.png" alt="" height="40" width="40" /> ${dev.devName }</p>
			</div>
			<div class="buttons">
				 <span class="button blue"><a href="index.html">注销</a></span>
			</div>
		</section>
	</div>
	<nav>
		<ul>
			<li><a href="#"><span class="icon">&#128711;</span>用户管理</a></li>
			<li>
				<a href="#"><span class="icon">&#128196;</span>后台开发者管理</a>
			</li>
			<li>
				<a href="#"><span class="icon">&#127748;</span>app基本信息</a>
			</li>
			<li class="section">
				<a href="#"><span class="icon">&#59160;</span>数据字典</a>
			</li>
			<li>
				<a href="vlist"><span class="icon">&#127748;</span>app版本信息</a>
			</li>
		</ul>
	</nav>
	<section class="widget">
		<header>
			<span class="icon">&#128196;</span>
		</header>
		<div class="content">
			<table id="myTable" border="0" width="100">
				<thead>
					<tr>
						<th>软件名称</th>
						<th>开发者</th>
						<th>类别名称</th>
						<th>所属平台</th>
						<th>app状态</th>
						<th>审核状态</th>
						<th>审核人</th>
					</tr>
				</thead>
					<tbody>
						<c:forEach var="appInfo" items="${page.list }" varStatus="s">
							<tr>
								<td align="center">${appInfo.appName }</td>
								<td>${appInfo.developer.devName }</td>
								<td>${appInfo.category.categoryName }</td>
								<td>${appInfo.platform.dictionaryName }</td>
								<td>${appInfo.status.dictionaryName }</td>
								<td>${appInfo.examine.dictionaryName }</td>
								<td>${appInfo.checker.adminName }</td>
							</tr>
						</c:forEach>
					</tbody>
					
					<tfoot>
						<tr>
							<td colspan="7" align="right">
								<a href="list?pageNum=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<label th:if="${page.pageNum}==1">上一页&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<label th:unless="${page.pageNum}==1">
									<a th:href="|list?pageNum=${page.pageNum-1}|">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								</label>
								<label th:if="${page.pageNum}==${page.totalPage}">下一页&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<label th:unless="${page.pageNum}==${page.totalPage}">
									<a th:href="|list?pageNum=${page.pageNum+1}|">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								</label>
								<a th:href="|list?pageNum=${page.totalPage}|">末页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</td>
						</tr>
					</tfoot>
				</table>
		</div>
	</section>
</body>
</html>