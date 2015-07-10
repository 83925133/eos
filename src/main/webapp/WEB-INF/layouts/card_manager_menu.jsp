<%@ page language="java" pageEncoding="UTF-8" %>
<div class="navbar">
    <div class="navbar-inner">
        <div class="container">
            <ul class="nav nav-pills">
                <li><a id="cardstore-add-tab" href="${ctx}/card/store/add"><spring:message code="msg.cardstore.info.in"/> </a></li>
                <li><a id="cardstore-load-tab" href="${ctx}/card/store/upload"><spring:message code="msg.cardstore.info.batch.in"/></a></li>
                <li><a id="cardstore-load-update-tab" href="${ctx}/card/store/upload/update"><spring:message code="msg.cardstore.info.batch.delivery"/></a></li>
                <li><a id="cardstore-list-tab" href="${ctx}/card/store/list"><spring:message code="msg.cardstore.info.list"/></a></li>
            </ul>
        </div>
    </div>
</div>