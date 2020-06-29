<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/28
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>功能选择目录</title>
</head>
<body>
<div align="center">
欢迎登陆,当前用户：${user.userName}
</div>
<div align="right">当前时间：<span id="time"></span></div>

<script>
    function show() {
        //创建内置Date对象
        var date = new Date();
        //获取当前年份
        var year = date.getFullYear();
        //获取当前的月份,范围是0-11
        var month = date.getMonth() + 1;
        //获取该月的第几天
        var day = date.getDate();
        //getDay方法获取当前是这个星期的第几天范围是0-6
        //周日对应0，123456分别是对应的星期几
        var week = "日一二三四五六".charAt(date.getDay());
        //获取当前小时分钟和秒
        var hour = date.getHours();
        var minute = date.getMinutes();
        var second = date.getSeconds();
        //选择id为time的标签
        var element = document.getElementById("time");
        element.innerHTML = year+"年"+month+"月"+day+"日"+"星期"+week+"	"+hour+"时"+minute+"分"+second+"秒";
    }
    show();
    //每间隔1000毫秒执行一次程序，保证时间动态显示
    setInterval("show()",1000);
</script>

<table align="center">
    <tr>
        <td><a href="${pageContext.request.contextPath}/userFindAll">显示用户信息</a></td>
        <td><a href="${pageContext.request.contextPath}/addUser.jsp">用户添加</a></td>
        <td><a href="">a</a></td>
        <td><a href="">b</a></td>
        <td><a href="">c</a></td>
        <td><a href="">d</a></td>
    </tr>

</table>

</body>
</html>
