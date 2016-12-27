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
	<table class="list">
		<tbody>
			<tr>
				<th>id</th>
				<th>姓名</th>
				<th>邮箱</th>
				<th>密码</th>
			</tr>
			<c:if test="${!empty user.list }">
				<c:forEach items="${user.list }" var="x">
					<tr>
						<td>
							<c:out value="${x.id }" default=""></c:out>
						</td>
						<td >${x.name }</td>
						<td >${x.email }</td>
						<td >${x.password }</td>
						<td>
							&nbsp;&nbsp;<a href="#">删除</a>
							&nbsp;&nbsp;<a href="#">修改</a>
							&nbsp;&nbsp;<a href="#">查看</a>
						</td>
	 				</tr>
				</c:forEach>
			</c:if>
			<c:if test="${empty user.list }">
				<tr>
					<td>
						暂无数据记录！
					</td>
 				</tr>
			</c:if>
		</tbody>
	</table>
	
	<c:set var="currentPage" value="${user.pageNumber }"/>
	<c:set var="totalPage" value="${user.totalPage }"/>
	<c:set var="actionUrl" value="/j-web-page/"/>
	<c:set var="urlParas" value=""/>
	<%@ include file="/comm/_paginate.jsp"%>			
</body>
</html>