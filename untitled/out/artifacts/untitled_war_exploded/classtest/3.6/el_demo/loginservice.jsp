<%@ page import="test.User_copy" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/6
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<%--%>
<%--    String name=request.getParameter("username")--%>

<%--%>--%>


<%application.setAttribute("msg","application");%>
<%session.setAttribute("msg","session");%>


${param.username}<br>
${param.pwd}<br>
${applicationScope.msg}

${"--------分割线-------"}<br>

<%--请求头--%>
${header.accept}<br>
${headervalues.cookie[0]}<br>
${cookie.JSESSIONID.value}<br>

${"--------分割线-------"}


<%
    User_copy u=new User_copy(1,"张三","123",26);
    session.setAttribute("user",u);
%>

${user.getUsername()}<br>
${user.username}



</body>
</html>
