<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="BootStrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="BootStrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<ul class="nav nav-tabs">
    <li role="presentation" class="active"><a href="/Jsp_war_exploded/user/IndexServlet">首页</a></li>
    <li role="presentation"><a href="/Jsp_war_exploded/user/ToCartServlet">购物车</a></li>
    <li role="presentation"><a href="/Jsp_war_exploded/myOrder.do">我的订单</a></li>
    <form action="/Jsp_war_exploded/IndexServlet" class="navbar-form navbar-left" role="search" method="get"
          style="margin-top: 3px;margin-bottom: 0px;">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="搜索商品" name="pname">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
    </form>
</ul>
<div class="jumbotron">
    <h1>选择您的付款方式</h1>
</div>
<div>
    <div>
        <img src="img/wx.jpg" width="50%">
    </div>
    <form method="post" action="/javaWeb_war_exploded/dl.do">
        <input type="submit" value="我已付款">
    </form>


</div>
</body>
</html>
