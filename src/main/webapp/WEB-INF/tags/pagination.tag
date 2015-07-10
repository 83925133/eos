<%@tag pageEncoding="UTF-8"%>
<%@ attribute name="page" type="org.springframework.data.domain.Page" required="true"%>
<%@ attribute name="paginationSize" type="java.lang.Integer" required="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
int current =  page.getNumber() + 1;
int begin = Math.max(1, current - paginationSize/2);
int end = Math.min(begin + (paginationSize - 1), page.getTotalPages());

request.setAttribute("current", current);
request.setAttribute("begin", begin);
request.setAttribute("end", end);
request.setAttribute("totalPage", page.getTotalPages());
request.setAttribute("totalCount", page.getTotalElements());
%>

<div class="pagination">
	<ul>
		 <% if (page.hasPreviousPage()){%>
               	<li><a href="?pageNum=1&orderField=${orderField}&${searchParams}">&lt;&lt;</a></li>
                <li><a href="?pageNum=${current-1}&orderField=${orderField}&${searchParams}">&lt;</a></li>
         <%}else{%>
                <li class="disabled"><a href="#">&lt;&lt;</a></li>
                <li class="disabled"><a href="#">&lt;</a></li>
         <%} %>
 
		<c:forEach var="i" begin="${begin}" end="${end}">
            <c:choose>
                <c:when test="${i == current}">
                    <li class="active"><a href="?pageNum=${i}&orderField=${orderField}&${searchParams}">${i}</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="?pageNum=${i}&orderField=${orderField}&${searchParams}">${i}</a></li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
	  
	  	 <% if (page.hasNextPage()){%>
               	<li><a href="?pageNum=${current+1}&orderField=${orderField}&${searchParams}">&gt;</a></li>
                <li><a href="?pageNum=${page.totalPages}&orderField=${orderField}&${searchParams}">&gt;&gt;</a></li>
         <%}else{%>
                <li class="disabled"><a href="#">&gt;</a></li>
                <li class="disabled"><a href="#">&gt;&gt;</a></li>
         <%} %>
        <li class="disabled"><span>共${totalPage}页 / ${totalCount}条</span></li>
	</ul>
</div>

