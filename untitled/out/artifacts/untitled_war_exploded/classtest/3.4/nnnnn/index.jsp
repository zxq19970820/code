<%--
  Created by IntelliJ IDEA.
  User: 18378
  Date: 2020/3/4
  Time: 14:32
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
    String userName = request.getParameter("userName");
%>
<a href="
<%
        if (userName == null) {
            out.print("login.jsp");
        } else {
            out.print("#");
        }
    %>
">
    <%
        if (userName == null) {
            out.print("登录");
        } else {
            out.print(userName+"的购物车");
        }
    %>
</a>
<%
    session.setAttribute("userName",userName);
%>
<br>
<a href="list.jsp">购物车</a>

</body>
</html>
