<%@ taglib prefix="c" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lhn
  Date: 2020/6/29
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="updateUser" method="get">
    <input type="hidden" name="userId" value="${user.userId}">
<table align="center">

    <tr >
        <td bgcolor="#eeeeee"> 用户姓名 ：</td>
        <td><input type="text"  name="userName" value="${user.userName}"></td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户登录名 ：</td>
        <td><input type="text"  name="userLoginName" value="${user.userLoginName}"></td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户登陆密码 ：</td>
        <td><input type="text" name="userPassWord" value="${user.userPassWord}"></td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户电话 ：</td>
        <td><input type="text" name="userTelphone" value="${user.userTelphone}"></td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户邮箱 ：</td>
        <td><input type="text" name="userEmail" value="${user.userEmail}"></td>
    </tr>
    <tr >
        <td bgcolor="#eeeeee"> 用户职位 ：</td>
        <td>
            <select name="role">
                <option value="经理">经理</option>
                <option value="普通员工">普通员工</option>
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
