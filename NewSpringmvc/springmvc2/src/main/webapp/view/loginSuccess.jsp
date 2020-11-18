<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/14
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${user},登录成功

<a href="${pageContext.request.contextPath}/onlySuccess">只有登录成功才能访问</a>


</body>
</html>