<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/css/manage.css" media="screen" rel="stylesheet"
	type="text/css" />
<title>edit.jsp</title>
</head>
<body>
	<div class="manage_container">
		<div class="manage_head">
			<div class="manage_logo">
				<a href="http://www.jfinal.com">JFinal web framework</a>
			</div>
			<div id="nav">
				<ul>
					<li><a href="/j-web-beetlsql/"><b>首页</b></a></li>
					<li><a href="/j-web-beetlsql/blog"><b>Blog管理</b></a></li>
				</ul>
			</div>
		</div>
		<div class="main">
			<h1>Blog管理 ---&gt; Blog</h1>
			<div class="form_box">
				<form action="/j-web-beetlsql/blog/update" method="post">
					<%@ include file="/view/blog/_form.jsp"%>
				</form>
			</div>
		</div>
	</div>
</body>
</html>