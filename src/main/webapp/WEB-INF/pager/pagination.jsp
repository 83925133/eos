<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/common/taglibs.jsp" %>
<div class="pagination">
    <!-- <spring:message code="msg.button.submit"/>地址 -->
    <c:set var="url" value="${param.url}"/>
    <c:set var="searchParams" value="${param.searchParams}"/>
    <%--<c:out value="${searchParams}"/>--%>
    <!-- 选择每页数量时<spring:message code="msg.button.submit"/> -->
    <form id="pagerForm" method="get" action="${url}?${searchParams}">
        <input type="hidden" name="numPerPage" id="numPerPageId" value=""/>
        <%--<input type="hidden" name="searchParams" id="searchParams" value="${searchParams}"/>--%>
    </form>
    <ul>
        <li class="disabled"><span>每页显示</span></li>
        <li class="disabled">
            <div style="float: left">
                <select name="numPerPage" id="numPerPage" onchange="numPerPageSelect();" style="width: 55px">
                    <c:forEach begin="10" end="30" step="5" varStatus="s">
                        <option value="${s.index}" ${page.numPerPage eq s.index ? 'selected="selected"' : ''}>${s.index}</option>
                    </c:forEach>
                </select>
            </div>
        </li>
        <li class="disabled"><span>共${page.totalPage}页 / ${page.totalCount}条</span></li>
    </ul>
    <ul class="pull-right">
        <!-- 分页首页按钮 -->
        <c:choose>
            <c:when test="${page.pageNum le 1}">
                <li class="disabled"><span>首页</span></li>
            </c:when>
            <c:otherwise>
                <%--<li><a href="${url}?pageNum=1&numPerPage=${page.numPerPage}&searchParams=${searchParams}">首页</a></li>--%>
                <li><a href="${url}?pageNum=1&numPerPage=${page.numPerPage}&${searchParams}">首页</a></li>
            </c:otherwise>
        </c:choose>

        <!-- 前一页按钮 -->
        <c:choose>
            <c:when test="${page.pageNum <= 1}">
                <li class="disabled"><span>前一页</span></li>
            </c:when>
            <c:otherwise>
                <%--<li><a href="${url}?pageNum=${page.pageNum - 1}&numPerPage=${page.numPerPage}&searchParams=${searchParams}">前一页</a></li>--%>
                <li><a href="${url}?pageNum=${page.pageNum - 1}&numPerPage=${page.numPerPage}&${searchParams}">前一页</a></li>
            </c:otherwise>
        </c:choose>

        <!-- 跳转 -->
        <li>
            <div style="width: 70px; height:28px;float: left;border: 1px solid #ddd;border-left: none"><a
                    style="text-decoration: none;color: #999">
                第 <input type="text" id="page" autocomplete="off" value="${page.pageNum}"
                         style="margin-bottom: 1px; margin-top: 1px; width: 18px; height: 16px;">页
            </a></div>
        </li>
        <li><a id="skip" href="#" onclick="skipPage();">转到</a></li>

        <!-- 下一页按钮 -->
        <c:choose>
            <c:when test="${page.pageNum >= page.totalPage}">
                <li class="disabled"><span>下一页</span></li>
            </c:when>
            <c:otherwise>
                <%--<li><a href="${url}?pageNum=${page.pageNum + 1}&numPerPage=${page.numPerPage}&searchParams=${searchParams}">下一页</a></li>--%>
                <li><a href="${url}?pageNum=${page.pageNum + 1}&numPerPage=${page.numPerPage}&${searchParams}">下一页</a></li>
            </c:otherwise>
        </c:choose>
        <!-- 分页尾页按钮 -->

        <c:choose>
            <c:when test="${page.pageNum >= page.totalPage}">
                <li class="disabled"><span>尾页</span></li>
            </c:when>
            <c:otherwise>
                <%--<li><a href="${url}?pageNum=${page.totalPage}&numPerPage=${page.numPerPage}&searchParams=${searchParams}">尾页</a></li>--%>
                <li><a href="${url}?pageNum=${page.totalPage}&numPerPage=${page.numPerPage}&${searchParams}">尾页</a></li>
            </c:otherwise>
        </c:choose>
    </ul>

</div>
<script type="text/javascript">
    function skipPage() {
        var number = $("#page").val().trim();
        <%--$("#skip").attr('href', '${url}?pageNum=' + number + '&numPerPage=${page.numPerPage}&searchParams=${searchParams}');--%>
        $("#skip").attr('href', '${url}?pageNum=' + number + '&numPerPage=${page.numPerPage}&${searchParams}');
        $("#skip").click();
    }
    function numPerPageSelect() {
        var num = $("#numPerPage").val();
        location.href = "${url}?numPerPage=" + num + "&${searchParams}";
        /*        $("#numPerPageId").val(num);
         $("#pagerForm").submit();*/
    }
</script>

