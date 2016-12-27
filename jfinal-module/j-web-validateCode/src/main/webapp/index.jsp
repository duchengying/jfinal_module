<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证码</title>
<style>
	
</style>
</head>
<body>
	
	<form action="/j-web-validateCode/validate" method="post">
		 <p>
		 	
		 	用户名：<input type="text" name="name"/></br>
			 密码： &nbsp;&nbsp;&nbsp;<input type="password" name="password" style="margin-top:5px; vertical-align:middle;" /> <!-- 获取验证码并设置点击事件，点击之后获取新的验证码 --> 
			 <img src="/j-web-validateCode/code" style="width:60px;height:25px; vertical-align:middle;"  onclick="this.src='/j-web-validateCode/code?x='+Math.random()">
			 </br> <!-- 设置name为code 用于后台接收验证码并进行校验-->
			 验证码：<input type="text" name="code" style="margin-top:5px;" /> <br>
			 <button type="submit">登陆</button> 
		 </p>
    </form>
</body>
</html>