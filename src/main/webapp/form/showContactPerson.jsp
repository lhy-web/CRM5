<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/22
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 align="center" >联系人信息</h2>
<form method="post" action="findAllPerson" >
姓名：<input type="text" name="name" placeholder="模糊查询" value="${name }" />
<input type="submit" value="查询" />
</form>

<table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
    <tr bgcolor="#eeeeee" style="padding:5px;">
        <td align="center"> <input type="checkbox" onclick="quanxuan();" id="selectAll" ></td>
        <td align="center">联系人id</td>
        <td align="center">客户id</td>
        <td align="center">联系人姓名</td>
        <td align="center">联系人性别</td>
        <td align="center">联系人生日</td>
        <td align="center">联系人职务</td>
        <td align="center">联系人办公电话</td>
        <td align="center">联系人个人手机号码</td>
        <td align="center">联系人邮箱</td>
        <td align="center">联系人登记日期</td>
        <td align="center">联系人QQ号码</td>
        <td align="center">联系人备注</td>
        <td align="center" colspan="2">操作</td>
    </tr>
    <form action="manyDeletePerson" method="post">
    <c:forEach items="${list}" var="contactPersonInfo">
        <tr style="padding:5px;font-size: 12px;">
            <td align="center"><input type="checkbox" name="checkboxDelete" value="${contactPersonInfo.contactId }"> </td>
            <td align="center"> ${contactPersonInfo.contactId }</td>
            <td align="center">${contactPersonInfo.customerId}</td>
            <td align="center">${contactPersonInfo.contactName}</td>
            <td align="center">${contactPersonInfo.contactSex}</td>
            <td align="center">${contactPersonInfo.contactBirthday}</td>
            <td align="center">${contactPersonInfo.contactPost}</td>
            <td align="center">${contactPersonInfo.contactOfficePhone}</td>
            <td align="center">${contactPersonInfo.contactMobilePhone}</td>
            <td align="center">${contactPersonInfo.contactEmail}</td>
            <td align="center">${contactPersonInfo.contactRegistDate}</td>
            <td align="center">${contactPersonInfo.contactQQnumber}</td>
            <td align="center">${contactPersonInfo.contactRemarks}</td>
            <td align="center"> <a href="${pageContext.request.contextPath}/updatePerson?ContactPersonInfoId=${contactPersonInfo.contactId}" >修改</a></td>
            <td align="center"> <a href="${pageContext.request.contextPath}/deletePerson?ContactPersonInfoId=${contactPersonInfo.contactId}" >删除</a></td>
        </tr>
    </c:forEach>
</table>
<input type="submit" value="批量删除">
</form>
<input type="button" value="添加" onclick="window.open('saveContactPersonInfo');">
<input type="button" value="导出信息" onclick="window.open('putContactPersonInfoExcel');">

</body>
</html>
