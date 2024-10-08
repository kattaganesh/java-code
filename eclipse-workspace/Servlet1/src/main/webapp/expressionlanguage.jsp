<html>
<body bgcolor=green text=yellow>
<h1>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fn" prefix="fn" %>
<c:set var="a" value="10"/>
<c:remove var="a"/>
<c:out value="${a }"/>
<c:if test={a>0}>
<c:out value="${a} }"/>
</c:if>
<c:choose>
<c:when test="">
<c:out value=""/>
</c:when>
</c:choose>
<c:otherwise>
</c:otherwise>
<c:forEach var="a" begin="" end="" step="">

</c:forEach>
<c:forTokens var="str" items="potharaju prashanth" delims="">
<c:out value="${str }"/>
</c:forTokens>
<c:redirect url="">
</c:redirect>


<sql:setDataSource var="con" driver=" " url="" username="" password=""/>
<sql:update   dataSource="${con } sql=""/>
<sql:query var="rs"  dataSource="${con }" sql=""/>
<c:forEach var="record" items="${rs.rows }">
<c:out value="${record.rollno}"/>
</c:forEach>
<c:set var="a" value="10/new java.util.Date()"/>
<fmt:formatDate  value="{d" datayle="shoort/long/medium" type="time/date/both" tymeStyle="short/long/medium">
</fmt:formatDate>
<c:set var="a" value="10090"/>
<fmt:formatNumber maxIntegerDigits="" maxFractionDigits="" type="currency" currencySymbol="" >
</fmt:formatNumber>

<c:set var="a" value="welcome to nareshit"/>
<c:if test="${fn:contains(a,"") }"
//fn:toLower("a")/fn:endsWith("a")/fn:startsWith(/$fn:substringAfter(a,""))/$fn:substringBefore(s,"")/$fn:substring:(s,3,4)/
//fn:slipt(s,"a")//fn:join(s,"")/fn:length(s/fn:replace(s,))

</h1>
</body>
</html>