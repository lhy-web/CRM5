<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/23
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center" style="font-family:华义彩云;"> 联系人信息添加</h1>
<form action="saveContactPersonInfo" method="post">
    <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0"  bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="contactName"></td>
            <td>职务：</td>
            <td><input type="text" name="contactPost"></td>
        </tr>
        <tr>
            <td>客户id：</td>
            <td><input type="text" name="customerId"></td>
            <td>Q Q：</td>
            <td><input type="text" name="contactQQNumber"></td>
        </tr>
        <tr>
            <td>生日：</td>
            <td><input type="text" name="contactBirthday"></td>
            <td>性别：</td>
            <td>男<input type="radio" name="contactSex" value="男" checked> 女<input type="radio" name="contactSex" value="女" ></td>
            </tr>
        <tr>
            <td>个人手机：</td>
            <td><input type="text" name="contactMobilePhone"></td>
            <td>办公电话：</td>
            <td><input type="text" name="contactOfficePhone"></td>
            </tr>
        <tr>
            <td>电子邮箱：</td>
            <td><input type="text" name="contactEmail"></td>
            <td>登记日期：</td>
            <td><input type="text" name="contactRegistDate" ></td>
            </tr>
        <tr>
            <td>备注：</td>
            <td colspan="3"><textarea name="contactRemarks" cols="50" rows="3"></textarea></td>
            </tr>
    </table>
        <p align="center">
          <input type="button" value="返回" onclick="window.open('findAllPerson');">
          <input type="submit" value="提交">
          <input type="submit" value="重置">
        </p>
</form>

</body>
</html>
