<%@ page language="java" pageEncoding="UTF-8" %>
<div class="navbar">
    <div class="navbar-inner">
        <div class="container">
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <spring:message code="msg.memu.manager.agent"/>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a id="agent-list-tab" href="${ctx}/agent/list"><spring:message code="msg.memu.manager.agent.list"/></a></li>
                    <li><a id="agent-add-tab" href="${ctx}/agent/add"><spring:message code="msg.memu.manager.agent.add"/></a></li>
                    <li><a id="agent-upload-tab" href="${ctx}/agent/upload"><spring:message code="msg.memu.manager.agent.upload"/></a></li>
                    <li><a id="agent-export-tab" href="${ctx}/agent/export"><spring:message code="msg.memu.manager.agent.export"/></a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <spring:message code="msg.memu.manager.terminal"/>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a id="terminal-list-tab" href="${ctx}/terminal/list"><spring:message code="msg.memu.manager.terminal.list"/></a></li>
                    <li><a id="terminal-add-tab" href="${ctx}/terminal/add"><spring:message code="msg.memu.manager.terminal.add"/></a></li>
                    <li><a id="terminal-upload-tab" href="${ctx}/terminal/upload"><spring:message code="msg.memu.manager.terminal.upload"/></a></li>
                    <li><a id="terminal-upload-terminal-stop-tab" href="${ctx}/terminal/upload/stop"><spring:message code="msg.memu.manager.terminal.upload.stop"/></a></li>
                    <li><a id="terminal-upload-agent-tab" href="${ctx}/terminal/upload/agent/stop"><spring:message code="msg.memu.manager.terminal.upload.agent.stop"/></a></li>
                    <li><a id="terminal-upload-terminal-return-tab" href="${ctx}/terminal/upload/return"><spring:message code="msg.memu.manager.terminal.upload.return"/></a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <spring:message code="msg.memu.manager.period"/>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a id="period-list-tab" href="${ctx}/period/list"><spring:message code="msg.memu.manager.period.list"/></a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <spring:message code="msg.memu.manager.news"/>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a id="news-list-tab" href="${ctx}/news/list"><spring:message code="msg.memu.manager.news.list"/></a></li>
                    <li><a id="news-add-tab" href="${ctx}/news/add"><spring:message code="msg.memu.manager.news.add"/></a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <spring:message code="msg.memu.manager.report"/>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a id="report-list-tab2" href="${ctx}/report/dayreport/lotteryplay_list"><spring:message code="msg.memu.manager.report.lotterylist"/></a></li>
                    <li><a id="report-list-tab3" href="${ctx}/report/dayreport/trade_list"><spring:message code="msg.memu.manager.report.agenttradelist"/></a></li>
                    <li><a id="report-list-tab4" href="${ctx}/report/dayreport/terminal_list"><spring:message code="msg.memu.manager.report.terminal.day.list"/></a></li>
                    <li><a id="reportarea-list-tab" href="${ctx}/report/dayreport/area_list"><spring:message code="msg.memu.manager.report.area.time.range.list"/></a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <spring:message code="msg.memu.manager.check.report"/>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a id="report-list-tab" href="${ctx}/report/totalcheck/list"><spring:message code="msg.memu.manager.report.totalcheck"/></a></li>
                    <li><a id="report-list-balance_error" href="${ctx}/report/balance_error/list"><spring:message code="msg.memu.manager.report.balance.error.record.list"/></a></li>
                    <li><a id="list-trade_error" href="${ctx}/betsystem_trade/error_list"><spring:message code="msg.memu.manager.trade.error.record.list"/></a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <spring:message code="msg.memu.manager.query"/>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a id="agent-operate-list-tab" href="${ctx}/query/agent/operate/list"><spring:message code="msg.query.agent.operate.record"/></a></li>
                    <li><a id="agent-bet-list-tab" href="${ctx}/query/bet_record/list"><spring:message code="msg.query.bet.record"/></a></li>
                    <li><a id="agent-winner-list-tab" href="${ctx}/query/winner_record/list"><spring:message code="msg.query.winner.record"/></a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <spring:message code="msg.betcardinfo.manager"/>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a id="card-balance-list-tab" href="${ctx}/query/card/balance"><spring:message code="msg.query.card.balance"/></a></li>
                    <li><a id="agent-balance-list-tab" href="${ctx}/query/agent/balance"><spring:message code="msg.query.agent.balance"/></a></li>
                    <li><a id="betcardinfo_list" href="${ctx}/query/hasbalance/card/list"><spring:message code="msg.betcardinfo.has.balance.list"/></a></li>
                </ul>
            </div>
        </div>
    </div>
</div>