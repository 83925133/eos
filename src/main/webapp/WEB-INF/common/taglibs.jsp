<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ page import="com.whale.eos.entity.EosEmpInfo"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	request.setAttribute("basePath", basePath);
    String message=(String)request.getAttribute("message");
    
	StringBuffer file = new StringBuffer(256);
	file.append("<!-- ");
	String scheme = request.getScheme();
	file.append(scheme);
	file.append("://");
	file.append(request.getServerName());
	int iPort = request.getServerPort();
	if ((("http".equals(scheme)) && (iPort != 80))
			|| (("https".equals(scheme)) && (iPort != 443))) {
		file.append(':');
		file.append(request.getServerPort());
	}
	file.append(request.getRequestURI());
	file.append("  -->");
	String url = file.toString();
	request.setAttribute("addr_file_url", url);
	request.setAttribute("empInfo", (EosEmpInfo)request.getSession().getAttribute("empinfo"));
	request.setAttribute("menus", request.getSession().getAttribute("menus"));
%>

${addr_file_url}

<input type="hidden" name="eno" value="${empinfo.eno }"></input>
<input type="hidden" name="ename" value="${empinfo.ename }"></input>
<input type="hidden" name="uno" value="${empinfo.uno }"></input>
<input type="hidden" name="name" value="${empinfo.user.name }"></input>
<input type="hidden" name="userType" value="${empinfo.user.userType }"></input>



