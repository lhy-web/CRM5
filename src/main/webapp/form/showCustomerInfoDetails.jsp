<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/24
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>查看详细信息</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>

    <link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/css/bootstrap.min.css"/>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootbox.min.js"></script>
</head>
<body>
<div class="title">查看客户详细信息</div>
<div class="modal-body">

    <table id="xztb" class="table">
        <!--新修改弹窗的样式-->
        <tbody>
        <tr>
            <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>客户名称<font color="red">${error}</font></label>
            </td>
            <td>${customerInfo.customerName}</td>
            <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>客户性质</label>
            </td>
            <td>
                ${customerInfo.dictionaryTypeInfoByCustomerProperties.dataInformationName}
            </td>
        </tr>
        <tr>
            <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>客户类型</label>
            </td>
            <td>
                ${customerInfo.dictionaryTypeInfoByCustomerType.dataInformationName}



            </td>
            <td class="tb_bg"><label for="">客户级别</label></td>
            <td>
                ${customerInfo.customerLevel.levelName}

            </td>
        </tr>
        <tr>
            <td class="tb_bg"><label for="">公司网址：</label></td>
            <td>${customerInfo.customerCompanyWebsize} </td>
            <td class="tb_bg"><label for="">公司电话：</label></td>
            <td>${customerInfo.customerCompanyPhone}</td>
        </tr>
        <tr>

            <td class="tb_bg"><label for="">登记人：</label></td>
            <td> ${customerInfo.register}</td>

            <td class="tb_bg"><label for="">客户地址：</label></td>
            <td>${customerInfo.customerAddress}</td>
        </tr>
        <tr>
            <td class="tb_bg"><label for=""> 所属省份：</label></td>
            <td>${customerInfo.customerProvinces}></td>
            <td class="tb_bg"><label for=""> 所属城市：</label></td>
            <td>${customerInfo.customerCity}</td>
        </tr>
        <tr>
            <td class="tb_bg"><label for=""> 公司邮编：</label></td>
            <td>${customerInfo.customerCode}</td>

            <td class="tb_bg"><label for="">开户银行</label></td>

            <td>
                ${customerInfo.dictionaryTypeInfoByOpenBank.dataInformationName}
            </td>
        </tr>
        <tr>

            <td class="tb_bg"><label for=""> 银行账号：</label></td>
            <td> ${customerInfo.bankAccount}</td>


            <td class="tb_bg"><label for="">客户来源</label></td>
            <td>
                ${customerInfo.dictionaryTypeInfoByCustomerSource.dataInformationName}
            </td>

        </tr>
        <tr>

            <td class="tb_bg"><label for=""> 备注信息：</label></td>
            <td> ${customerInfo.noteInformation}</td>



        </tr>
        </tbody>
    </table>
</div>

</div>
</div>

</body>
</html>
