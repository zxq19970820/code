<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/3
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<%
    String name = request.getParameter("uname");
    String pwd = request.getParameter("pwd");

    if ("zhangsan".equals(name) && "123".equals(pwd)) {

        session.setAttribute("name", name);

        response.sendRedirect("welcome.jsp");//重定向
    } else {                   //转发
        session.setAttribute("message", "用户名或密码错误");

        //重定向
//        response.sendRedirect("denglu.jsp");

        //转发
        request.getRequestDispatcher("denglu.jsp").forward(request, response);

    }

//    String sex = request.getParameter("sex");
//    String[] like = request.getParameterValues("like");
//    String str = String.join(",", like);   //将字符串按指定字符拼接
%>

用户名：<%=name%><br>
密码：<%=pwd%><br>
<%--性别：<%=sex%><br>--%>
<%--爱好：<%=str%>--%>


</body>
</html>
