
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>580订货网--订货方</title>
<link href="<c:out value="${ctx}" />/static/css/b_index.css"
	rel="stylesheet" type="text/css" />
<link href="<c:out value="${ctx}" />/static/css/menu.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<form method="post" name="form1">
		<div align="center">
			<table border="0" width="950" id="table38">
				<tr>
					<td width="22" align="center"><img border="0"
						src="<c:out value="${ctx}" />/static/img/bullet0.gif" width="10"
						height="10"></td>
					<td align=left height="35"
						style="font-family: 微软雅黑; font-size: 10pt"><b>当前位置:&nbsp;</b>&nbsp;资料管理
						&gt;&nbsp; 常用菜单</td>
					<td align=right width="601"><input type="button"
						onclick="dosubmit()" class="btn-o4"
						style="font-family: 微软雅黑; font-size: 10pt" value="提  交" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="button" class="btn-o4"
						style="font-family: 微软雅黑; font-size: 10pt" onclick="rt();"
						value='返  回' />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</table>
			<table border="0" width="950" id="table38" bgcolor="#E9F1F4">
				<tr>
					<td width="22" align="right"><img border="0"
						src="<c:out value="${ctx}" />/static/img/note.gif" width="18"
						height="18"></td>
					<td height="28" style="font-family: 微软雅黑; font-size: 10pt"><b>常用菜单</b></td>
				</tr>
			</table>
			<table>
				<tr>
					<td height=2></td>
				</tr>
			</table>
			<table class="basetable"
				style="border: 1px solid #E9F1F4; width: 950px; padding-left: 4px; padding-right: 4px; padding-top: 1px; padding-bottom: 1px; font-family: 微软雅黑; font-size: 10pt;">
				<tr>
					<th style="height: 30px"><input type="checkbox" name="ckall"
						value="" onclick="test5()" >&nbsp;选中</th><input type="hidden" id="ids" name="ids" value="${ids}"></input>
					<th height="24">序号</th>
					<th>功能分类</th>
					<th>功能名称</th>
					<th>功能说明</th>
				</tr>
	  			<c:forEach items="${menus}" var="menu" varStatus="i">
	  				<tr>
					    <td style="height: 30px">
					    	<input type="checkbox" name="c50" value="${menu.id}"
							    <c:forEach items="${usermenus}" var="usermenu" >
							    	<c:if test = "${usermenu.id == menu.id}">checked</c:if>
						    	</c:forEach>
					    	 >
					    </td>
					    <td>${i.index + 1}</td>
					    <td>${menu.menutype}</td>
					    <td>${menu.menuname}</td>
					    <td>${menu.menunote}</td>
				  	</tr>
	  			</c:forEach>
	  
	  
	  
				<%--
    jj=jj+1
    rs4.MoveNext
  Loop
  rs4.close
--%>
			</table>
			<table border="0" width="950" id="table11">
				<tr>
					<td height="40" align="right" valign="bottom">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</table>
			<%@ include file="/WEB-INF/common/empinfo.jsp"%>
			<%--
  if (320-jj*25)>0 then
    h1=320-jj*25
  else
    h1=20
  end if  
--%>

			<table border="0" width="950" id="tb4" cellspacing="1">
				<tr>
					<td align="center"height=<%--=h1 --%>></td>
				</tr>
			</table>
	</form>
<script type="text/javascript" src="<c:out value="${ctx}" />/static/js/jquery.js"></script>
<script language="javascript" type="text/javascript"
	src="<c:out value="${ctx}" />/static/js/menu.js"></script>
<script language="JavaScript" type="text/JavaScript">
	function rt() {
		form1.action="<c:out value="${ctx}" />/";                             
		form1.submit();
	}

	function dosubmit() {
		var oC5 = document.getElementsByName("c50");
		var rnum = 0;
		if (oC5) {
			for (var i = 0; i < oC5.length; i++) {
				if (oC5[i].checked)
					rnum++
			}
		}
		if (rnum == 0) {
			//alert("请选择菜单");
			if (!confirm("确定要清空常用菜单吗？")) {
				return false;
			}else{
				document.form1.action = "<c:out value="${ctx}" />/menu/updateUserMenu";
				document.form1.submit();
			}
		}
		var ids = "";
		$("input[name='c50']:checked").each(function () {
			ids= ids + this.value + ","
        });
		$("#ids").val(ids.slice(0, ids.length-1));
		document.form1.action = "<c:out value="${ctx}" />/menu/updateUserMenu";
		document.form1.submit();

	}
</script>

<script language="javascript" type="text/javascript">
<!--
	//全选 
	 function test5() {
		o = document.getElementsByName("c50")
		for (i = 0; i < o.length; i++)
			o[i].checked = event.srcElement.checked
	} 
-->

//全选/取消全选
/* jQuery('#ckall').click(function () {
	jQuery("input[name='c50']").attr("checked", 'true');
}, function () {
	jQuery("input[name='c50']").removeAttr("checked");
}); */
</script>
</body>
</html>