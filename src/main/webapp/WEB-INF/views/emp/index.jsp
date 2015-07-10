<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<script type="text/javascript">
function dosubmit() {
	form1.submit();
}
</script>
<div align="center">
	<form method="post" name="form1" action="<c:out value="${ctx}" />/menu/menulist">
		<table border="0" width="950" id="table38">
			<tr>
				<td width="22" align="center"><img border="0"
					src="<c:out value="${ctx}" />/static/img/bullet0.gif" width="10" height="10"></td>
				<td align=left height="35"
					style="font-family: 微软雅黑; font-size: 10pt"><b>当前位置:&nbsp;</b>&nbsp;首页
					&gt;&nbsp;&nbsp;</td>
				<td align=right width="461"></td>
			</tr>
		</table>
		<table border="0" width="950" id="table38" bgcolor="#E9F1F4"
			style="border: 1px solid #E9F1F4; padding-left: 4px; padding-right: 4px; padding-top: 1px; padding-bottom: 1px"
			bordercolor="#E4EDFE">
			<tr>
				<td width="22" align="center" height="28"><img border="0"
					src="<c:out value="${ctx}" />/static/img/note.gif" width="18" height="18"
					align="right"></td>
				<td align=left height="25"
					style="font-family: 微软雅黑; font-size: 10pt"><b>常用菜单</b>&nbsp;&nbsp;
					<a  onclick="dosubmit()">设置>></a></td>
			</tr>
			<tr>
				<td align="center" width="22" bgcolor="#FFFFFF" height="28" ></td>
				<td align="left" height="25" bgcolor="#FFFFFF" style="line-height: 200%">
					<font face="微软雅黑" size="2">
					<c:choose>
						<c:when test="${fn:length(usermenus) eq 0}">
							&nbsp;您还没有常用菜单，可<a  onclick="dosubmit()" style="color: red;">&nbsp;点击这里&nbsp;</a>或“设置>>”进行设置。
						</c:when>
						<c:otherwise>
							<c:forEach items="${usermenus}" var="usermenu">
								<a href="<c:out value="${url}" />?uno=<c:out value="${empinfo.eno}"/>&uname=<c:out value="${empinfo.user.name}"/>&ename=<c:out value="${empinfo.ename}"/>&eid=<c:out value="${empinfo.id}"/>&etel=<c:out value="${empinfo.tel}"/>&emob=&utype=<c:out value="${empinfo.user.userType}"/>&paytypeok=&itemok=&itemdescok=&topic=<c:out value="${empinfo.user.name}"/> &role=<c:out value="${empinfo.role}"/>">
								&nbsp;<c:out value="${usermenu.menuname}" />
								</a>
							</c:forEach>
						</c:otherwise>
					</c:choose>
					</font>
				</td>
			</tr>
		</table>
		<table border="0" width="950">
			<tr>
				<td align="center" height=5></td>
			</tr>
		</table>
		<input type="hidden" name="newmark" value="yes">
		<table border="0" width="950">
			<tr>
				<td align="center" height=5></td>
			</tr>
		</table>
		<table border="0" width="950" id="tb5" cellspacing="1">
			<tr>
				<td align="center" height=320></td>
			</tr>
		</table>
		<%@ include file="/WEB-INF/common/empinfo.jsp"%>
	</form>
</div>