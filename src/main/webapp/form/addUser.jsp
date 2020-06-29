<%--
  Created by IntelliJ IDEA.
  User: lhn
  Date: 2020/6/28
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>

<h1 align="center" style="font-family:华义彩云;"> 用户添加</h1>
<form action="addUser" method="get">
    <table align="center">
        <tr >
            <td bgcolor="#eeeeee"> 用户姓名 ：</td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr >
            <td bgcolor="#eeeeee"> 用户登录名 ：</td>
            <td><input type="text" name="userLoginName"><span style="color: red">${repeat}</span></td>
        </tr>
        <tr >
            <td bgcolor="#eeeeee"> 用户登陆密码 ：</td>
            <td><input type="text" name="userPassWord"></td>
        </tr>
        <tr >
            <td bgcolor="#eeeeee"> 用户电话 ：</td>
            <td><input type="text" name="userTelphone"></td>
        </tr>
        <tr >
            <td bgcolor="#eeeeee"> 用户邮箱 ：</td>
            <td><input type="text" name="userEmail"></td>
        </tr>
        <tr >
            <td bgcolor="#eeeeee"> 用户职位 ：</td>
            <td>
                <select  name="role">
                    <option value="普通员工">普通员工</option>
                    <option value="经理">经理</option>
                </select>
            </td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </p>
</form>

</body>
</html>
