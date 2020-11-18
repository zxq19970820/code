<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/13
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<head>
    <base href="<%=basePath%>">


    <title>Title</title>


    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>

<div style="height: 340px;border: 1px black solid   ">


    <br>
    <br>
    <br>
    <br>


    <div class="row">

        <div class="col-sm-4">
            <img src="/javaWeb_war_exploded/${pro.image}">
        </div>

        <div class="col-sm-6">
            <dl>
                <dt><h3>${pro.pname}</h3></dt>
                <dd><p>价格：${pro.price}</p></dd>
                <dd><p>库存：${pro.count}</p></dd>
                <dd><p><a href="/javaWeb_war_exploded/user/AddCartServlet?pid=${pro.pid}" class="btn-primary"
                          role="button">加入购物车</a></p></dd>
            </dl>
        </div>


    </div>
</div>

<div>
    ${pro.details}

</div>


</body>
</html>
