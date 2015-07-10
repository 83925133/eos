<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>



<html>
<head>
    <title><spring:message code="msg.operator.update.pwd"/></title>
    <script>
        $(document).ready(function () {
            $("#inputForm").validate({
                rules: {
                    oldPwd: {required: true,  rangelength: [4, 30]},
                    newPwd: {required: true,  rangelength: [4, 40]}
                }
            });
        });
    </script>
</head>

<body>
<%--<c:if test="${not empty message}">
     <div id="message" class="alert alert-success" style="clear: both;">
          <button data-dismiss="alert" class="close">×</button>
              ${message}
      </div>
</c:if>--%>

<%--Just for show note.--%>
<form id="inputForm" action="${ctx}/operator/update/pwd" method="post" class="form-horizontal">
    <fieldset>
        <legend>
            <small><spring:message code="msg.operator.update.pwd"/></small>
        </legend>
        <div class="control-group">
            <label for="oldPwd" class="control-label"><spring:message code="msg.operator.update.oldpwd"/>:</label>

            <div class="controls">
                <input type="password" id="oldPwd" name="oldPwd" class="input-large"/>
            </div>
        </div>
        <div class="control-group">
            <label for="newPwd" class="control-label"><spring:message code="msg.operator.update.newpwd"/>:</label>

            <div class="controls">
                <input type="password" id="newPwd" name="newPwd" class="input-large"/>
            </div>
        </div>
        <div class="form-actions">
            <input id="submit_btn" class="btn btn-primary" type="submit" value="<spring:message code="msg.button.submit"/>"/>&nbsp;
        </div>
    </fieldset>
</form>




<c:if test="${not empty message}">
    <%--
    <c:import url="/WEB-INF/common/info.jsp"></c:import>
   --%>

    <script language="javascript" type="text/javascript" >
        /*显示提示信息  alert('<%=message%>');*/
        alert('<%=message%>');
     /*   document.getElementById('light').style.display='block';
        document.getElementById('fade').style.display='block';
        $("#msg").html('<%=message%>');
        $("#light").show();
        $("#fade").show();*/
    </script>
</c:if>
</body>

</html>
