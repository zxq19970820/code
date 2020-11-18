<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/4
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //cookie存储在客户端的信息文件
    Cookie cookie=new Cookie("name","张三");

    //设置时间
    cookie.setMaxAge(60*60*24);

    response.addCookie(cookie);

%>

</body>
</html>
