<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/8
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table width="1000" cellspacing="0" border="1px">

    <tr>
        <td>商品号</td>
        <td>商品名</td>
        <td>图片</td>
        <td>商品详情</td>
        <td>价格</td>
        <td>数量</td>
    </tr>

    <c:forEach items="${products}" var="p">

        <tr>
            <td>${p.pid}</td>
            <td>${p.pname}</td>
            <td>${p.pic}</td>
            <td>${p.details}</td>
            <td>${p.price}</td>
            <td>${p.count}</td>

        </tr>

    </c:forEach>

</table>

</body>
</html>
