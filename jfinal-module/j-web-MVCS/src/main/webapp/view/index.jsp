<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户分页列表</title>
</head>
<body>
	<a href="/j-web-MVCS/findUser?id=2">查找2</a>
	<table class="list">
		<tbody>
			<tr>
				<th>id</th>
				<th>姓名</th>
				<th>邮箱</th>
				<th>密码</th>
			</tr>
			<c:if test="${!empty user }">
			<tr>
				<td>
					<c:out value="${user.id }" default=""></c:out>
				</td>
				<td >${user.name }</td>
				<td >${user.email }</td>
				<td >${user.password }</td>
				</tr>
			</c:if>
			<c:if test="${empty user }">
				<tr>
					<td>
						暂无数据记录！
					</td>
 				</tr>
			</c:if>
		</tbody>
	</table>
</body>
</html>
