<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/6
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table width="1000px" border="1" cellspacing="0">
    <tr>

        <td>商品号</td>
        <td>商品名</td>
        <td>图片</td>
        <td>商品详情</td>
        <td>价格</td>
        <td>数量</td>

    </tr>
    <c:forEach items="${products}" var="product">

        <tr>
            <td>${product.pid}</td>
            <td>${product.pname}</td>
            <td>${product.pic}</td>
            <td>${product.details}</td>
            <td>${product.price}</td>
            <td>${product.count}</td>
        </tr>

    </c:forEach>


</table>

</body>
</html>
