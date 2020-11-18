<%--
  Created by IntelliJ IDEA.
  User: 18378
  Date: 2020/3/4
  Time: 14:25
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
<form action="index.jsp" method="post">
    用户名：<input type="text" name="userName">
    <br>
    密码：<input type="password" name="psw">
    <br>
    <input type="submit" value="登录">
</form>

<div>
    <%
        if (session.getAttribute("msg") == null) {
            out.print("");
        } else {
            out.print(session.getAttribute("msg"));
        }
    %>
</div>
</body>
</html>
