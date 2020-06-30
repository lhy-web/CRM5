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
    <meta charset="utf-8"/>
    <title>客户管理</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>

    <link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/css/bootstrap.min.css"/>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootbox.min.js"></script>
    <script>
        function quanxuan() {
            var all=document.getElementById("selectAll");
            var mychk = document.getElementsByName("checkboxDelete");
            if(all.checked==true){
                if(mychk.length){
                    for(var i=0;i<mychk.length;i++){
                        mychk[i].checked = true;
                    }
                }
                mychk.chcked=true;
            }else{
                if(mychk.length){
                    for(var i=0;i<mychk.length;i++){
                        mychk[i].checked = false;
                    }
                }
            }
        }
    </script>

</head>
<body>
<div class="box">
    <div class="title">客户管理</div>
    <div class="content">
        <!--搜索输入框及查询、重置按钮-->
        <form action="findAllCustomer" method="post">
            <div class="container content_width">
                <div class="person_search">
                    <div class="search_input">
                        <div class="input-group mb-3">
                            <span>查询条件：</span>
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
                            <input id="Ktext" type="text" class="form-control"  name="key" value="${key}"/>

                        </div>
                    </div>

                    <div class="search_input">
                        <input class="btn btn-primary search_btn" type="submit" id="search_btn" value="查询"/>

                    </div>
                </div>
                <div class="line"></div>
            </div>
        </form>

        <!--表格列表-->
        <table id="tb" class="table">
            <thead>
            <tr>
                <th> 全选：<input type="checkbox"  id="selectAll" onclick="quanxuan()"></th>
                <th>编号</th>
                <th>客户名称</th>
                <th>客户性质</th>
                <th>客户类型</th>
                <th>客户级别</th>
                <th>公司网址</th>
                <th>公司电话</th>
                <th>登记人</th>

                <th>操作</th>
            </tr>
            </thead>
            <form action="manyDelete" method="post">

                <tbody id="show_tbody">
                <c:forEach items="${list.list}" var="CustomerInfo">
                    <tr>
                        <td><input type="checkbox" name="checkboxDelete" value="${CustomerInfo.customerId }" id="qx"></td>
                        <td>${CustomerInfo.customerId }</td>
                        <td>${CustomerInfo.customerName }</td>
                        <td>${CustomerInfo.dictionaryTypeInfoByCustomerProperties.dataInformationName }</td>
                        <td>${CustomerInfo.dictionaryTypeInfoByCustomerType.dataInformationName }</td>
                        <td>${CustomerInfo.customerLevel.levelName }</td>
                        <td>${CustomerInfo.customerCompanyWebsize }</td>
                        <td>${CustomerInfo.customerCompanyPhone }</td>
                        <td>${CustomerInfo.register }</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/ViewDCI?CustomerInfoId=${CustomerInfo.customerId}" class="edit">查看详情</a>
                            <a href="${pageContext.request.contextPath}/updateC?CustomerInfoId=${CustomerInfo.customerId}" >修改</a>
                            <a href="${pageContext.request.contextPath}/delete?CustomerInfoId=${CustomerInfo.customerId}" >删除</a></td>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
                <tr style="padding:5px;font-size: 12px;">
                    <td colspan="12" align="center">


                        <a href="findAllCustomer?currentPage=1">首页</a>
                        <a href="findAllCustomer?currentPage=${list.currentPage-1 }">上一页</a>




                        <a href="findAllCustomer?currentPage=${list.currentPage+1 }">下一页</a>
                        <a href="findAllCustomer?currentPage=${list.totalPage }">尾页</a>



                        当前第${list.currentPage}页| 共${list.totalPage}页 | 共${list.totalCount}条记录。
                    </td>
                </tr>
        </table>
        <input type="submit" value="批量删除">
        </form>
        <input type="button" value="添加" onclick="window.open('GetDictionary');">
        <input type="button" value="全部导出" onclick="window.open('putCustomerInfoToExcel');">
    </div>
</div>

<script src="js/mejs.js"></script>
</body>
</html>
