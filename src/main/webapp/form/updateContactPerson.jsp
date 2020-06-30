<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/23
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center" style="font-family:华义彩云;"> 联系人信息添加</h1>
<form action="updateContactPerson" method="post">
    <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0"  bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
        <s:hidden name="contactPersonInfo.contactId" value="%{#contactPersonInfo.contactId}" />
        <tr>
            <td>姓名：</td>
            <td><s:textfield name="contactPersonInfo.contactName" value="%{#contactPersonInfo.contactName}" /></td>
            <td>职务：</td>
            <td><s:textfield name="contactPersonInfo.contactPost" value="%{#contactPersonInfo.contactPost}"/></td>
        </tr>
        <tr>
            <td>客户id：</td>
            <td><s:textfield name="contactPersonInfo.customerId" value="%{#contactPersonInfo.customerId}" /></td>
            <td>Q Q：</td>
            <td><s:textfield name="contactPersonInfo.contactQQnumber" value="%{#contactPersonInfo.contactQQnumber}" /></td>
        </tr>
        <tr>
            <td>生日：</td>
            <td><s:textfield name="contactPersonInfo.contactBirthday" value="%{#contactPersonInfo.contactBirthday}" /></td>
            <td>性别：</td>
            <td>
                <s:radio name="contactPersonInfo.contactSex" list="#request.sexMap" value="%{#contactPersonInfo.contactSex}" theme="simple"></s:radio>
            </td>

            </tr>
        <tr>
            <td>个人手机：</td>
            <td><s:textfield name="contactPersonInfo.contactMobilePhone" value="%{#contactPersonInfo.contactMobilePhone}"/></td>
            <td>办公电话：</td>
            <td><s:textfield name="contactPersonInfo.contactOfficePhone" value="%{#contactPersonInfo.contactOfficePhone}" /></td>
            </tr>
        <tr>
            <td>电子邮箱：</td>
            <td><s:textfield name="contactPersonInfo.contactEmail" value="%{#contactPersonInfo.contactEmail}"/></td>
            <td>登记日期：</td>
            <td><s:textfield name="contactPersonInfo.contactRegistDate" value="%{#contactPersonInfo.contactRegistDate}" /></td>
            </tr>
        <tr>
            <td>备注：</td>
            <td colspan="3"><s:textarea name="contactPersonInfo.contactRemarks"  value="%{#contactPersonInfo.contactRemarks}" /></td>
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
