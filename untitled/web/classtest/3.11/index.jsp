<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/13
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<%--<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>--%>
<head>
    <%--<base href="<%=basePath%>">--%>

    <title>Title</title>

        <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%--    <link href="css/bootstrap.css" type="text/css" rel="stylesheet">--%>
<%--    <script src="js/jquery-3.3.1.js" type="text/javascript"></script>--%>
<%--    <script src="js/bootstrap.js" type="text/javascript"></script>--%>

</head>
<body>

<%

    //如果访问主页时没有去servlet获取商品信息，跳转到servlet中去获取数据
    if (request.getAttribute("list") == null) {
        request.getRequestDispatcher("/indexServlet").forward(request, response);
    }

%>


<%--                                    一                                       --%>
<div style="height: 200px;  border:1px black solid ">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Brand</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                    <li><a href="#">Link</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Dropdown <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                </ul>
                <%--                修改1                  --%>
                <form class="navbar-form navbar-left" action="/untitled_war_exploded/indexServlet" method="get">
                    <div class="form-group">
                        <input type="text" name="pname" class="form-control" placeholder="请输入商品名称">
                    </div>
                    <button type="submit" class="btn btn-default">搜索</button>
                </form>
                <ul class="nav navbar-nav navbar-right">

                    <li><a href="/untitled_war_exploded/user/toCart">购物车</a></li>

                    <c:choose>
                        <c:when test="${user==null}">
                            <li><a href="regist.jsp">注册</a></li>
                            <li><a href="dengLu.jsp">登录</a></li>
                        </c:when>

                        <c:otherwise>
                            <li><a>欢迎！</a></li>
                            <li><a href="#" style="color:blue">${user.userName}</a></li>
                            <li><a href="#">注销</a></li>
                        </c:otherwise>

                    </c:choose>

                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>


<%--。。。。。。。。。。。。。。。二。。。。。。。。。。。。。。。。。。。--%>

<div style="border: 1px black solid">
    <div class="row">
        <%--        ------------------------------------------------------------%>
        <%--        循环显示商品--%>
        <c:forEach items="${list}" var="p">
            <div class="col-sm-3 col-md-3">
                <div class="thumbnail">

                    <a href="/untitled_war_exploded/GetProductServlet?pid=${p.pid}">
                        <img src="/untitled_war_exploded/classtest/3.11/${p.image}" alt="${p.image}">
                    </a>

                    <div class="caption" style="text-align: center">
                        <h3>${p.pname}</h3>
                        <p>￥${p.price}</p>
                        <p><a href="/untitled_war_exploded/user/AddCartServlet?pid=${p.pid}" class="btn btn-primary" role="button">加入购物车</a></p>
                    </div>
                </div>
            </div>
        </c:forEach>
        <%--        -------------------------------------------------------------%>
    </div>
</div>


<%-----------------三--------------------------------------%>

<div style="height: 200px;border: 1px black solid"></div>


</body>
</html>
