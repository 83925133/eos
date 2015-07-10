<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>

<html>
<head>
    <title>用户管理</title>
    <script>
        function confirmDeleteAction() {
            return confirm("<spring:message code="msg.delete.confirm"/> ");
        }
    </script>
</head>

<body>
<div class="pull-left">
    <form class="form-search" action="${ctx}/operator/list">
        <label>登录名：</label>
        <input type="text" name="search_LIKE_loginName" class="input-small"
               value="${param.search_LIKE_loginName}" maxlength="30">
        <label>门店编号：</label>
        <input type="text" name="search_EQ_agentNo" class="input-small" value="${param.search_EQ_agentNo}"
               maxlength="30">
        <label>角色：</label>
        <select name="search_EQ_roleId">
            <option value="" selected="selected">所有</option>
            <option value="2" <c:if test="${param.search_EQ_roleId eq 2}">selected</c:if>>
                <spring:message code="msg.role.name.2"/>
            </option>
            <option value="3" <c:if test="${param.search_EQ_roleId eq 3}">selected</c:if>>
                <spring:message code="msg.role.name.3"/>
            </option>
            <option value="4" <c:if test="${param.search_EQ_roleId eq 4}">selected</c:if>>
                <spring:message code="msg.role.name.4"/>
            </option>
        </select>
        <button type="submit" class="btn btn-primary" id="search_btn"><spring:message code="msg.button.query"/></button>
    </form>
</div>
<table id="contentTable" class="table table-striped table-bordered table-condensed">
    <thead>
    <tr>
        <th>登录名</th>
        <th>真实姓名</th>
        <th>联系号码</th>
        <th>角色</th>
        <th>门店编码</th>
        <th>注册时间</th>
        <th>管理</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users.content}" var="operator">
        <tr>
            <td><a href="${ctx}/operator/update/${operator.id}">${operator.loginName}</a></td>
            <td>${operator.realName}</td>
            <td>${operator.mobilePhone}</td>
            <td><spring:message code="msg.role.name.${operator.roleId}"/></td>
            <td>${operator.agentNo}</td>
            <td>
                <fmt:formatDate value="${operator.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
            </td>
            <td>
                <shiro:hasRole name="ROLE_admin">
                <c:if test="${operator.id ne '1'}">
                <a href="${ctx}/operator/delete/${operator.id}" onclick="return confirmDeleteAction()">删除</a>
                </c:if>
                </shiro:hasRole>
            <td>
                <shiro:hasRole name="ROLE_admin">
                    <a href="${ctx}/operator/update/${operator.id}" id="editLink-${operator.loginName}">修改</a>
                </shiro:hasRole>
            </td>
        </tr>
    </c:forEach>
    <%--<tr>--%>
    <%--<td colspan="6">--%>
    <%--<c:import url="/WEB-INF/pager/pagination.jsp">--%>
    <%--<c:param name="url" value="${ctx}/operator/list"/>--%>
    <%--</c:import>--%>
    <%--</td>--%>
    <%--</tr>--%>
    </tbody>
</table>
<tags:pagination page="${users}" paginationSize="10"/>
<c:if test="${not empty message}">
    <script language="javascript" type="text/javascript" >
        alert('<%=message%>');
    </script>
</c:if>
</body>
</html>
