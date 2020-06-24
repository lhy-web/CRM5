<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
    <tr bgcolor="#eeeeee" style="padding:5px;">
        <td align="center"> <input type="checkbox" onclick="quanxuan();" id="selectAll" ></td>
        <td align="center"> 编号</td>
        <td align="center"> 客户名称</td>
        <td align="center"> 客户性质</td>
        <td align="center"> 客户类型</td>
        <td align="center"> 客户级别</td>
        <td align="center"> 公司网址</td>
        <td align="center"> 公司电话</td>
        <td align="center"> 登记人</td>
        <td align="center"> 查看详情</td>
        <td align="center"> 修改</td>
        <td align="center">删除</td>

    </tr>
    <c:forEach items="${list}" var="CustomerInfo">
        <tr  style="padding:5px;font-size: 12px;">
            <td align="center"><input type="checkbox" name="checkboxDelete" value="${CustomerInfo.customerId }"> </td>
            <td align="center"> ${CustomerInfo.customerId }</td>
            <td align="center"><a href="javascript:toSup('${CustomerInfo.customerName}','${CustomerInfo.customerId}');">${CustomerInfo.customerName }</a> </td>
            <td align="center"> ${CustomerInfo.dictionaryTypeInfoByCustomerProperties.dataInformationName }</td>
            <td align="center"> ${CustomerInfo.dictionaryTypeInfoByCustomerType.dataInformationName }</td>
            <td align="center"> ${CustomerInfo.customerLevel.levelName }</td>
            <td align="center"> ${CustomerInfo.customerCompanyWebsize }</td>
            <td align="center"> ${CustomerInfo.customerCompanyPhone }</td>
            <td align="center"> ${CustomerInfo.register }</td>
            <td align="center"> <a href="${pageContext.request.contextPath}/ViewDCI?CustomerInfoId=${CustomerInfo.customerId}" >查看详情</a></td>
            <td align="center"> <a href="${pageContext.request.contextPath}/update?CustomerInfoId=${CustomerInfo.customerId}" >修改</a></td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
