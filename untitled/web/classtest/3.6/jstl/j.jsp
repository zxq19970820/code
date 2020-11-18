<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/6
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="name" value="张三" scope="request"></c:set>
${requestScope.name}<br>

//移除
<c:remove var="name" scope="request"></c:remove>
${requestScope.name}<br>

<c:out value="100"></c:out>


<hr>


<c:if   test="${empty name}">

    <c:out value="不存在"></c:out>

</c:if >

<c:if   test="${!empty name}">

    <c:out value="存在"></c:out>

</c:if >

<hr>

<c:choose>
<%--当when执行时，下面的不执行--%>
    <c:when test="${1>2}">怎么可能1>2</c:when>
    <c:when test="${4>2}">4>2</c:when>
    <c:when test="${3>2}">3>2</c:when>
    <c:otherwise>default</c:otherwise>

</c:choose>
<hr>

<c:if test="${1>2}">怎么可能1>2</c:if>
<c:if test="${4>2}">4</c:if>
<c:if test="${3>2}">3>2</c:if>


<hr>


<c:forEach var="i" begin="0" end="10" >
    ${i}
</c:forEach>



<hr>


<c:forEach var="i" begin="0" end="10"  step="3">
    ${i}
</c:forEach>

<%--items遍历的数组或容器对象--%>
<%--var 循环使用的变量--%>
<%--begin 开始位置--%>
<%--结束位置（包含）--%>
<%--step  步长（迭代量）--%>
<%--varstatus 当前元素的状态值--%>


<hr>

<%
    String []  strs={"张三","李四","王五","赵六"};
    session.setAttribute("names",strs);
%>

<c:forEach items="${names}" var="name" varStatus="status">
    ${name}--${status.current}--${status.index}--${status.first}--${status.last}<br>
</c:forEach>




</body>
</html>
