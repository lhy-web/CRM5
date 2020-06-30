<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
</head>

<!-- 引用三个js文件，前两个是必须的也是固定的，第三个js文件要看dwr.xml文件里面的配置 -->

<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="dwr/util.js"></script>
<!-- 先看看dwr.xml里面的<create creator="new" javascript="HelloService">   这个标签里面的javascript的值为HelloService
所以  src="dwr/interface/HelloService.js" 引用的的是HelloService.js文件，这个文件是看不到的
-->
<script type="text/javascript" src="dwr/interface/HelloService.js"></script>
<script type="text/javascript">
    function testDwr(){
        var username=document.getElementById("username").value;
        HelloService.sayHello(username,callback);
    }
    //回调函数,也就是说，服务器端（普通类）返回一个值的时候要做的事情
    function callback(data){
        document.getElementById("msg").innerHTML=data;
    }

    //如果你想简单一点
    // function func(){
    // //点击按钮时，直接调用HelloService类里面的aa()方法;
    //  HelloService.aa();
    // }

</script>
<body>
<h1 align="center">DWR类库使用</h1>
<div id="msg">显示服务器端传给客户端的值</div>
<input type="text" name="username" id="username" value="张三">
<input type="button" value="测试" onclick="testDwr()">
</body>
</html>



