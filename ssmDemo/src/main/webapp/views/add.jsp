<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/4/20
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>产品添加</title>
</head>
<body>

<%--method提交方式  action提交路径url路径--%>
<form method="post" action="../product/addProduct">
    <input type="text" name="id" placeholder="请输入id"><br>
    <input type="text" name="pname" placeholder="请输入商品名"><br>
    <input type="text" name="pinventory" placeholder="请输入库存"><br>
    <input type="text" name="pprice" placeholder="请输入价格"><br>
    <br>
    <input type="text" name="picon" placeholder="请输入图片名字"><br>
    <input type="text" name="plocation" placeholder="请输入图片产地"><br>
    <input type="text" name="pviews" placeholder="请输入图片访问量"><br>
    <select type="text" name="state">
        <option value="up">已上架</option>
        <option value="down">已下架</option>
    </select>
    <input type="submit" value="添加">


</form>

</body>
</html>
