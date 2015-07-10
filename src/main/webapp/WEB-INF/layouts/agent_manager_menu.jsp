<%@ page language="java" pageEncoding="UTF-8" %>
<head>
    <script>
//        $(document).ready(function () {
//            $("#agent_balance").html("/agent/manager/querybalance");
////            $(this).attr("agent_balance", "当前额度：" + new Date());
//            return false;
//        });
        $(document).ready(function () {
            $.ajax({
                type: "post",   //访问WebService使用Post方式请求
                contentType: "application/json;charset=gbk", //WebService 会返回Json类型
                url: "/agent/manager/balance", //调用WebService的地址和方法名称组合 ---- WsURL/方法名
                data: "{}",         //这里是要传递的参数，格式为 data: "{paraName:paraValue}",下面将会看到
                dataType: 'text',
                success: function (result) {     //回调函数，result，返回值
//                    alert(result);
                    $("#agent_balance").html("<font color=red size=3>"+ result +"</font>");

                }
            });
        });
    </script>
</head>
<%--<table>--%>
    <%--<tr>--%>
        <%--<td width="80%">--%>
        <%--</td>--%>
        <%--<td id="agent_balance" name="agent_balance"></td>--%>
    <%--</tr>--%>
<%--</table>--%>
<div>
    <p class='text-right'id="agent_balance"> </p>
</div>
<div class="navbar">
    <div class="navbar-inner">
        <div class="container">
            <ul class="nav nav-pills">
                <li><a id="account-tab" href="${ctx}/agent/manager/info/"><spring:message code="msg.agent.info"/></a></li>
                <li><a id="opencard-tab" href="${ctx}/agent/manager/card/open/"><spring:message code="msg.memu.manager.agent.card.open"/></a></li>
                <li><a id="recharge-tab" href="${ctx}/agent/manager/card/recharge/"><spring:message code="msg.memu.manager.agent.card.recharge"/></a></li>
                <li><a id="withdraw-tab" href="${ctx}/agent/manager/card/withdraw/"><spring:message code="msg.memu.manager.agent.card.withdraw"/></a></li>
                <li><a id="returncard-tab" href="${ctx}/agent/manager/card/callback"><spring:message code="msg.memu.manager.agent.card.callback"/></a></li>
                <li><a id="card-balance-list-tab" href="${ctx}/agent/manager/card/balance"><spring:message code="msg.query.card.balance"/></a></li>
                <li><a id="operatelist-tab" href="${ctx}/agent/manager/operate/list"><spring:message code="msg.memu.manager.agent.card.operate.list"/></a></li>
                <li><a id="report-list-tab3" href="${ctx}/agent/manager/report/agent_trade_list"><spring:message code="msg.memu.manager.report.agent_agenttradelist"/></a></li>
                <li><a id="report-list-tab4" href="${ctx}/agent/manager/report/agent_terminal_list"><spring:message code="msg.memu.manager.report.terminal.day.list"/></a></li>

            </ul>
        </div>
    </div>
</div>
