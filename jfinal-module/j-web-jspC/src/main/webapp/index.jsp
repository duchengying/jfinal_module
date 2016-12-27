<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>
</head>
<body>
    <div>
        <table>
        	 <thead>
        	 	<th>编号</th>
        	 	<th>姓名</th>
        	 	<th>邮箱</th>
        	 	<th>密码</th>
        	 </thead>
             <tbody>
       			<c:forEach items="${user }" var="x">
       				<tr>
       					<td>${x.id }</td><td>${x.name }</td><td>${x.email }</td><td>${x.password }</td>
       				</tr>
       			</c:forEach>
             </tbody>
        </table>
    </div>
</body>
</html>