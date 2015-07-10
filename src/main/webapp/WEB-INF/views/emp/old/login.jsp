<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>
<%--<!DOCTYPE html>--%>
<html>
<head>
    <title>welcome</title>
    <link href="${ctx}/static/bootstrap/2.3.2/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
    <link href="${ctx}/static/styles/login.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/static/jquery-validation/1.10.0/validate.css" type="text/css" rel="stylesheet" />
    <%--<script src="${ctx}/static/bootstrap/2.3.2/js/bootstrap.min.js" type="text/javascript"></script>--%>
    <script src="${ctx}/static/jquery/1.8.3/jquery-1.8.3.min.js" type="text/javascript"></script>
    <script src="${ctx}/static/jquery-validation/1.10.0/jquery.validate.min.js" type="text/javascript"></script>
    <script src="${ctx}/static/jquery-validation/1.10.0/messages_bs_zh.js" type="text/javascript"></script>
    <script>
        $(document).ready(function () {
            $("#loginForm").validate();
        });
        jQuery(document).ready(function(){
        	$("#captcha").attr("src", "${ctx}/Captcha.jpg?time=" + new Date());
            $("#captcha").click(function(){
                $(this).attr("src", "${ctx}/Captcha.jpg?time=" + new Date());
                return false;
            });
        });
    </script>
</head>
<body>
<table width="100%" height="166" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td height="42" valign="top">
            <table width="100%" height="42" border="0" cellpadding="0" cellspacing="0" class="login_top_bg">
                <tr>
                    <td width="1%" height="21">&nbsp;</td>
                    <td height="42">&nbsp;</td>
                    <td width="17%">&nbsp;</td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td valign="top">
            <table width="100%" height="532" border="0" cellpadding="0" cellspacing="0" class="login_bg">
                <tr>
                    <td width="39%" align="right">
                        <table height="532" border="0" cellpadding="0" cellspacing="0" class="login_bg2">
                            <tr>
                                <td height="138" valign="top">
                                    <table width="89%" height="427" border="0" cellpadding="0" cellspacing="0">
                                        <tr>
                                            <td height="149">&nbsp;</td>
                                        </tr>
                                        <tr>
                                            <td height="80" align="right" valign="top">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td height="198" align="right" valign="top">
                                                <table width="100%" border="0" cellpadding="0" cellspacing="0">
                                                    <tr>
                                                        <td width="35%">&nbsp;</td>
                                                        <td height="25" colspan="2" class="left_txt"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td height="25" colspan="2" class="left_txt"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td height="25" colspan="2" class="left_txt"></td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>

                        </table>
                    </td>
                    <td width="1%">&nbsp;</td>
                    <td width="60%" valign="bottom">
                        <table width="100%" height="59" border="0" align="center" cellpadding="0" cellspacing="0">
                            <tr>
                                <td width="2%">&nbsp;</td>
                                <td width="98%" height="60"><span class="login_txt_bt">欢迎登录自助销售终端管理系统</span></td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td height="21">
                                    <table cellSpacing="0" cellPadding="0" width="100%" border="0" id="table211"
                                           height="328">
                                        <div class="error" style="color: red" id="errormsg">
                                            <%
                                                Object obj = request.getAttribute(org.apache.shiro.web.filter.authc.
                                                        FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
                                                boolean flag = false;
                                                String msg = "";
                                                if (obj != null) {
                                                    if ("org.apache.shiro.authc.UnknownAccountException".equals(obj))
                                                        msg = "未知帐号错误！";
                                                    else if ("org.apache.shiro.authc.IncorrectCredentialsException".equals(obj))
                                                        msg = "密码错误！";
                                                    else if ("com.topman.lats.util.security.shiro.IncorrectCaptchaException".equals(obj))
                                                        msg = "验证码错误！";
                                                    else if ("org.apache.shiro.authc.AuthenticationException".equals(obj))
                                                        msg = "认证失败！";
                                                    flag = !"".equals(msg);
                                                }

                                                if (flag) {
                                            %>
                                            <div class="alert alert-error input-medium controls">
                                                <button class="close" data-dismiss="alert">×</button>
                                                <%=msg%>
                                            </div>
                                            <%
                                                }
                                            %>
                                        </div>
                                        <tr>
                                            <td colspan="2" align="middle">
                                                <form id="loginForm" action="${ctx}/login" method="post">
                                                    <table cellSpacing="0" cellPadding="0" border="0" align="left">
                                                        <tr>
                                                            <td class="login_txt">用户名：&nbsp;&nbsp;
                                                            </td>
                                                            <td align="left">
                                                                <input type="text" id="username" name="username"
                                                                       value="${username}" style="margin-bottom: 0px;height: 25px"
                                                                       class="input-medium required"/>
                                                            </td>

                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <span class="login_txt">密码： &nbsp;&nbsp; </span>
                                                            </td>
                                                            <td align="left">
                                                                <input type="password" id="password" name="password" style="margin-bottom: 0px;height: 25px"
                                                                       class="input-medium required"/>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td><span class="login_txt">验证码：</span>
                                                            </td>
                                                            <td align="left">
                                                                <input type="text" name="captcha_key" id="captcha_key" style="margin-bottom: 0px;height: 25px"
                                                                       class="input-medium"/>&nbsp;
                                                                <img src="/Captcha.jpg" alt="点击刷新验证码" style="width: 85px;height: 25px" id="captcha"/>
                                                            </td>
                                                        </tr>
                                                        <%--<tr>--%>
                                                            <%--<td colspan="2" height="30"><label class="checkbox"--%>
                                                                       <%--for="rememberMe"><input--%>
                                                                    <%--type="checkbox" style="width: 30px" id="rememberMe"--%>
                                                                    <%--name="rememberMe"/>记住我</label>--%>
                                                            <%--</td>--%>
                                                        <%--</tr>--%>
                                                        <tr>
                                                            <td colspan="2">
                                                                <input id="submit_btn" class="btn btn-primary" style="margin-left:30px;width: 90px"
                                                                       type="submit"
                                                                       value="登录"/>
                                                            </td>
                                                        </tr>
                                                    </table>

                                                </form>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="433" height="164" align="right" valign="bottom"><img
                                                    src="${ctx}/static/images/login/login-wel.gif" width="242" height="138">
                                            </td>
                                            <td width="57" align="right" valign="bottom">&nbsp;</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td height="20">
            <%@ include file="/WEB-INF/layouts/footer.jsp" %>
        </td>
    </tr>
</table>
</body>
<script src="${ctx}/static/bootstrap/2.3.2/js/bootstrap.min.js" type="text/javascript"></script>
</html>