<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>

<html>
<head>
    <title>用户管理</title>

    <script>
        $(document).ready(function () {
            //聚焦第一个输入框
            $("#name").focus();
            //为inputForm注册validate函数
            $("#inputForm").validate({
                rules: {
                    plainPassword: {rangelength: [4, 30]},
                    confirmPassword: {rangelength: [4, 30]},
                    realName: {required: true, rangelength: [2, 30]},
                    mobilePhone: {required: true, rangelength: [4, 30]}
                }
            });
            $("#submit_btn").click(function () {
                <%--if ($('#roleId').val() == 3) {--%>
                    <%--var agentId = $('#agentId').val();--%>
                    <%--if (agentId == '0') {--%>
                        <%--alert('<spring:message code="msg.agent.info.agent.no.must.select"/>');--%>
                        <%--return false;--%>
                    <%--}--%>
                <%--}--%>
                $('#inputForm').submit();
            });
        });
        window.onload = function () {
            var select = document.getElementById('roleId');
            select.onchange = function () {
                if ($("#roleId").val() == 3) {
                    document.getElementById("agentIdDiv").style.display = "";
                } else {
                    $("#agentId").get(0).selectedIndex=0;
                    document.getElementById("agentIdDiv").style.display = "none";
                }
            }
        }
    </script>
</head>

<body>
<form id="inputForm" action="${ctx}/operator/update" method="post" class="form-horizontal">
    <input type="hidden" name="id" value="${user.id}"/>
    <fieldset>
        <legend>
            <small>用户管理</small>
        </legend>
        <div class="control-group">
            <label class="control-label">登录名:</label>

            <div class="controls">
                <span class="input-large uneditable-input">${user.loginName}</span>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">真实姓名:</label>

            <div class="controls">
                <input type="text" id="name" name="realName" value="${user.realName}" class="input-large required"/>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">联系号码:</label>

            <div class="controls">
                <input type="text" id="mobilePhone" name="mobilePhone" value="${user.mobilePhone}"
                       class="input-large required"/>
            </div>
        </div>
        <div class="control-group">
            <label for="plainPassword" class="control-label">密码:</label>

            <div class="controls">
                <input type="password" id="plainPassword" name="plainPassword" class="input-large"
                       placeholder="...如果不需要修改密码请保留为空"/>
            </div>
        </div>
        <div class="control-group">
            <label for="confirmPassword" class="control-label">确认密码:</label>

            <div class="controls">
                <input type="password" id="confirmPassword" name="confirmPassword" class="input-large"
                       equalTo="#plainPassword"/>
            </div>
        </div>
        <%--<div class="control-group">--%>
        <%--<label class="control-label">注册日期:</label>--%>
        <%--<div class="controls">--%>
        <%--<span class="help-inline" style="padding:5px 0px"><fmt:formatDate value="${user.createTime}" pattern="yyyy年MM月dd日  HH时mm分ss秒" /></span>--%>
        <%--</div>--%>
        <%--</div>--%>
        <div class="control-group">
            <label class="control-label">角色:</label>

            <div class="controls">
                <span class="input-large uneditable-input"><spring:message code="msg.role.name.${user.roleId}"/></span>
                <input type="hidden" name="roleId" id="roleId" value="${user.roleId}"/>
            </div>
        </div>

        <div class="control-group" id="agentIdDiv" <c:if test="${user.roleId ne 3}">style="display: none;"</c:if>>
            <label for="agentId" class="control-label">门店编码:</label>

            <div class="controls">
                <select name="agentId" id="agentId" class="input-large required">
                    <option value="0" <c:if test="${user.agentId eq '0'}">selected</c:if>>门店编码列表</option>
                    <c:forEach items="${dataList}" var="eachData">
                        <option value="${eachData.id}"
                                <c:if test="${eachData.id eq user.agentId}">selected</c:if>>${eachData.agentNo}
                        </option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-actions">
            <input id="submit_btn" class="btn btn-primary" type="button" value="<spring:message code="msg.button.submit"/>"/>&nbsp;
            <input id="cancel_btn" class="btn" type="button" value="<spring:message code="msg.button.return"/>" onclick="history.back()"/>
        </div>
    </fieldset>
</form>
<c:if test="${not empty message}">
    <script language="javascript" type="text/javascript" >
        alert('<%=message%>');
    </script>
</c:if>
</body>
</html>
