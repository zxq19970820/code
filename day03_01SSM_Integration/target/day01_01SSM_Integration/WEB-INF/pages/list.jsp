<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 18378
  Date: 2020/4/17
  Time: 0:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List.jsp</h1><br>
<c:forEach items="${list}" var="account">
    <h2>${account.name}</h2>
    <h2>${account.money}</h2>
    <br>
</c:forEach>
</body>
</html>
