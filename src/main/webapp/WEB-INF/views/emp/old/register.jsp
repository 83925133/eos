<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>

<html>
<head>
    <title>新增用户</title>

    <script>
        $(document).ready(function () {
            //聚焦第一个输入框
            $("#loginName").focus();
            //为inputForm注册validate函数
            $("#inputForm").validate({
                rules: {
                    loginName: {
                        required: true,
                        rangelength: [4, 30],
                        remote: "${ctx}/operator/checkLoginName"
                    },
                    plainPassword: {required: true, rangelength: [4, 30]},
                    confirmPassword: {required: true, rangelength: [4, 30]},
                    realName: {required: true, rangelength: [2, 30]},
                    mobilePhone: {required: true, rangelength: [4, 30]}
                },
                messages: {
                    loginName: {
                        remote: "<spring:message code="msg.operator.login.name.exist"/>"
                    }
                }
            });
        });

        window.onload = function () {
            var select = document.getElementById('roleId');
            select.onchange = function () {
                if ($("#roleId").val() == 3) {
                    document.getElementById("agentIdDiv").style.display = "";
                } else {
                    $("#agentId").get(0).selectedIndex = 0;
                    document.getElementById("agentIdDiv").style.display = "none";
                }
            }
        }
    </script>
</head>

<body>
<form id="inputForm" action="${ctx}/operator/add" method="post" class="form-horizontal">
    <fieldset>
        <legend>
            <small>用户注册</small>
        </legend>
        <div class="control-group">
            <label for="loginName" class="control-label">登录名:</label>

            <div class="controls">
                <input type="text" id="loginName" name="loginName" class="input-large required"/>
            </div>
        </div>
        <div class="control-group">
            <label for="plainPassword" class="control-label">密码:</label>

            <div class="controls">
                <input type="password" id="plainPassword" name="plainPassword" class="input-large required"/>
            </div>
        </div>
        <div class="control-group">
            <label for="confirmPassword" class="control-label">确认密码:</label>

            <div class="controls">
                <input type="password" id="confirmPassword" name="confirmPassword" class="input-large required"
                       equalTo="#plainPassword"/>
            </div>
        </div>
        <div class="control-group">
            <label for="realName" class="control-label">真实姓名:</label>

            <div class="controls">
                <input type="text" id="realName" name="realName" class="input-large required"/>
            </div>
        </div>
        <div class="control-group">
            <label for="mobilePhone" class="control-label">联系号码:</label>

            <div class="controls">
                <input type="text" id="mobilePhone" name="mobilePhone" class="input-large required"/>
            </div>
        </div>
        <div class="control-group">
            <label for="roleId" class="control-label">角色:</label>

            <div class="controls">
                <select name="roleId" id="roleId" class="input-large required">
                    <%--<option value="1"><spring:message code="msg.role.name.1"/></option>--%>
                    <option value="2"><spring:message code="msg.role.name.2"/></option>
                    <option value="3"><spring:message code="msg.role.name.3"/></option>
                    <option value="4"><spring:message code="msg.role.name.4"/></option>
                </select>
            </div>
        </div>
        <div class="control-group" id="agentIdDiv" style="display: none;">
            <label for="agentId" class="control-label">门店编码:</label>

            <div class="controls">
                <select name="agentId" id="agentId" class="input-large required">
                    <option value="0" selected>门店编码列表</option>
                    <c:forEach items="${dataList}" var="data">
                        <option value="${data.id}">${data.agentNo}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-actions">
            <input id="submit_btn" class="btn btn-primary" type="submit"
                   value="<spring:message code="msg.button.submit"/>"/>
            <%--<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>--%>
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
