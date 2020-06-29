<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lhn
  Date: 2020/6/28
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center" style="font-family:华义彩云;"> 用户信息</h1>
<table align="center" width="100%" height="48" border="1" cellpadding="0" cellspacing="0"
       bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  >
    <tr align="center">
        <td>用户ID</td>
        <td>用户姓名</td>
        <td>用户登录名</td>
        <td>用户登录密码</td>
        <td>用户电话</td>
        <td>用户邮箱</td>
        <td>用户职位</td>
        <td>查看详细信息</td>
        <td>修改信息</td>
    </tr>
        <c:forEach items="${list}" var="v">
            <tr align="center">
                <td>${v.userId}</td>
                <td>${v.userName}</td>
                <td>${v.userLoginName}</td>
                <td>${v.userPassWord}</td>
                <td>${v.userTelphone}</td>
                <td>${v.userEmail}</td>
                <td>${v.role}</td>
                <td><a href="${pageContext.request.contextPath}/UserInfoDetails?userId=${v.userId}">详细信息</a></td>
                <td>修改</td>
            </tr>
        </c:forEach>

</table>

</body>
</html>
