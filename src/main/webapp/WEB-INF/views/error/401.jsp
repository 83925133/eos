<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%
    response.setStatus(200);
//alertMsg.error("用户权限不足。");
%>

<!DOCTYPE html>
<html>
<head>
    <title>401 - 用户权限不足</title>
</head>

<body>
<h2>401 - 用户权限不足.</h2>

<p><a href="/logout">返回首页</a></p>
</body>
</html>

