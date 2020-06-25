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

<h1 align="center" style="font-family:华义彩云;"> 客户信息添加</h1>
<form action="addCustomerInfo" method="post">
<table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 客户名称<font color="red">${error}</font> </td>
        <td><input type="text" name="customerName">
        <td bgcolor="#eeeeee"> 客户性质</td>
        <td>
            <select name="customerPropertiesId">
                <c:forEach items="${pro}" var="a">
                    <option value="${a.dataId }">
                            ${a.dataInformationName}
                    </option>
                    </c:forEach>
            </select>
        </td>
    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 客户类型</td>
        <td>
            <select name="customerTypeId">
                <c:forEach items="${type}" var="a">
                    <option value="${a.dataId }">
                            ${a.dataInformationName}
                    </option>
                </c:forEach>

            </select>
        </td>

        <td bgcolor="#eeeeee"> 客户级别:</td>
        <td>
            <select name="levelId">
                <c:forEach items="${level}" var="a">
                    <option value="${a.levelId}">
                            ${a.levelName}
                    </option>
                </c:forEach>

            </select>
        </td>
    </tr>



    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 公司网址：</td>
        <td>
            <input type="text" name="customerCompanyWebsize"  >
        </td>
        <td bgcolor="#eeeeee"> 公司电话：</td>
        <td>
            <input type="text" name="customerCompanyPhone"  >
        </td>
    </tr>


    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 登记人：</td>
        <td>
            <input type="text" name="register"  value="记录人名称" readonly="readonly">
            <input type="hidden" name="hyId" value="1">
        </td>
        <td bgcolor="#eeeeee"> 客户地址：</td>
        <td>
            <input type="text" name="customerAddress"  value="">
        </td>
    </tr>


    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 所属省份：</td>
        <td>
            <input type="text" name="customerProvinces"  value="" >
        </td>
        <td bgcolor="#eeeeee"> 所属城市：</td>
        <td>
            <input type="text" name="customerCity"  value="">
        </td>
    </tr>

    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 公司邮编：</td>
        <td>
            <input type="text" name="customerCode"  value="" >
        </td>
        <td bgcolor="#eeeeee"> 开户银行：</td>
        <td>
            <select name="openBankId">
                <c:forEach items="${bank}" var="a">
                    <option value="${a.dataId }">
                            ${a.dataInformationName}
                    </option>
                </c:forEach>

            </select>
        </td>
    </tr>

    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 银行账号：</td>
        <td>
            <input type="text" name="bankAccount"  value="" >
        </td>
        <td bgcolor="#eeeeee"> 客户来源：</td>
        <td>
            <select name="customerSourceId">
                <c:forEach items="${source}" var="a">
                    <option value="${a.dataId }">
                            ${a.dataInformationName}
                    </option>
                </c:forEach>

            </select>
        </td>
    </tr>

    <tr>
        <td bgcolor="#eeeeee"> 备注信息：</td>
        <td colspan="3">
            <textarea rows="3" cols="48" name="noteInformation"></textarea>
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
