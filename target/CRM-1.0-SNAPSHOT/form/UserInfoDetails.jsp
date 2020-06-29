<%--
  Created by IntelliJ IDEA.
  User: lhn
  Date: 2020/6/28
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户详细信息</title>
</head>
<body>
<h1 align="center" style="font-family:华义彩云;"> 客户详细信息</h1>
<table align="center">
    <tr >
        <td bgcolor="#eeeeee"> 用户ID ：</td>
        <td>${user.userId}</td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户姓名 ：</td>
        <td>${user.userName}</td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户登录名 ：</td>
        <td>${user.userLoginName}</td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户登陆密码 ：</td>
        <td>${user.userPassWord}</td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户电话 ：</td>
        <td>${user.userTelphone}</td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户邮箱 ：</td>
        <td>${user.userEmail}</td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户职位 ：</td>
        <td>${user.role}</td>
    </tr>
</table>

</body>
</html>
