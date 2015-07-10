<%@ page language="java" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><spring:message code="msg.project.title" /></title>
<link href="<c:out value="${ctx}" />/static/css/b_index.css"
	rel="stylesheet" type="text/css" />
<link href="<c:out value="${ctx}" />/static/css/menu.css"
	rel="stylesheet" type="text/css" />
</head>
<script language="javascript" type="text/javascript"
	src="<c:out value="${ctx}" />/static/js/menu.js"></script>
<script language="javascript" type="text/javascript"
	src="<c:out value="${ctx}" />/static/My97DatePicker/WdatePicker.js"></script>
<script Language="javascript">
	function tohome(){
		form1.action = "<c:out value="${ctx}" />/";
		form1.submit();
	}
</script>
<script type="text/javascript">
	function init() {

	}
</script>
<body onload="init();">
	<script language="javascript" type="text/javascript"
		src="<c:out value="${ctx}" />/static/js/menu.js"></script>
	<div align="center">
		<table border="0" width="100%" height="30" bgcolor="#F5F5F1">
			<tr>
				<td align=center
					style="border-left-width: 1px; border-right-width: 1px; border-top-width: 1px; border-bottom: 1px solid #CCCCCC">
					<table border="0" width="950" height="30" bgcolor="#F5F5F1">
						<tr>
							<td align="left" style="font-family: 微软雅黑; font-size: 10pt"
								height="30">&nbsp;&nbsp;<font color="#FF3300"> <spring:message
										code="msg.welcome" />！
							</font><font face="微软雅黑" color="#FF3300"><c:out
										value="${empinfo.user.name}" />&nbsp;&nbsp;<c:out
										value="${empinfo.ename}" /></font>
							</td>
							<td>
								<ul id="nav">
									<div id="header">
										<li><a style="font-family: 微软雅黑; font-size: 10pt" href="<c:url value="/"/>" >
											&nbsp;&nbsp;&nbsp;&nbsp;首页</a>
										<li><a style="font-family: 微软雅黑; font-size: 10pt"
											href="#;">填写单据<font color="#FF0000">∨</font></a>
											<ul>
												<c:forEach items="${menus}" var="menu">
													<c:if test="${menu.menugno == 10}">
														<li><a style="font-family: 微软雅黑; font-size: 10pt"
															href="${url}?uno=<c:out value="${empinfo.eno}"/>&uname=<c:out value="${empinfo.user.name}"/>&ename=<c:out value="${empinfo.ename}"/>&eid=<c:out value="${empinfo.id}"/>&etel=020-32029377&emob=&utype=sale&paytypeok=&itemok=&itemdescok=&topic=广州环澳亚通生物科技有限公司订货平台 &role=管理员">&nbsp;
																<c:out value="${menu.menuname}" />
														</a></li>
													</c:if>
												</c:forEach>
											</ul></li>

										<li><a style="font-family: 微软雅黑; font-size: 10pt"
											href="#;">处理单据<font color="#FF0000">∨</font></a>
											<ul>
												<li><a style="font-family: 微软雅黑; font-size: 10pt"
													href="<c:out value="${ctx}" />/bill/findUncheckedBill">&nbsp;&nbsp;待处理单据</a></li>
												<li><a style="font-family: 微软雅黑; font-size: 10pt"
													href="<c:out value="${ctx}" />/bill/findCheckedBill">&nbsp;&nbsp;已处理单据</a></li>
											</ul></li>

										<li><a style="font-family: 微软雅黑; font-size: 10pt"
											href="#;">资料管理<font color="#FF0000">∨</font></a>
											<ul>
												<c:forEach items="${menus}" var="menu">
													<c:if test="${menu.menugno == 20}">
														<li><a style="font-family: 微软雅黑; font-size: 10pt"
															href="${url}?uno=<c:out value="${empinfo.eno}"/>&uname=<c:out value="${empinfo.user.name}"/>&ename=<c:out value="${empinfo.ename}"/>&eid=<c:out value="${empinfo.id}"/>&etel=020-32029377&emob=&utype=sale&paytypeok=&itemok=&itemdescok=&topic=广州环澳亚通生物科技有限公司订货平台 &role=管理员">&nbsp;
																<c:out value="${menu.menuname}" />
														</a></li>
													</c:if>
												</c:forEach>
											</ul></li>
										<li><a style="font-family: 微软雅黑; font-size: 10pt"
											href="#;">业务设置<font color="#FF0000">∨</font></a>
											<ul>
												<c:forEach items="${menus}" var="menu">
													<c:if test="${menu.menugno == 30}">
														<li><a style="font-family: 微软雅黑; font-size: 10pt"
															href="${url}?uno=<c:out value="${empinfo.eno}"/>&uname=<c:out value="${empinfo.user.name}"/>&ename=<c:out value="${empinfo.ename}"/>&eid=<c:out value="${empinfo.id}"/>&etel=020-32029377&emob=&utype=sale&paytypeok=&itemok=&itemdescok=&topic=广州环澳亚通生物科技有限公司订货平台 &role=管理员">&nbsp;
																<c:out value="${menu.menuname}" />
														</a></li>
													</c:if>
												</c:forEach>
											</ul></li>
										<li><a style="font-family: 微软雅黑; font-size: 10pt"
											href="#;">报表中心<font color="#FF0000">∨</font></a>
											<ul>
												<c:forEach items="${menus}" var="menu">
													<c:if test="${menu.menugno == 40}">
														<li><a style="font-family: 微软雅黑; font-size: 10pt"
															href="${url}?uno=<c:out value="${empinfo.eno}"/>&uname=<c:out value="${empinfo.user.name}"/>&ename=<c:out value="${empinfo.ename}"/>&eid=<c:out value="${empinfo.id}"/>&etel=020-32029377&emob=&utype=sale&paytypeok=&itemok=&itemdescok=&topic=广州环澳亚通生物科技有限公司订货平台 &role=管理员">&nbsp;
																<c:out value="${menu.menuname}" />
														</a></li>
													</c:if>
												</c:forEach>
											</ul></li>
										<li><a style="font-family: 微软雅黑; font-size: 10pt"
											href="<c:out value="${ctx}" />/logout"><spring:message
													code="msg.logout" /></a></li>
									</div>
								</ul>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	<%--
		<table border="0" width="950">
			<tr>
				<td align="center" height=2></td>
			</tr>
		</table>
		<table border="0" width="950" id="table38"
			background="<c:out value="${ctx}" />/static/img/4.jpg" height="45">
			<tr>
				<td align=left height="45" width="248">
					<p align="center">
					<table border="0" width="100%" id="table38" background="<c:out value="${ctx}" />/static/img/4.jpg" height="45">
						<tr>
							<td align=center valign="bottom"><b><font face="微软雅黑"
									size="2" color="#FFFFFF"> <a
										href="http://www.eos580.com"><font color="#FFFFFF">www.eos580.com</font></a>&nbsp;
								</font></b><i><font face="微软雅黑" color="#FFFFFF" size="1">e-order
										system</font></i></td>
						</tr>
						<tr>
							<td align=center valign="top">
								<b> 
									<font face="微软雅黑" size="2" color="#FFFFFF" face="微软雅黑">
										<c:choose>
											<c:when
												test="${empinfo.user.userType == 'sale' or empinfo.user.userType == 'buysale'}">
									           ${empinfo.user.name }订货平台
									       </c:when>
											<c:otherwise>
									           580订货网，订货我帮您
									       </c:otherwise>
										</c:choose>
									</font>
								</b>
							</td>
						</tr>
					</table>
				</td>
				<td align=right height="45" width="137"></td>
				<td align=center height="45">
					<font face="微软雅黑" size="5" color="#FFFFFF" face="微软雅黑">
						<c:choose>
							<c:when
								test="${empinfo.user.userType == 'sale' or empinfo.user.userType == 'buysale'}">
					           ${empinfo.user.name }订货平台
					       </c:when>
							<c:otherwise>
					           580订货网，订货我帮您
					       </c:otherwise>
						</c:choose>
					</font>
				</td>
			</tr>
		</table> 
		--%>
		<%@ include file="/WEB-INF/common/common_pic.jsp"%>
	</div>