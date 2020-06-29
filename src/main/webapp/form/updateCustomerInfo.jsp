<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/24
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改客户信息</title>
</head>
<body>
<h1 align="center" style="font-family:华义彩云;"> 修改客户信息</h1>
<form  action="updateCustomer" method="post" >
    <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
       <input type="hidden" name="customerId" value="${customerInfo.customerId}">
        <tr style="padding:5px;">
            <td bgcolor="#eeeeee"> 客户名称：</td>
            <td><input type="text" name="customerName"  value="${customerInfo.customerName}" readonly="readonly"  ><font color="red">${requestScope.error }</font> </td>

            <td bgcolor="#eeeeee"> 客户性质：</td>

            <td>
                <select name="customerPropertiesId">
<s:iterator value="#customerProperties" id="a">

                        <option value="${a.dataId}"
                            <s:if test="#customerInfo.dictionaryTypeInfoByCustomerProperties.dataId == #a.dataId">
                                selected="selected">
                            </s:if>
                            >
                                    ${a.dataInformationName}
                        </option>
</s:iterator>

                </select>
            </td>
        </tr>



        <tr style="padding:5px;">
            <td bgcolor="#eeeeee"> 客户类型:</td>
            <td>
                <select name="customerTypeId">
                    <s:iterator value="#customerType" id="CustomerType">

                            <option value="${CustomerType.dataId }"
                                    <s:if test="#request.customerInfo.dictionaryTypeInfoByCustomerType.dataId == #CustomerType.dataId ">
                                        selected="selected"
                                    </s:if>
                            >
                                    ${CustomerType.dataInformationName}
                            </option>

                    </s:iterator>
                    <!--
                        <option value="20">制造业</option>
                        <option value="31">金融业</option>
                        <option value="3">其他</option>
                        <option value="2">服务业</option>
                     -->
                </select>
            </td>

            <td bgcolor="#eeeeee"> 客户级别：</td>
            <td>
                <select name="levelId">
                    <s:iterator value="#customerLevel" id="CustomerLevel">

                            <option value="${CustomerLevel.levelId }"
                                    <s:if test="#customerInfo.customerLevel.levelId == #CustomerLevel.levelId">
                                        selected="selected"
                                    </s:if>
                            >
                                    ${CustomerLevel.levelName}
                            </option>

                    </s:iterator>

                </select>
            </td>
        </tr>



        <tr style="padding:5px;">
            <td bgcolor="#eeeeee"> 公司网址：</td>
            <td>
                <input type="text" name="customerCompanyWebsize"  value="${customerInfo.customerCompanyWebsize}">
            </td>
            <td bgcolor="#eeeeee"> 公司电话：</td>
            <td>
                <input type="text" name="customerCompanyPhone"  value="${customerInfo.customerCompanyPhone}">
            </td>
        </tr>


        <tr style="padding:5px;">
            <td bgcolor="#eeeeee"> 登记人：</td>
            <td>
                <input type="text" name="register" readonly="readonly" value="${customerInfo.register}">
                <input type="hidden" name="hyId" value="1">
            </td>
            <td bgcolor="#eeeeee"> 客户地址：</td>
            <td>
                <input type="text" name="customerAddress"  value="${customerInfo.customerAddress}">
            </td>
        </tr>


        <tr style="padding:5px;">
            <td bgcolor="#eeeeee"> 所属省份：</td>
            <td>
                <input type="text" name="customerProvinces"  value="${customerInfo.customerProvinces}">
            </td>
            <td bgcolor="#eeeeee"> 所属城市：</td>
            <td>
                <input type="text" name="customerCity"  value="${customerInfo.customerCity}">
            </td>
        </tr>

        <tr style="padding:5px;">
            <td bgcolor="#eeeeee"> 公司邮编：</td>
            <td>
                <input type="text" name="customerCode" value="${customerInfo.customerCode}" >
            </td>
            <td bgcolor="#eeeeee"> 开户银行：</td>
            <td>
                <select name="openBankId">
                    <s:iterator value="#customerOpenBank" id="CustomerOpenBank">

                            <option value="${CustomerOpenBank.dataId }"
                                    <s:if test="#customerInfo.dictionaryTypeInfoByOpenBank.dataId == #CustomerOpenBank.dataId ">
                                        selected="selected"
                                    </s:if>
                            >
                                    ${CustomerOpenBank.dataInformationName}
                            </option>

                    </s:iterator>

                </select>
            </td>
        </tr>

        <tr style="padding:5px;">
            <td bgcolor="#eeeeee"> 银行账号：</td>
            <td>
                <input type="text" name="bankAccount"  value="${customerInfo.noteInformation}" >
            </td>
            <td bgcolor="#eeeeee"> 客户来源：</td>
            <td>
                <select name="customerSourceId">
                    <s:iterator value="#customerSource" id="CustomerSource">

                            <option value="${CustomerSource.dataId }"
                                    <s:if test="#customerInfo.dictionaryTypeInfoByCustomerSource.dataId == #CustomerSource.dataId ">
                                        selected="selected"
                                    </s:if>
                            >
                                    ${CustomerSource.dataInformationName}
                            </option>

                    </s:iterator>
                </select>
            </td>
        </tr>

        <tr>
            <td bgcolor="#eeeeee"> 备注信息：</td>
            <td colspan="3">
                <textarea rows="3" cols="48" name="noteInformation">${customerInfo.customerName}</textarea>
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
