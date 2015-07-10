<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />

<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<title>580订货网</title>

<style type="text/css">
.text  {height:26px;line-height:30px;border:1px #ccc solid;width:110px;}
.button  {height:30px;line-height:20px;border:1px #ccc solid;width:116px;}</style>
<link href="../mob/css/b_index.css" rel="stylesheet" type="text/css" />
</head>

<script language="JavaScript" type="text/JavaScript">
function dosubmit()
{
  if (document.form1.eno.value=="")
  {
    alert("请输入登录名");
    document.form1.eno.focus();
    return false;
  }
    if (document.form1.pwd.value=="")
  {
    alert("请输入登录密码");
    document.form1.pwd.focus();
    return false;
  }
  
  document.form1.action="../userdat/login/"; 
  form1.submit();
}
</script>
<title>用户登录</title>
</head>

<body topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0">

<%
 
  if request("id")<>"" then
 
    ch="select topic from eos_user where uno='"&request("id")&"'"
    Set rs_user = Server.CreateObject("ADODB.Recordset") 
    rs_user.Open ch,conn,3,1   

  end if
  
%>  
<table border="0" width="100%">
	<tr>
		<td>
		  <p align="center"><b><font face="微软雅黑" size="4">
		  <%  if request("id")<>"" then %><%=rs_user("topic")%>
		  <% else %>
		  580订货网
		  <% end if%>
		</font></b>
		</td>
	</tr>
	<%  if request("id")<>"" then %>
	<tr>
		<td>
		<p align="center">
		<img border="0" src="../../img/userlogo/<%=request("id")%>.jpg" width="198" height="136"></td>
	</tr>
	<% else %>
	<tr>
		<td>
		<img border="0" src="../img/banner2.jpg" width="100%"></td>
	</tr>
	<% end if%>

</table>
<form method=post  name=form1>	
<table border="0" width="100%">
  <tr>
    <td colspan="2" height="60" width="100%" align="center">
	<font face="微软雅黑" size="5" color="#666666"><b>用&nbsp;户 登 录</b></font></td>
  </tr>
  
  <tr>
	<td height="35" style="font-family: 微软雅黑; font-size: 14pt" align="right" width="40%">登录名&nbsp;</td>
	<td  style="font-family: 微软雅黑; font-size: 18pt " width="60%">
	<input class="text" style="text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:1px; padding-bottom:1px; font-size:14pt; font-family:微软雅黑" name=eno size="12"  value="<%=request("eno")%>"></td>
  </tr>
  <tr>
	<td height="35" style="font-family: 微软雅黑; font-size: 14pt" align="right" width="40%">登录密码&nbsp;</td>
	<td  style="font-family: 微软雅黑; font-size: 18pt " width="60%">
	<input class="text" style="text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:1px; padding-bottom:1px; font-size:14pt; font-family:微软雅黑" name=pwd size="12"  value="<%=request("eno")%>" type="password"></td>
  </tr> 
  <tr>
	<td height="35" style="font-family: 微软雅黑; font-size: 14pt" align="right" width="40%">　</td>
	<td  style="font-family: 微软雅黑; font-size: 18pt " width="60%">
	<input type="button" class="button" value="登    录" name="B3"  onclick="dosubmit()" style="font-family: 微软雅黑; font-size: 14pt;background-color:#FF9900;border:1px none solid#FF9900;"></td>
  </tr>    
</table>

</form1>
<table border="0" width="100%">
	<tr>
		<td  height="20"></td>
	</tr>

</table>
<!--#include file="../bot.asp"--> 
</body>
</html>