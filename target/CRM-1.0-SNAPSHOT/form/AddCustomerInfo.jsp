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
    <meta charset="utf-8"/>
    <title>客户管理</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>

    <link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/css/bootstrap.min.css"/>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootbox.min.js"></script>
</head>
<body>

<div class="title">客户添加</div>
<div class="modal-body">
    <form action="addCustomerInfo" method="post">
        <table id="xztb" class="table">
            <!--新修改弹窗的样式-->
            <tbody>
            <tr>
                <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>客户名称<font color="red">${error}</font></label>
                </td>
                <td><input class="userName" name="customerName" type="text" placeholder="请输入名称"/></td>
                <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>客户性质</label>
                </td>
                <td>
                    <select name="customerPropertiesId" class="form-control select_down">
                        <c:forEach items="${pro}" var="a">
                            <option value="${a.dataId }">
                                    ${a.dataInformationName}
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>客户类型</label>
                </td>
                <td>
                    <select name="customerTypeId" class="form-control select_down">
                        <c:forEach items="${type}" var="a">
                            <option value="${a.dataId }">
                                    ${a.dataInformationName}
                            </option>
                        </c:forEach>

                    </select>



                </td>
                <td class="tb_bg"><label for="">客户级别</label></td>
                <td>
                    <select name="levelId" class="form-control select_down">
                        <c:forEach items="${level}" var="a">
                            <option value="${a.levelId}">
                                    ${a.levelName}
                            </option>
                        </c:forEach>

                    </select>

                </td>
            </tr>
            <tr>
                <td class="tb_bg"><label for="">公司网址：</label></td>
                <td><input class="userName" name="customerCompanyWebsize" type="text" placeholder="请输入网址"/></td>
                <td class="tb_bg"><label for="">公司电话：</label></td>
                <td><input class="userName" name="customerCompanyPhone" type="text" placeholder="请输入电话"/></td>
            </tr>
            <tr>

                <td class="tb_bg"><label for="">登记人：</label></td>
                <td><input class="userName" name="register" type="text" placeholder="请输入登记人"/></td>

                <td class="tb_bg"><label for="">客户地址：</label></td>
                <td><input class="userName" name="customerAddress" type="text" placeholder="请输入客户地址"/></td>
            </tr>
            <tr>
                <td class="tb_bg"><label for=""> 所属省份：</label></td>
                <td><input class="userName" name="customerProvinces" type="text" placeholder="请输入客户所属省份"/></td>
                <td class="tb_bg"><label for=""> 所属城市：</label></td>
                <td><input class="userName" name="customerCity" type="text" placeholder="请输入客户所属城市"/></td>
            </tr>
            <tr>
                <td class="tb_bg"><label for=""> 公司邮编：</label></td>
                <td><input class="userName" name="customerCode" type="text" placeholder="请输入客户公司邮编"/></td>

                <td class="tb_bg"><label for="">开户银行</label></td>

                <td>
                    <select name="openBankId" class="form-control select_down">
                        <c:forEach items="${bank}" var="a">
                            <option value="${a.dataId }">
                                    ${a.dataInformationName}
                            </option>
                        </c:forEach>

                    </select>
                </td>
            </tr>
            <tr>

                <td class="tb_bg"><label for=""> 银行账号：</label></td>
                <td><input class="userName" name="bankAccount" type="text" placeholder="请输入客户银行账号"/></td>


                <td class="tb_bg"><label for="">客户来源</label></td>
                <td>
                    <select name="customerSourceId" class="form-control select_down">
                        <c:forEach items="${source}" var="a">
                            <option value="${a.dataId }">
                                    ${a.dataInformationName}
                            </option>
                        </c:forEach>

                    </select>
                </td>

            </tr>
            <tr>

                <td class="tb_bg"><label for=""> 备注信息：</label></td>
                <td><input class="userName" name="noteInformation" type="text" placeholder="请输入客户备注信息"/></td>



            </tr>
            </tbody>
        </table>
</div>
<div class="modal-footer">
    <input type="reset" class="btn btn-secondary" data-dismiss="modal"></button>
    <input id="add_btn" type="submit" class="btn btn-secondary" value="提交"></button>
</div>
</div>
</div>
</form>
</body>
</html>
