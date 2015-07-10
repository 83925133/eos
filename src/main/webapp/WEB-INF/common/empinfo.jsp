<%@ page language="java" pageEncoding="UTF-8"%>
<input type=hidden name="paytypeok" value=""> 
<input type=hidden name="itemok" value="">
<input type=hidden name="itemdescok" value="">
<input type=hidden name="urlstr" value=""> 
<input type=hidden name="url" value="/userdat/start/index.asp">
<%-- 会员名编号：公司编号(或个人编号)--%>
<input type="hidden" name="uno" value="${empinfo.uno }"></input>
<%-- 会员名称：公司名称或个人名称 --%>
<input type="hidden" name="name" value="${empinfo.user.name }"></input>
<%-- 会员类型：如：sale --%>
<input type=hidden name="utype" value="${empinfo.user.userType }"></input>
<%-- 员工id --%>
<input type="hidden" name="eid" value="${empinfo.id }"></input>
<%-- 员工登陆名称 --%>
<input type="hidden" name="eno" value="${empinfo.eno }"></input>
<%-- 员工名称 --%>
<input type="hidden" name="ename" value="${empinfo.ename }"></input>
<%-- 其它 start --%>
<input type=hidden name="etel" value="${empinfo.tel }"> 
<input type=hidden name="emob" value="${empinfo.mob }">
<input type=hidden name="role" value="${empinfo.role }">
<input type=hidden name="topic" value="${empinfo.user.name }订货平台 ">
<%-- 其它 end --%>

