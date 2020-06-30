<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>客户投诉详细信息</title>
<%--	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">--%>
<%--	<script type='text/javascript' src='<%=basePath%>/js/date.js'></script>--%>
<%--    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>--%>
<%--    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>--%>
<%--    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddComplainInfoAjax.js'></script>--%>
	  <link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
	<script type="text/javascript">
<%--	       //打开查找 受 理 人--%>
<%--	 		function  OpenUser(){--%>
<%--	 		  window.open('userInfoFindAll.action?currentPage=1',"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");--%>
<%--	 		}--%>
<%--	 		 //打开查找 投诉客户--%>
<%--	 		function  OpenCustomer(){--%>
<%--	 		  window.open('findAllCustomerInfo.action?currentPage=1',"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");--%>
<%--	 		}--%>
<%--	 		//更新保存--%>


	</script>
  </head>
  
  <body> 
  <center>
		 <h5 align="center" style="font-family:华义彩云;"> 客户投诉详细信息</h5>
			<form name="updateComplainInfoForm" action="updateComplainInfoForm" method="post" target="main">
			      <table width="55%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				    <input type="hidden" name="complainInfo.complainId"  value="${complainInfo.complainId }"/>
				    <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 投诉主题：</td>
				      <td><input type="text" name="complainInfo.complainTheme"  value="${complainInfo.complainTheme }"></td>
				     
				      <td bgcolor="#eeeeee"> 投诉客户：</td>
				      <td><input type="text" name="complainInfo.customerName" id="customerName" value="${complainInfo.customerName}">
<%--					      <img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenCustomer();'/>--%>
				      </td>
				      
				    </tr>
				    
				      <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 投 诉 人：</td>
					      <td align="left">
					      <input type="text" name="complainInfo.complainPerson"  value="${complainInfo.complainPerson }">
					      </td>
					      
					       <td bgcolor="#eeeeee">受 理 人：</td>
					       <td align="left">
					            <input type="text" name="complainInfo.userName"  value="${complainInfo.userName}">

<%--					            <img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenUser();'/>--%>
					       </td>
					  </tr>
					  
					  <tr style="padding:5px;">
					       <td bgcolor="#eeeeee"> 客户满意：</td>
					      <td align="left" > 
					      <select name="complainInfo.customerSatisfaction" >
								  <option value="非常满意"
										  <s:if test="#request.complainInfo.customerSatisfaction=='非常满意'"> selected="selected"</s:if>>非常满意
								  </option>
								  <option value="满意"
										  <s:if test="#request.complainInfo.customerSatisfaction=='满意'"> selected="selected"</s:if>>满意
								  </option>
								  <option value="不满意"
										  <s:if test="#request.complainInfo.customerSatisfaction=='不满意'"> selected="selected"</s:if>>不满意
								  </option>
								  <option value="非常不满意"
										  <s:if test="#request.complainInfo.customerSatisfaction=='非常不满意'"> selected="selected"</s:if>>非常不满意
								  </option>

					         </select>
					      </td>
					      <td bgcolor="#eeeeee"> 处理状态：</td>
					      <td align="left">
					        <select name="complainInfo.complainStatus" >

									<option value="已处理"
											<s:if test="#request.complainInfo.complainStatus=='已处理'"> selected="selected"</s:if>>已处理
									</option>
									<option value="处理中"
											<s:if test="#request.complainInfo.complainStatus=='处理中'"> selected="selected"</s:if>>处理中
									</option>

					         </select>
					      </td>
					  </tr>     
				
				      <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 投诉日期：</td>
					      <td align="left" colspan="3">
					      <input type="text" name="complainInfo.complainDate" value="${complainInfo.complainDate}" pattern="\d{4}(-)\d{2}(-)\d{2}( )\d{2}(:)\d{2}(:)\d{2}{.}?\d" title="请按照2020-06-18 08:00:00格式填写">
					  </td>
				    
					  </tr>  
					     
					  <tr style="padding:5px;">
						      <td bgcolor="#eeeeee"> 投诉内容：</td>
						      <td align="left" colspan="3">
						      <textarea rows="5" cols="60" name="complainInfo.complainContent">${complainInfo.complainContent }</textarea>
						      </td>
					  </tr>
					    
					  <tr style="padding:5px;" > 
						      <td bgcolor="#eeeeee" > 处理办法：</td>
						      <td align="left"  colspan="3"> 
						          <textarea rows="5" cols="60" name="complainInfo.complainHandleWay" >${complainInfo.complainHandleWay }</textarea>
						      </td>
					  </tr>  
					  <tr style="padding:5px;">    
						      <td bgcolor="#eeeeee"> 备注信息：</td>
						      <td align="left"  colspan="3"> 
						          <textarea rows="5" cols="60" name="complainInfo.complainRemarkInfo">${complainInfo.complainRemarkInfo }</textarea>
						      </td>
					  </tr>  
			      </table>
			      <p align="center">
			      <input type="submit" value="更新">
			      <input type="reset" value="重置">
			      </p>
			</form>
			</center>
  </body>
</html>

