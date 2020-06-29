<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/28
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

        <meta charset="utf-8" />
        <title>客户管理系统登陆</title>
        <link rel="stylesheet" type="text/css" href="css/Login.css"/>
        <style type="text/css">

        </style>

</head>
<body>
<form action="Login" method="post">
    <div class="bg">
        <div class="wel">客户管理系统</div>
        <div class="user">
            <div id="yonghu" style="">用户名</div>
            <input  type="text" name="userLoginName"  />
        </div>
        <div class="password" >
            <div id="yonghu" >密&nbsp;&nbsp;&nbsp;码</div>
            <input class="" type="password" name="userPassWord" />
        </div>
        <div align="center">
            <span style="color:red;">${LoginFalse}</span>

        </div>

        <input class="btn" type="submit" name="登录" value="登录" />
    </div>
</form>
</body>
</html>

