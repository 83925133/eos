<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>

<html>
<head>
    <title><spring:message code="msg.project.name"/></title>
</head>

<body>
<%--Just for show note.--%>
<table>
    <tr>
        <td></td>
    </tr>
</table>
<c:if test="${not empty message}">
    <script language="javascript" type="text/javascript" >
        alert('<%=message%>');
    </script>
</c:if>
</body>
</html>
