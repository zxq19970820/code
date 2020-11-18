<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/4/20
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改产品</title>
</head>
<body>


<form method="post" action="../product/updateProduct">
    <input type="hidden" name="id" placeholder="请输入id" value="${product.id}"><br>
    <input type="text" name="pname" placeholder="请输入商品名" value="${product.pname}"><br>
    <input type="text" name="pinventory" placeholder="请输入库存" value="${product.pprice}"><br>
    <input type="text" name="pprice" placeholder="请输入价格" value="${product.pinventory}"><br>
    <input type="text" name="picon" placeholder="请输入图片名字" value="${product.picon}"><br>
    <input type="text" name="plocation" placeholder="请输入图片产地" value="${product.plocation}"><br>
    <input type="text" name="pviews" placeholder="请输入图片访问量" value="${product.pviews}"><br>
    <input type="text" name="pstate" placeholder="请输入发布状态" value="${product.state}"><br>

    <input type="submit" value="修改">
</form>
</body>
</html>
