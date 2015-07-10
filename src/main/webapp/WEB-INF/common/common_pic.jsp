<%@ page language="java" pageEncoding="UTF-8"%>
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
			<table border="0" width="100%" id="table38"
				background="<c:out value="${ctx}" />/static/img/4.jpg" height="45">
				<tr>
					<td align=center valign="bottom"><b><font face="微软雅黑"
							size="2" color="#FFFFFF"> <a
								href="http://www.eos580.com"><font color="#FFFFFF">www.eos580.com</font></a>&nbsp;
						</font></b><i><font face="微软雅黑" color="#FFFFFF" size="1">e-order
								system</font></i></td>
				</tr>
				<tr>
					<td align=center valign="top"><b> <font face="微软雅黑"
							size="2" color="#FFFFFF" face="微软雅黑">
								<c:choose>
									<c:when
										test="${empinfo.user.userType == 'sale' || empinfo.user.userType == 'buysale'}">
							           ${empinfo.user.name }订货平台
							       </c:when>
									<c:otherwise>
							           580订货网，订货我帮您
							       </c:otherwise>
								</c:choose>
						</font></b></td>
				</tr>
			</table>
		</td>
		<td align=right height="45" width="137"></td>
		<td align=center height="45">
			<font face="微软雅黑" size="5" color="#FFFFFF" face="微软雅黑">
				<c:choose>
					<c:when
						test="${empinfo.user.userType == 'sale' || empinfo.user.userType == 'buysale'}">
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