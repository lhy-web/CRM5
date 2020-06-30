<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>投诉信息</title>
	  <link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
<script type="text/javascript">

	// function selectAll(){
	// 	$(document).on("click","#selectAll",function () {
	// 		$(".checkid").prop("checked",$(this).prop("checked"));
	// 	});
	// }
	// function checkid(){
	// 	$(document).on("click","#checkid",function () {
	// 		var flag = $(".checkid:checked").length==$(".checkid").length;
	// 		$("#selectAll").prop("checked",flag);
	// 	});
	// }

</script>
  </head>
  
  <body>
  <form action="findComplainInfo" method="post">
	  <table width="100%" height="23" border="0" cellpadding="0" cellspacing="0">
		  <tr>
			  <td colspan="2" width="100%" align="center">
				  请输入查询条件：
				  <select name="type">
					  <option value="complainId"> 投诉编号</option>
					  <option value="customerName">投诉客户姓名</option>
				  </select>
				  <input name="key"  type="text" size="24" placeholder="">
				  <input type="submit" value="搜索">
			  </td>
		  </tr>
	  </table>
  </form>
  <form action="deleteManyComplainInfo" method="post">
	  <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
	          <tr bgcolor="#eeeeee" style="padding:5px;">
				      <td align="center"> <input type="checkbox" onclick="selectAll();" id="selectAll"> </td>
				      <td align="center"> 投诉编号</td>
				      <td align="center"> 投诉主题</td>
				      <td align="center"> 投诉客户</td>
				      <td align="center"> 处理状态</td>
				      <td align="center"> 查看投诉</td>
				      <td align="center"> 注销投诉</td>
			  </tr>
			  <s:iterator value="#request.findAllComplainInfo" id="ComplainInfo">
			   <tr  style="padding:5px;font-size: 12px;">
			          <td align="center"><input type="checkbox" class="checkid" name="checkboxDelete" value="${ComplainInfo.complainId}"> </td>
				      <td align="center"> ${ComplainInfo.complainId }</td>
				      <td align="center"> ${ComplainInfo.complainTheme }</td>
				      <td align="center"> ${ComplainInfo.customerName }</td>
				      <td align="center"> ${ComplainInfo.complainStatus }</td>
				      <td align="center"> <input type="button" name="detail"  value="查看投诉" onclick="window.open('complainInfoDetail?complainId=${ComplainInfo.complainId}');"> </td>
				      <td align="center"> <a href="delete?CustomerInfoId=${ComplainInfo.complainId}"><img src="<%=basePath%>/image/delete.gif" width="15" height="15" alt="注销投诉"></a> </td>
			  </tr>
			  </s:iterator>
			  <tr style="padding:5px;font-size: 12px;">
				  <td colspan="12" align="center">
				      <s:if test="#request.page.hasPrePage">
				         <a href="showComplainInfo?currentPage=1">首页</a>
				         <a href="showComplainInfo?currentPage=${request.page.currentPage-1 }">上一页</a>
				      </s:if>
				      <s:else>
				       首页
				       上一页
				      </s:else>

				       <s:if test="#request.page.hasNextPage">
				         <a href="showComplainInfo?currentPage=${request.page.currentPage+1 }">下一页</a>
				         <a href="showComplainInfo?currentPage=${request.page.totalPage }">尾页</a>
				      </s:if>
				      <s:else>
				       下一页
				       尾页
				      </s:else>
				      当前第${request.page.currentPage}页| 共${request.page.totalPage}页 | 共${request.page.totalCount}条记录。
				  </td>
			  </tr>

	  </table>
	     <input type="submit" value="批量删除">
		<a href="form/addComplainInfo.jsp"><input type="button" value="添加"></a>
  </form>
  </body>
</html>

