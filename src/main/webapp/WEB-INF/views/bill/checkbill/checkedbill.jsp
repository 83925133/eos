<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>580订货网--已处理单据</title>
<link href="<c:out value="${ctx}" />/static/css/b_index.css" rel="stylesheet" type="text/css" />
<link href="<c:out value="${ctx}" />/static/css/menu.css" rel="stylesheet" type="text/css" />
</head>
<script language="javascript" type="text/javascript" src="<c:out value="${ctx}" />/static/js/menu.js"></script>
<script language="javascript" type="text/javascript" src="<c:out value="${ctx}" />/static/My97DatePicker/WdatePicker.js"></script>


<body>
<form method=post  name=form1> 
<div align="center">
<table border="0" width="950" >
  <tr>
	<td align="center" height=2></td>
  </tr>
</table>
<table border="0" width="950" id="table38">
  <tr>
	<td width="22" align="center"><img border="0" src="<c:out value="${ctx}" />/static/img/bullet0.gif" width="10" height="10"></td>
	<td align=left height="35" style="font-family: 微软雅黑; font-size: 10pt"><b>当前位置:&nbsp;</b>&nbsp;处理单据 &gt;&nbsp; 已处理单据&nbsp; </td>
	<td align=right width="461">
    </td>
  </tr>
</table>


<table width="950" id="table38" style="font-family: 微软雅黑; font-size: 10pt; border:1px solid #E9F1F4; padding-left:4px; padding-right:4px; padding-top:1px; padding-bottom:1px"cellpadding="0" cellspacing="0">
  <tr>
	<td  width="22" bgcolor="#E9F1F4" align="right"><img border="0" src="<c:out value="${ctx}" />/static/img/search1.gif" width="18" height="18"></td>
	<td height="28" bgcolor="#E9F1F4"><b>查询条件</b></td>
  </tr>
</table>  
<table border="0" width="950" id="table1">
  <tr>
	<td align="center" height=1></td>
  </tr>
</table>

<table width="950" id="table20" style="border:1px solid #E9F1F4; font-family: 微软雅黑; font-size: 10pt; padding-left:4px; padding-right:4px; padding-top:1px; padding-bottom:1px"cellpadding="0" cellspacing="0" bordercolor="#C4D5E0">

    <tr>
    <td width="110" height="35" align="right">
    	<select size="1" name="billtype" style="text-align:righ;border:1px dotted #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:1px; padding-bottom:1px; font-family:微软雅黑; font-size:10pt">
			<option <c:if test="${billtype eq '=单据类型='}">selected</c:if>>=单据类型=</option>	
			<option <c:if test="${billtype eq '订货单'}">selected</c:if>>订货单</option>	
			<option <c:if test="${billtype eq '销售单'}">selected</c:if>>销售单</option>								
			<option <c:if test="${billtype eq '入库单'}">selected</c:if>>入库单</option>
			<option <c:if test="${billtype eq '退货单'}">selected</c:if>>退货单</option>				
			<option <c:if test="${billtype eq '报损单'}">selected</c:if>>报损单</option>
			<option <c:if test="${billtype eq '货款单'}">selected</c:if>>货款单</option>	
			<option <c:if test="${billtype eq '调价单'}">selected</c:if>>调价单</option>					
			<option <c:if test="${billtype eq '通知单'}">selected</c:if>>通知单</option>							
		</select>
	</td>

    <td width="60" height="35" align="right">单据编号</td>
    <td width="100" align="left" ><input style="text-align:righ;border:1px dotted #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:1px; padding-bottom:1px; font-family:微软雅黑; font-size:10pt" type="text" name="qbno" size="20" value="${qbno}"></td>
    <td width="80" height="24" align="right" >业务日期(起)</td>
    <td width="100" align="left">
      <table width="100%" cellspacing="0" cellpadding="0" id="table36">
        <tr>
          <td width="100">
			<input style="text-align:righ;border:1px dotted #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:1px; padding-bottom:1px; font-family:微软雅黑; font-size:10pt" type="text" id=d14 name="date1" readonly  size="10"  value="${date1}"></td>
          <td width="30"><span style="cursor:hand">
          <img onclick="WdatePicker({el:'d14'})" src="<c:out value="${ctx}" />/static/img/calendar.gif" width="16" height="15" align="middle"></span></td>
        </tr>
      </table>
    </td>			
    <td width="80" align="right">业务日期(止)</td>
    <td width="100" align="left" >
      <table border="0" width="100%" cellspacing="0" cellpadding="0" id="table34">
        <tr>
          <td width="100">
			<input style="text-align:righ;border:1px dotted #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:1px; padding-bottom:1px; font-family:微软雅黑; font-size:10pt" id="d16" type="text" readonly name="date2" size="10"  value="${date2}" /></td>
          <td width="30"><span style="cursor:hand"><img onclick="WdatePicker({el:'d16'})" src="<c:out value="${ctx}" />/static/img/calendar.gif" width="16" height="15" align="middle"></span></td>
        </tr>
      </table>
    </td>
    <td width="80" height="24" align="right">订(供)货方</td>
    <td width="110">
		<input style="text-align:righ;border:1px dotted #ADC0C9;background-color:#FFFFFF; padding-left:3px; padding-right:1px; padding-top:1px; padding-bottom:1px; font-family:微软雅黑; font-size:10pt" type="text" id=d14 name="custhost"  size="16"  value="${custhost}">
	</td>
  </tr>	  
</table>
<table border="0" width="950" cellspacing="0" cellpadding="0" id="table37" height="30">								
  <tr>
    <td align="right" height="40">
	<input  type="button"class="btn-o4" style="font-family: 微软雅黑; font-size: 10pt"value="查  询" onClick="dosubmit('query')"/>&nbsp;&nbsp;&nbsp;
	<input  type="button"class="btn-o4" style="font-family: 微软雅黑; font-size: 10pt"value="清空条件" onClick="dosubmit('empty')"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input  type="button"class="btn-o4" style="font-family: 微软雅黑; font-size: 10pt"value="供货统计" onClick="dosubmit('tot')"/>&nbsp;&nbsp;
	<input  type="button"class="btn-o4" style="font-family: 微软雅黑; font-size: 10pt"value="询  价" onClick="dosubmit('askprice')"/>&nbsp; 
	<input  type="button"class="btn-o4" style="font-family: 微软雅黑; font-size: 10pt"value="拣货单" onClick="dosubmit('distribute')"/>&nbsp;&nbsp;
	<input  type="button"class="btn-o4"  style="font-family: 微软雅黑; font-size: 10pt"value="拣货确认" onClick="dosubmit('distributeyes')"/> &nbsp;		
	</td>	
  </tr>
</table>
	

<input type="hidden" name="newmark" value="yes">	
<table border="0" width="950" id="table38" bgcolor="#E9F1F4">
  <tr>
    <td width="22" align="right"><img border="0" src="<c:out value="${ctx}" />/static/img/note.gif" width="18" height="18"></td>
    <td height="28" style="font-family: 微软雅黑; font-size: 10pt"><b>待处理单据</b></td>
  </tr>
</table>

<table border="0" width="950" id="table1">
  <tr>
	<td align="center" height=1></td>
  </tr>
</table>
<table width="100%" border="1" cellspacing="0" cellpadding="0" bordercolor="#E9F1F4" style="border-left: 1px solid #E9F1F4; border-right: 1px solid #E9F1F4; border-bottom: 1px solid #E9F1F4; border-top: 1px solid #E9F1F4; width:950px;font-family:微软雅黑; font-size:10pt" class="basetable" >
<tr>
  <th height="24" style="border-left:1px solid #E9F1F4; border-right:1px solid #E9F1F4; border-bottom:1px solid #E9F1F4; height:40px" align="left" width="100">
	单据类别<br>
	单据编号</th>
  <th align="left" style="border-left: 1px solid #E9F1F4; border-right: 1px solid #E9F1F4; border-bottom: 1px solid #E9F1F4" width="300">
	业务单位</th>
  <th align="left" style="border-left: 1px solid #E9F1F4; border-right: 1px solid #E9F1F4; border-bottom: 1px solid #E9F1F4" width="127">
	付款方式<br>
	付款类别</th>	
  <th align="left" style="border-left: 1px solid #E9F1F4; border-right: 1px solid #E9F1F4; border-bottom: 1px solid #E9F1F4" width="77">
	单据金额(元)</th>
  <th align="left" style="border-left: 1px solid #E9F1F4; border-right: 1px solid #E9F1F4; border-bottom: 1px solid #E9F1F4" width="83">
	处理类别<br>
	处理人</th>
  <th align="left" style="border-left: 1px solid #E9F1F4; border-right: 1px solid #E9F1F4; border-bottom: 1px solid #E9F1F4" width="100">
	业务日期</th>
  <th align="left" style="border-left: 1px solid #E9F1F4; border-right: 1px solid #E9F1F4; border-bottom: 1px solid #E9F1F4" width="80">操作</th>
</tr> 

<c:forEach items="${billInfos}" var="billInfo" varStatus="i">
	<tr onMouseOver= "this.style.backgroundColor='#EFEFEF';" onmouseout="this.style.backgroundColor='#ffffff';" <c:if test="${readmark eq 'no'}">style="font-family: 微软雅黑; font-size: 10pt; font-weight: bold"</c:if>>
	<td height="24" width="100" style="height: 50px">
		${billInfo.billtype}
	<br>
		<c:choose>
			<c:when test="${billInfo.bnoUser != ''}">
	           ${billInfo.bnoUser}
	       </c:when>
			<c:otherwise>
	           ${billInfo.bno}
	       </c:otherwise>
		</c:choose>
	</td>
	<td width="300">
		<c:if test="${billInfo.billtype eq '通知单'}">${billInfo.hostname}<br>《${billInfo.custname}》</c:if>
	 	<c:if test="${billInfo.billtype eq '调价单'}">${billInfo.hostname}<br>${billInfo.custname}</c:if>
	 	<c:if test="${billInfo.billtype eq '货款单'}"> 客户名称：${billInfo.custname}</c:if>
	 	<c:if test="${billInfo.billtype eq '销售单'}"> 客户名称：${billInfo.custname}</c:if>
	 	<c:if test="${billInfo.billtype eq '入库单'}"> 供货方：${billInfo.hostname}</c:if>
	 	<c:if test="${billInfo.billtype eq '订货单'}">  
	 		<c:if test="${billInfo.custno eq empinfo.uno}"> 供货方：${billInfo.hostname}</c:if>
	 		<c:choose>
				<c:when test="${billInfo.custno eq empinfo.uno}">
		          	 供货方：${billInfo.hostname}
		       </c:when>
				<c:otherwise>
		          	订货方：${billInfo.custname}
		       </c:otherwise>
			</c:choose>
	 	</c:if>
	 	<c:if test="${billInfo.billtype eq '退货单'}">  
	 		<c:if test="${billInfo.custno eq empinfo.uno}"> 供货方：${billInfo.hostname}</c:if>
	 		<c:choose>
				<c:when test="${billInfo.custno eq empinfo.uno}">
		          	 供货方：${billInfo.hostname}
		       </c:when>
				<c:otherwise>
		          	订货方：${billInfo.custname}
		       </c:otherwise>
			</c:choose>
	 	</c:if>
		<c:if test="${billInfo.billtype eq '报损单'}">  
	 		<c:if test="${billInfo.custno eq empinfo.uno}"> 供货方：${billInfo.hostname}</c:if>
	 		<c:choose>
				<c:when test="${billInfo.custno eq empinfo.uno}">
		          	 供货方：${billInfo.hostname}
		       </c:when>
				<c:otherwise>
		          	订货方：${billInfo.custname}
		       </c:otherwise>
			</c:choose>
	 	</c:if>
	</td>
	<td height="24" width="127">
		<c:choose>
			<c:when test="${billInfo.billtype eq '通知单' or billInfo.billtype eq '调价单'}">
	          	-
	       </c:when>
			<c:otherwise>
	          	订货方：${billInfo.paytype}<br>${billInfo.paymenttype}
	       </c:otherwise>
		</c:choose>
	</td>
	<td width="77">
		<c:choose>
			<c:when test="${billInfo.total1 eq ''}">
	          	<%-- if cdbl(rs1("total1"))<>cdbl(rs1("total2")) then--%>
	          	<c:if test="${billInfo.total1 != billInfo.total2}">  
	          	<font face="微软雅黑" color="#808080">(${billInfo.total1})
	          	</font>
	          	</c:if>
	       </c:when>
			<c:otherwise>
	          	${billInfo.total2}
	       </c:otherwise>
		</c:choose>
	</td>
	<td width="83">${billInfo.billProc}<br>${billInfo.procMan}</td>
	<td width="100">
		<c:if test="${billInfo.billtype eq '货款单'}">到账日期</c:if>
		<c:if test="${billInfo.billtype eq '订货单'}">送货日期</c:if>	
		<c:if test="${billInfo.billtype eq '销售单'}">送货日期</c:if>							
		<c:if test="${billInfo.billtype eq '入库单'}">入库日期</c:if>
		<c:if test="${billInfo.billtype eq '退货单'}">退货日期</c:if>			
		<c:if test="${billInfo.billtype eq '报损单'}">报损日期</c:if>
		<c:if test="${billInfo.billtype eq '货款单'}">发布日期</c:if>
		<c:if test="${billInfo.billtype eq '调价单'}">调价日期</c:if>				
		<br>
		<c:choose>
			<c:when test="${billInfo.arrivedate eq ''}">
	          	 -
	       </c:when>
			<c:otherwise>
	          	${billInfo.arrivedate}
	       </c:otherwise>
		</c:choose>
	</td>
	<td width="80">
		<c:if test="${billInfo.billtype eq '入库单'}">
		  <a  href="<c:out value="${ctx}" />/static/checkbill/unckreceiptdetail">详细</a> 
		</c:if> 
		<c:if test="${billInfo.billtype eq '退货单'}">
			<c:if test="${billInfo.rbilltype eq '入库单'}">
		    	<a  href="<c:out value="${ctx}" />/static/checkbill/unckreturnreceiptdetail">详细</a>  
		    </c:if>
		    <c:if test="${billInfo.rbilltype eq '订货单'}"> 
		    	<a  href="<c:out value="${ctx}" />/static/checkbill/unckreturnorderdetail">详细</a> 
		    </c:if>
		</c:if> 
		<c:if test="${billInfo.billtype eq '报损单'}">
			<c:if test="${billInfo.rbilltype eq '入库单'}">
		    	<a  href="<c:out value="${ctx}" />/static/checkbill/uncklostreceiptdetail">详细</a>  
			</c:if>
			<c:if test="${billInfo.rbilltype eq '订货单'}"> 
				<a  href="<c:out value="${ctx}" />/static/checkbill/uncklostorderdetail">详细</a>  
			</c:if>
		</c:if>
		<c:if test="${billInfo.billtype eq '订货单'}">
		  <a href="<c:out value="${ctx}" />/static/checkbill/unckorderdetail">详细</a>  
		  <c:if test="${empinfo.uno eq billInfo.hostno}">
		  	<c:if test="${prntype eq '小张多联纸'}">
		      <a target=_blank href="<c:out value="${ctx}" />/static/checkbill/unckorderprint1">打印</a>  
		    </c:if> 
		    <c:if test="${prntype eq '大张多联纸'}"> 
		      <a target=_blank href="<c:out value="${ctx}" />/static/checkbill/unckorderprint2">打印</a>  
		    </c:if> 
		  </c:if>
		</c:if>
		<c:if test="${billInfo.billtype eq '销售单'}">
		  <a href="<c:out value="${ctx}" />/static/checkbill/uncksaledetail">详细</a>  
		  <c:if test="${empinfo.uno eq billInfo.hostno}">
		    <c:if test="${prntype eq '小张多联纸'}">
		      <a target=_blank href="<c:out value="${ctx}" />/static/checkbill/unckorderprint1">打印</a>  
		    </c:if>
		    <c:if test="${prntype eq '大张多联纸'}"> 
		      <a target=_blank href="<c:out value="${ctx}" />/static/checkbill/unckorderprint2">打印</a>  
		    </c:if>
		  </c:if>
		</c:if>
		<c:if test="${billInfo.billtype eq '货款单'}">
		  <a href="<c:out value="${ctx}" />/static/checkbill/unckpaymentdetail">详细</a>
		</c:if>
		<c:if test="${billInfo.billtype eq '通知单'}">  
		  <a href="<c:out value="${ctx}" />/static/checkbill/unckinfodetail">详细</a>
		</c:if>
		<c:if test="${billInfo.billtype eq '调价单'}">  
		  <a href="<c:out value="${ctx}" />/static/checkbill/unckpricedetail">详细</a>
		</c:if>
	</td>
	</tr>
</c:forEach>

<input type="hidden" name="bill_proc_id${i.index + 1}" value="${billInfo.bill_proc_id}">		
<input type="hidden" name="custno${i.index + 1}" value="${billInfo.custno}">		
<input type="hidden" name="custname${i.index + 1}" value="${billInfo.custname}">		
<input type="hidden" name="hostno${i.index + 1}" value="${billInfo.hostno}">		
<input type="hidden" name="hostname${i.index + 1}" value="${billInfo.hostname}">	
<input type="hidden" name="detailbno${i.index + 1}" value="${billInfo.bno}">		
<input type="hidden" name="id${i.index + 1}" value="${billInfo.id}">

<input type="hidden" name="ynprice" value="">
<input type="hidden" name="ynqty" value="">
<input type="hidden" name="ptype" value="">
<input type="hidden" name="pricecol" value="">
<input type="hidden" name="pricedesc" value="">
<input type="hidden" name="hostno" value="">
<input type="hidden" name="hostname" value="">

<input type="hidden" name="detailbno" value="">	
</table>


<table border="0" width="950" id="tb5" cellspacing="1">
  <tr>
	<td align="center" height=1></td>
  </tr>
</table>
<c:if test="${fn:length(billInfos) ne 0}">
<table border="0" width="950" id="table311" bgcolor="#E9F1F4" style="font-family: 微软雅黑; font-size: 10pt">
  <tr> 
    <td align="right" height="28">
      分页-----
    </td>
  </tr>
</table>
</c:if>
<c:if test="${fn:length(billInfos) eq 0}">
<table border="0" width="950" cellspacing="0" cellpadding="0" height="20" id="table20">
  <tr>
    <td align="center" height="40" style="font-size: 12pt">
	<p align="right"><img border="0" src="<c:out value="${ctx}" />/static/img/notfound.png" width="48" height="48"></td>
    <td align="center" height="120" style="font-size: 12pt" width="503">
	<p align="left"><b><font face="微软雅黑" color="#FF0000" face="微软雅黑" size="2">&nbsp; 未找到待处理</font><font face="微软雅黑" size="2" color="#FF0000">单据</font></b></td>
  </tr>
</table>
</c:if>

<table border="0" width="950" id="tb5" cellspacing="1">
  <tr>
	<td align="center" height="0"></td>
  </tr>
</table>
<input type="hidden" name="frompage" value="uncheckedlist">	
<input type="hidden" name="bill_proc_id" value="">		
<input type="hidden" name="state_id" value="">	
<input type="hidden" name="qcustno" value="">		
<input type="hidden" name="qcustname" value="">		
<input type="hidden" name="qhostno" value="">		
<input type="hidden" name="qhostname" value="">	
<input type="hidden" name="totmark" value="new">		
<table border="0" width="950" id="tb5" cellspacing="1">
  <tr>
	<td align="center" height=50></td>
  </tr>
</table>
<input type="hidden" name="billproc_mark" value="">
</form>
</div>
<script type="text/javascript">

function dosubmit(myvar){  
  if(myvar=="empty") {
    document.form1.billtype.value="=单据类型=";    
    document.form1.qbno.value=""; 
    document.form1.date1.value="";    
    document.form1.date2.value=""; 
    document.form1.custhost.value="";     
    //form1.submit();                                                      
  }
  if(myvar=="query") {
    if(document.form1.date2.value!="") {
      if(document.form1.date1.value>document.form1.date2.value) {
        alert('业务日期(起)不能大于业务日期(至)');
        document.form1.date1.setfocus;    
        return false;      
      }  
    }    
    form1.action="<c:out value="${ctx}" />/bill/findCheckedBill";    
    form1.submit();
  }
  
  if(myvar=="tot"){
    if(document.form1.date2.value!="") {
      if(document.form1.date1.value>document.form1.date2.value) {
        alert('业务日期(起)不能大于业务日期(至)');
        document.form1.date1.setfocus;    
        return false;      
      }  
    }    
    form1.target="_blank";         
    form1.action="../../checkbill/uncktotal/";
    form1.submit();    
  }  
  if(myvar=="agree") {
    form1.action="../../checkbill/unckyes/"
    form1.submit(); 
  }   
  if(myvar=="reject")  {  
    if(document.form1.proc_note.value=="") {
        alert("请录入退回单据原因");
        return false;      
    }    
    form1.action="../../checkbill/unckno/"
    form1.submit(); 
    
  }  
  if(myvar=="distribute") {
    if(document.form1.date2.value!=""){
      if(document.form1.date1.value>document.form1.date2.value){
        alert('业务日期(起)不能大于业务日期(至)');
        document.form1.date1.setfocus;    
        return false;      
      }  
    }    
    form1.target="_blank";         
    form1.action="../../checkbill/unckorderdistribute/";
    form1.submit();    
  } 
  if(myvar=="distributeyes"){
 
    if(document.form1.date2.value!=""){
      if(document.form1.date1.value>document.form1.date2.value){
        alert('业务日期(起)不能大于业务日期(至)');
        document.form1.date1.setfocus;    
        return false;      
      }  
    }    
    
    form1.target="_blank";          
    form1.action="../../checkbill/unckorderdistributeyes2/";
    form1.submit(); 
  }  
     
  if(myvar=="askprice") {
    if(document.form1.date2.value!=""){
      if(document.form1.date1.value>document.form1.date2.value){
        alert('业务日期(起)不能大于业务日期(至)');
        document.form1.date1.setfocus;    
        return false;      
      }  
    }    
    form1.action="../../checkbill/unckorderaskprice/";
    form1.submit();    
  }       
}
</script>
</body>
</html>