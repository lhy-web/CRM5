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
<form action="findAll" method="post">
<table width="100%" height="23" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="2" width="100%" align="center">
            请输入查询条件:

            <select name="type">
                <option value="customerName" ${customerName }> 客户名称</option>
                <option value="customerAddress" ${customerAddress }>客户地址</option>
                <option value="customerProvinces" ${customerProvinces }>所属省份</option>
                <option value="customerCity" ${customerCity }>所属城市</option>
                <option value="customerCode" ${customerCode }>公司邮编</option>
                <option value="bankAccount" ${bankAccount }>银行账号</option>
                <option value="customerCompanyWebsize" ${customerCompanyWebsize }>公司网址</option>
                <option value="customerCompanyPhone" ${customerCompanyPhone }>公司电话</option>
                <option value="noteInformation" ${noteInformation }>备注信息</option>
            </select>
            <input name="key"  type="text" class="txt_grey" size="24" value="${key}">
            <input type="submit" class="subt_grey" value="搜索">
        </td>
    </tr>
</table>
</form>



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
    <form action="manyDelete" method="post">
    <c:forEach items="${list.list}" var="CustomerInfo">
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
            <td align="center"> <a href="${pageContext.request.contextPath}/delete?CustomerInfoId=${CustomerInfo.customerId}" >删除</a></td>
        </tr>
    </c:forEach>
        <tr style="padding:5px;font-size: 12px;">
            <td colspan="12" align="center">


                    <a href="findAll?currentPage=1">首页</a>
                    <a href="findAll?currentPage=${list.currentPage-1 }">上一页</a>




                    <a href="findAll?currentPage=${list.currentPage+1 }">下一页</a>
                    <a href="findAll?currentPage=${list.totalPage }">尾页</a>



                当前第${list.currentPage}页| 共${list.totalPage}页 | 共${list.totalCount}条记录。
            </td>
        </tr>

</table>
<input type="submit" value="批量删除">
</form>
<input type="button" value="添加" onclick="window.open('GetDictionary');">
<input type="button" value="全部导出" onclick="window.open('putCustomerInfoToExcel');">
</body>
</html>
