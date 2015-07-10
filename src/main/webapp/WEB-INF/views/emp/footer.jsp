<%@ page import="java.util.Calendar"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<div id="footer">
	<div class="layout">
		<img src="<c:out value="${ctx}" />/static/img/logo2.gif" class="fl mt25" />
		<div class="fr mt25" align="right">
			<font face="微软雅黑" color="#808080"> <a target="_blank"
				style="color: #FFFFFF" href="http://www.miitbeian.gov.cn/">粤ICP备14007086号-1</a>&nbsp;&nbsp;Email：service@sz-whale.com
			</font>&nbsp;&nbsp;<a target="_blank" style="color: #FFFFFF"
				href="http://wpa.qq.com/msgrd?v=3&uin=1693259721&site=qq&menu=yes">在线客服</a>
			<script type="text/javascript">
				var cnzz_protocol = (("https:" == document.location.protocol) ? " https://"
						: " http://");
				document
						.write(unescape("%3Cspan id='cnzz_stat_icon_1254788180'%3E%3C/span%3E%3Cscript src='"
								+ cnzz_protocol
								+ "s4.cnzz.com/z_stat.php%3Fid%3D1254788180%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));
			</script>

			<br> <font face="微软雅黑" color="#808080"> Copyright &copy;
				2013-<%=Calendar.getInstance().get(Calendar.YEAR)%> shenzhen whale
				information technology CO.,LTD All Rights Reserved&nbsp;&nbsp;
				深圳市唯尔信息技术有限责任公司 版权所有
			</font><br> </span>
		</div>
	</div>
</div>