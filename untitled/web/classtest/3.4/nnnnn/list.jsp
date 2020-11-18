
<%--
  Created by IntelliJ IDEA.
  User: 18378
  Date: 2020/3/4
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
%>
    <%
        String user = (String) session.getAttribute("userName");
        if(user == null) {
            session.setAttribute("msg","您还没有登录请登录");
            response.sendRedirect("login.jsp");
        }
    %>
    <ul>
        <li>商品</li>
        <li>商品</li>
        <li>商品</li>
    </ul>
</body>
</html>
