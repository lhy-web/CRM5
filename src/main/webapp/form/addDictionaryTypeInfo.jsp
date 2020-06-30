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
<h1 align="center" style="font-family:华义彩云;"> 数据字典具体信息添加</h1>
<%
    String name=request.getParameter("dictionaryType");
%>
<form action="addDictionaryTypeInfo?id=<%= name%>" method="post">
    <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
        <tr style="padding:5px;">
            <td bgcolor="#eeeeee"> 名称：</td>

            <td><input type="text" name="dictionaryTypeInfo.dataInformationName"  value="">

            </td>

            <input type="hidden" name="dictionaryTypeInfo.dictionaryType" value="<%= name%>">
        </tr>
    </table>

    <p align="center">
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </p>
</form>

</body>
</html>
