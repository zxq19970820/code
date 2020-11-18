<%@ page import="test.User_copy" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/4
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Cookie[] cookies = request.getCookies();
    String name = null;
    String pwd = null;

    //取出相应cookies值
    for (Cookie c : cookies) {
        if ("name".equals(c.getName())) {
            name = c.getValue();
        }
        if ("pwd".equals(c.getName())) {
            pwd = c.getValue();
        }
    }

    //先判断用户名和密码是否有值
    if (name != null && pwd != null) {
        if ("张三".equals(name) && "123".equals(pwd)) {

            //在登录成功时，将信息封装成对象，
            User_copy u = new User_copy(1, "张三", "123", 30);

            //存储到当前对话中
            session.setAttribute("user", u);

        }
    }

%>

<a href="car.jsp">购物车</a>
<a href="dengLu.jsp">登录</a>
<a href="#">注册</a>

</body>
</html>
