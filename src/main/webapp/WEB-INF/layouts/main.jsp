<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="msg.project.title" />[开发环境]<sitemesh:title/></title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>

    <link href="<c:out value="${ctx}" />/static/bootstrap/2.3.2/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="<c:out value="${ctx}" />/static/jquery-validation/1.10.0/validate.css" type="text/css" rel="stylesheet"/>
    <script src="<c:out value="${ctx}" />/static/jquery/1.8.3/jquery-1.8.3.min.js" type="text/javascript"></script>
    <script src="<c:out value="${ctx}" />/static/jquery-validation/1.10.0/jquery.validate.min.js" type="text/javascript"></script>
    <script src="<c:out value="${ctx}" />/static/jquery-validation/1.10.0/messages_bs_zh.js" type="text/javascript"></script>

    <sitemesh:head/>
</head>

<body>
    <%@ include file="/WEB-INF/layouts/header.jsp" %>
    <div class="row">
        <%-- <shiro:hasRole name="ROLE_admin">
            <%@ include file="/WEB-INF/layouts/admin_menu.jsp" %>
        </shiro:hasRole>
        <shiro:hasRole name="ROLE_service_manager">
            <%@ include file="/WEB-INF/layouts/service_manager_menu.jsp" %>
        </shiro:hasRole>
        <shiro:hasRole name="ROLE_agent_manager">
            <%@ include file="/WEB-INF/layouts/agent_manager_menu.jsp" %>
        </shiro:hasRole>
        <shiro:hasRole name="ROLE_card_manager">
            <%@ include file="/WEB-INF/layouts/card_manager_menu.jsp" %>
        </shiro:hasRole> --%>
        <div id="main">
            <sitemesh:body/>
        </div>
    </div>
    <%@ include file="/WEB-INF/layouts/footer.jsp" %>
<%--此处要放在最下面，否则IE8会报缺少对象错误--%>
<script src="<c:out value="${ctx}" />/static/bootstrap/2.3.2/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>