<%@ page language="java" pageEncoding="UTF-8" %>
<div class="navbar">
    <div class="navbar-inner">
        <div class="container">
            <ul class="nav nav-pills">
                <li><a href="${ctx}/operator/list">用户列表</a></li>
                <li><a href="${ctx}/operator/add">新增用户</a></li>
                <li><a href="${ctx}/operator/operate_log_list">操作日志</a></li>
                <li><a id="card-trade-list-tab" href="${ctx}/operator/query/card/trade/list"><spring:message code="msg.memu.manager.query.trade.card"/></a></li>
            </ul>
        </div>
    </div>
</div>