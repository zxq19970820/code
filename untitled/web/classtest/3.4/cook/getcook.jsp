<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/4
  Time: 15:21
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
    for (Cookie c : cookies) {


    if("name".equals(c.getName())){

        out.print(c.getValue());
    }


    }
%>

</body>
</html>
