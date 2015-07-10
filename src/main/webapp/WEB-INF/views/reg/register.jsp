<%@ page language="java" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ include file="/WEB-INF/common/taglibs.jsp" %>
<head>
<title>580订货网--用户注册</title>
<link href="<c:out value="${ctx}" />/static/css/b_index.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="<c:out value="${ctx}" />/static/css/global.css">
<link href="<c:out value="${ctx}" />/static/css/menu.css" rel="stylesheet" type="text/css" />
</head>
<script language="javascript" type="text/javascript" src="<c:out value="${ctx}" />/static/js/menu.js"></script>


<body onload="document.form1.biglocation.selectedIndex=0;document.form1.uno.focus();">

<form method=post action="<c:out value="${ctx}" />/reg/regok/" name=form1 onSubmit="return chk(this)">

<div align="center">

<%@ include file="/WEB-INF/common/common_pic.jsp"%>


<table border="0" width="950" id="table38">
	<tr>
	    <td width="22" align="center">
		<img border="0" src="<c:out value="${ctx}" />/static/img/bullet0.gif" width="10" height="10"></td>
		<td align=left height="35" style="font-family: 微软雅黑; font-size: 10pt"><b>当前位置:&nbsp;</b>&nbsp;用户注册</td>
		<td align=right width="601"></td>
	</tr>
</table>

<table>
  <tr>
	<td height=20></td>
  </tr>
</table>

<table width="637" style="border-left: 3px double #E9F1F4; border-right: 3px double #E9F1F4; border-top: 3px double #E9F1F4; " >
  <tr>
	<td align="center" height="30" background="<c:out value="${ctx}" />/static/img/user_top.gif"><b>
	<font face="微软雅黑" size="2" color="#666666">用户注册</font></b></td>
  </tr>
</table>

<table width="637" style="border-left: 3px double #E9F1F4; border-right: 3px double #E9F1F4; border-top: 1px solid #E9F1F4; border-bottom: 3px double #E9F1F4; font-family:微软雅黑; font-size:10pt">
  <tr>
    <td width="631" align="right" height="15"  colspan="3"></td>
  </tr>
  <tr>
    <td width="124" align="right" height="30" ><b>
	<font face="微软雅黑" face="微软雅黑" size="2" color="#666666">登录名</font></b></td>
    <td width="296" align="left">&nbsp;<input name=uno size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"><font face="微软雅黑" color="#F96F37" size="2">
	用于用户登录系统，请使用</font><p><font face="微软雅黑" face="Tahoma" size="2">
	<font face="微软雅黑" color="#F96F37">
	英文字母和数字</font> &nbsp; </font> </td>
  </tr>

  <tr>			
    <td width="124" align="right"  height="30"><b>
	<font face="微软雅黑" face="微软雅黑" size="2" color="#666666">用户名称</font></b></td>
    <td width="296" align="left">&nbsp;<input name=name size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"><font face="微软雅黑" color="#F96F37" face="Tahoma" size="2">企业名称或个人姓名</font></td>
  </tr>
  <tr>
    <td width="124" align="right" height="30" ><b><font face="微软雅黑" color="#666666">登录密码&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;<input name=pwd size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; " type="password"><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"><font face="微软雅黑" face="Tahoma" size="2"><font face="微软雅黑" color="#F96F37">最少6个数字或字母&nbsp;</font> </font> </td>
  </tr>
  <tr>			
    <td width="124" align="right"  height="30"><b><font face="微软雅黑" color="#666666">重复密码&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;<input name=pwd1 size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "  type="password"><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"><font face="微软雅黑" color="#F96F37">重复输入密码</font></td>
  </tr>
  <tr>
    <td width="124" align="right" height="30" ><b><font face="微软雅黑" color="#666666">业务类别&nbsp;</font></b></td>
    <td width="296" align="left">
      <table width="296" border="0" cellpadding="2">
        <tr>
          <td width="20" align="right"><font face="微软雅黑" size="3" face="Tahoma"><input type="radio" name="y1" value="buy" onclick="typeclick0()"></font></td>
          <td width="50">&nbsp;订货</td>
          <td width="20" align="right"><input type="radio" name="y1" value="sale" onclick="typeclick1()"></td>
          <td width="50">&nbsp;供货</font></td>
          <td width="19" align="right"><input type="radio" name="y1" value="buysale" onclick="typeclick2()"></td>
          <td width="135">&nbsp;即订货又供货<font face="微软雅黑" color="#FF0000">*</font></td>
        </tr>		
      </table>
    </td>
    <td width="211" align="left"></td>
  </tr>

  <tr id="type1" style="display:none">
    <td width="124" align="right" height="30" ><b><font face="微软雅黑" color="#666666">所属行业&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;
      <select size="1" name="type1" style="font-family: 微软雅黑; font-size: 10pt">
        <option>====请选择===</option>								
<%-- <%							
  Set rs = Server.CreateObject("ADODB.Recordset") 
  ch="select c1 from eos_pdat_line where dtype="&"'"&"行业分类"&"'"
  rs.Open ch,conn,3,1
  do while not rs.eof
%> 
        <option><%=rs("c1")%></option>
<%
    rs.MoveNext
  loop
%> --%>
     </select><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"></td>
  </tr>  
      
  <tr>
    <td width="124" align="right"  height="30"><b><font face="微软雅黑" color="#666666">所在省份&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;
      <select   name="biglocation"   onChange="changelocation(document.form1.biglocation.options[document.form1.biglocation.selectedIndex].value)" style="font-family: 微软雅黑; font-size: 10pt" size="1" >     
        <option   selected>请选择省份</option>     
<%-- <%     
  sql1="select * from eos_province "     
  Set rs1 = Server.CreateObject("ADODB.Recordset")   
  rs1.Open sql1,conn,3,1  

  do while not rs1.eof     
%>     
        <option value="<%=trim(rs1("locationid"))%>"><%=trim(rs1("locationname"))%></option>     
<%     
    rs1.movenext     
  loop     
  rs1.close     
  set rs1=nothing     
%>      --%>
      </select><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"></td>
  </tr>	
 	
  <tr>
    <td width="124" align="right"  height="29"><b><font face="微软雅黑" color="#666666">所在城市&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;
      <select   name="smalllocation" style="font-family: 微软雅黑; font-size: 10pt" size="1">     
        <option   selected   value="">请选择城市</option>
<%-- <%     
  if regbiglocation<>""  then 
    sql="select * from eos_city where locationid="&regbiglocation     
    Set rs12 = Server.CreateObject("ADODB.Recordset")   
    rs12.Open sql,conn,3,1  

    do while   not   rs12.eof     
%>     
        <option value="<%=trim(rs12("districtid"))%>" ><%=trim(rs12("districtname"))%></option>     
<%     
      rs12.movenext     
    loop     
    rs12.close     
    set rs12=nothing     
  end if
%>     --%>
      </select><font face="微软雅黑" color="#FF0000">*</font>
    </td>
    <td width="211" align="left"></td>
  </tr>
  <tr>
    <td width="124" align="right" height="31" ><b><font face="微软雅黑" color="#666666">地址&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;<input name=addr size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"></td>
  </tr>
  <tr>			
    <td width="124" align="right"  height="30"><b><font face="微软雅黑" color="#666666">联系人&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;<input name=man size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"></td>
  </tr>
  <tr>
    <td width="124" align="right" height="30" ><b><font face="微软雅黑" color="#666666">联系电话&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;<input name=tel size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "><font face="微软雅黑" color="#FF0000">*</font></td>
    <td width="211" align="left"></td>
  </tr>
  <tr>			
    <td width="124" align="right"  height="30"><b><font face="微软雅黑" color="#666666">传真号码&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;<input name=fax size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "></td>
    <td width="211" align="left"></td>
  </tr>
  <tr>
    <td width="124" align="right" height="30" ><b><font face="微软雅黑" color="#666666">手机号码&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;<input name=mob size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "></td>
    <td width="211" align="left"></td>
  </tr>
  <tr>			
    <td width="124" align="right"  height="30"><b><font face="微软雅黑" color="#666666">Email&nbsp; </font> 
	</font></b> </td>
    <td width="296" align="left">&nbsp;<input name=email size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "></td>
    <td width="211" align="left"></td>
  </tr>
  <tr>
    <td width="124" align="right" height="30" ><b>
	<font face="微软雅黑" face="微软雅黑" size="2" color="#666666">QQ&nbsp;</font></b></td>
    <td width="296" align="left">&nbsp;<input name=qq size="40" style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "></td>
    <td width="211" align="left"></td>
  </tr>
  <tr>
    <td width="124" align="right" height="30" ><b><font face="微软雅黑" color="#666666">用户协议&nbsp;</font></b></td>
    <td width="296" align="left">
      <table border="0" width="100%" cellspacing="0" cellpadding="0" id="table16" style="font-size: 10pt; font-family: 宋体" bordercolorlight="#FFFFFF" bordercolordark="#FFFFFF">
        <tr>
          <td width="31" align="center"><input type="checkbox" name="C1" value="ON" checked></td>
          <td><font face="微软雅黑">同意用户协议</font>&nbsp;
			<a style="font-family: 微软雅黑; font-size: 10pt" href="#;">查看用户协议</a></td>
        </tr>
      </table>
    </td>
    <td width="211" align="left"></td>
  </tr>
  <tr>			
    <td width="124" align="right" height="30"><b><font face="微软雅黑" color="#666666">验证码&nbsp;</font></b></td>
    <td width="296" align="left">
      <table  width="95%" >
        <tr>
          <td width="78">&nbsp;<input type="text" name="vcode" id="VCodes" size="8" maxlength="4"  style="height:25;font-family: 微软雅黑; font-size: 10pt; text-align:righ;border:1px solid #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:3px; padding-bottom:3px; "/></td>
          <td> 
            <table border="1" style="border: 1px solid #FFFFFF; padding: 0" />
              <tr>
                <td  align="left" style="border: 1px solid #FFFFFF"><img src="<c:out value="${ctx}" />/static/VCodes.asp" id="shuaxin" align="middle" height="14" style="border: 1px solid #FFFFFF; padding: 0" /></td>
              </tr>
              <tr>
                <td></td>
              </tr>
            </table>
          </td>
          <td width="126"><a href="#" onclick="apwd();" ><font size="2">看不清楚，换一个</font></a></td>
        </tr>
      </table>
    </td>
    <td width="211" align="left"><font face="微软雅黑" color="#F96F37" face="Tahoma" size="2">输入图片中的数字</font></td>
  </tr>		
  <tr>
    <td  align="right" height="15"  colspan="3"></td>
  </tr>
</table>

<table border="0" width="580">
  <tr>
    <td height="40" align="center" valign="bottom">
	<input type="submit" class="btn-o4" style="font-family: 微软雅黑; font-size: 10pt"value="注  册"  /></td>
  </tr>
</table>
<table>
  <tr>
	<td height=30></td>
  </tr>
</table>	
</div>
<%@ include file="/WEB-INF/views/emp/footer.jsp"%>
</form>
<script type="text/javascript" src="<c:out value="${ctx}" />/static/js/jquery.js"></script>
<script type="text/javascript" src="<c:out value="${ctx}" />/static/js/home.js"></script>
<script type="text/javascript">
window.onload = function () {
	showProviceInfo();
}
function showProviceInfo(){  
    var ss = Math.random();  
    $.ajax({  
        type : 'POST',  
        url : 'getProviceInfo',  
        data : 'id=' + ss,  
        success : function(msg){  
            // 清空表格  
            $("#biglocation").empty();  
            // 转换成json对象  
            var data = JSON.parse(msg);  
            var option = "<option value=\"\">请选择...</option>";  
            // 循环组装下拉框选项  
            $.each(data, function(k, v) {  
                option += "<option value=\"" + v['locationid'] + "\">" + v['locationname'] + "</option>";  
            });  
            $("#biglocation").append(option);  
            $("#biglocation").change(function(){  
                showCityInfo($(this).val());  
            });  
        },  
        error : function(msg, textStatus, e) {  
            //alert("当前登录用户失效，请重新登录。");  
            //window.location = path + "/login.jsp";  
        	 alert("系统错误"); 
        }  
    });  
}

function showCityInfo(locationid){  
    var ss = Math.random();  
    $.ajax({  
        type : 'POST',  
        url : 'getCityInfoByLocationid',  
        data : 'id=' + ss + '&locationid=' + locationid,  
        success : function(msg){  
            // 清空表格  
            $("#smalllocation").empty();  
            // 转换成json对象  
            var data = JSON.parse(msg);  
            var option = "";  
            // 循环组装下拉框选项  
            $.each(data, function(k, v){  
                option += "<option value=\"" + v['districtid'] + "\">" + v['districtname'] + "</option>";  
            });  
            if (locationid == "" || locationid == null || locationid == undefined){  
                option += "<option value=\"\">请选择...</option>";  
            }  
            $("#smalllocation").append(option);  
        },  
        error : function(msg, textStatus, e) {  
            //alert("当前登录用户失效，请重新登录。");  
            alert("系统错误");  
            //window.location = path + "/login.jsp";  
        }  
    });  
}
</script>
</body>
</html>