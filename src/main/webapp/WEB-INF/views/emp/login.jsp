<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>580订货网</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"></meta>
<meta name="keywords" content="580订货网"></meta>
<meta name="description" content="580订货网"></meta>
<link rel="stylesheet" href="<c:out value="${ctx}" />/static/css/global.css"></link>
</head>
<body id="index">
<form id="loginForm" action="<c:out value="${ctx}" />/login" method="post">
	<div id="header">
		<div class="layout main">
			<a id="logo" href="index.asp"></a>
			<div id="menu">
				<ul>
					<li><a href="#;" class="promotion" title="诚征代理"><span><b>诚征代理</b></span></a></li>
					<li><a href="#;" class="success" title="价格方案"><span><b>价格个方案</b></span></a></li>
					<li><a href="#;" class="introduction" title="产品介绍"><span><b>产品介绍</b></span></a></li>
					<li class="current"><a href="#;" class="home" title="首页"><span><b>首页</b></span></a></li>
				</ul>
			</div>
		</div>
	</div>
	<div id="index_banner">
		<div class="banner">
			<div class="slider">
				<div class="b">
					<ul class="layout">
						<a href="#;"><img src="<c:out value="${ctx}" />/static/img/banner1.jpg"
							border="0" alt="580订货网" title="580订货网"></a>
					</ul>
				</div>
				<div class="b">
					<ul class="layout">
						<a href="#;"><img src="<c:out value="${ctx}" />/static/img/banner2.jpg"
							border="0" alt="580订货网" title="580订货网"></a>
					</ul>
				</div>
				<div class="b">
					<ul class="layout">
						<a href="#;"><img src="<c:out value="${ctx}" />/static/img/banner3.jpg"
							border="0" alt="580订货网" title="580订货网"></a>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div id="index_content">
		<div class="layout main png">
			<div class="mcontent cb">
				<a href="#;" class="line1"> <b></b>
					<ul>
						<h5>订货效率高</h5>
						<li>· 受理时间短，省时省力</li>
						<li>· 全天24小时不间断订货</li>
					</ul>
				</a> <a href="#;" class="line1 b2"> <b></b>
					<ul>
						<h5>先进作业方式</h5>
						<li>· 最新一代作业方式</li>
						<li>· 全程零失误作业方式</li>
					</ul>
				</a> <a href="#;" class="line1 b3"> <b></b>
					<ul>
						<h5>订单准确率高</h5>
						<li>· 精准定位订单信息</li>
						<li>· 全天24小时不间断订货</li>
					</ul>
				</a> <a href="#;" class="b4"> <b></b>
					<ul>
						<h5>管理规范</h5>
						<li>· 规范的企业管理</li>
						<li>· 580订货网让订货更规范</li>
					</ul>
				</a> <a href="#;" class="b5"> <b></b>
					<ul>
						<h5>全流程跟踪</h5>
						<li>· 云计算技术全程可控</li>
						<li>· 24小时卫星跟踪</li>
					</ul>
				</a> <a href="#;" class="b6"> <b></b>
					<ul>
						<h5>操作方便易学易用</h5>
						<li>· WEB2.02系统，简单易用</li>
						<li>· 学习成本最低的订货系统</li>
					</ul>
				</a>
			</div>
			<ul id="login">
	           	<div class="content">
             		<div class="top">
             			<span class="title"></span>
             			<div class="msg" >
                        	<font color="red"><c:out value="${msg}" /></font>
                    	</div>
                 	</div> 
	           		<div class="c">
	                 	<ul onclick="checktip(this)" >
						<input type="text" onkeydown="usernamekeydown()" onFocus="this.select()"
							onfocus="checktip_f(this)" class="w280 fl" id="username"
							name="username" value="<c:out value="${username}" />" class="input-medium required">
							<span class="txt"><spring:message code="msg.username" /></span>
						</ul>
	                 	<ul onclick="checktip(this)">
							<input type="password" onkeydown="passwordkeydown()" onFocus="this.select()"
								onfocus="checktip_f(this)" class="w280 fl" id="password"
								name="password" class="input-medium required"> <span
								class="txt"><spring:message code="msg.password" /></span>
						</ul>
		               	<ul>
							<input type="button" value="用户登录" name="B1" onClick="dosubmit()"
								style="background: #FF850B; color: #FFFFFF; font-weight: bold">
						</ul>
	             	</div>
	               	<div class="loginbottom">
                 		<p align="right">
                 		<input name="rememberMe" type="checkbox" id="rememberMe" value="1" style="vertical-align:middle; margin-bottom:1px;" />&nbsp;记住密码
                 		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
                 		<a href="<c:out value="${ctx}" />/reg/init" target="_blank"><strong>用户注册</strong></a>
                 	</div>  
	           </div>
	       	</ul>
		</div>
		<div class="point"></div>
	</div>
</form>
<%@ include file="/WEB-INF/views/emp/footer.jsp"%>
<script type="text/javascript" src="<c:out value="${ctx}" />/static/js/jquery.js"></script>
<script type="text/javascript" src="<c:out value="${ctx}" />/static/js/home.js"></script>
<script language="javascript" for="document" event="onkeydown">
  if(event.keyCode==13 && event.srcElement.type!='button' && event.srcElement.type!='submit' && event.srcElement.type!='reset' && event.srcElement.type!='textarea' && event.srcElement.type!='')
  event.keyCode=9;
</script>
<script>
	jQuery(document).ready(function() {
		
		var username = "<c:out value="${username}" />";
		var msg = "<c:out value="${msg}" />";
		jQuery(".msg").eq(0).hide();
		if (msg != "") {
			jQuery(".msg").eq(0).show();
		}
		if (username != "") {
			jQuery(".txt").eq(0).hide();
		}
	});
     $(document).ready(function(){
		$("#captcha").attr("src", "<c:out value="${ctx}" />/Captcha.jpg?time=" + new Date());
	    $("#captcha").click(function(){
	        $(this).attr("src", "<c:out value="${ctx}" />/Captcha.jpg?time=" + new Date());
	        return false;
	    });
	});  
</script>
</body>
</html>