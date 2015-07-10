<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>

<html>
<head>
    <title>操作日志</title>

</head>

<body>
<div class="pull-left">
    <form class="form-search" action="${ctx}/operator/operate_log_list">
        <label>登录名：</label>
        <input type="text" name="search_EQ_operateName" class="input-small"
               value="${param.search_EQ_operateName}" maxlength="30">
        <button type="submit" class="btn btn-primary" id="search_btn"><spring:message code="msg.button.query"/></button>
    </form>
</div>
<table id="contentTable" class="table table-striped table-bordered table-condensed">
    <thead>
    <tr>
        <th>登录名</th>
        <th>参数详情</th>
        <th>用户描述</th>
        <th>操作员IP</th>
        <th>创建时间</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${dataList.content}" var="operator">
        <tr>
            <td>${operator.operateName}</td>
            <td>
                <c:set var="vam" value="${(fn:length(operator.argument) / 100)}"/>
                <c:forEach var="x" begin="0" end="${vam}">
                    ${fn:substring(operator.argument,100*x ,(x+1)*100)}<br>
                </c:forEach>
            </td>
                <%--<td>${operator.argument}</td>--%>
            <td>${operator.operateDesc}</td>
            <td>${operator.operateIp}</td>
            <td>
                <fmt:formatDate value="${operator.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<tags:pagination page="${dataList}" paginationSize="10"/>
<c:if test="${not empty message}">
    <script language="javascript" type="text/javascript" >
        alert('<%=message%>');
    </script>
</c:if>
</body>
</html>
