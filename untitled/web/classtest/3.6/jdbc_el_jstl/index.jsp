<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/6
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

<%--将集合中数据用表格形式展示到封面   js+El--%>
<table width="1000px" border="1" cellspacing="0">

    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>电话</td>
        <td>地址</td>
        <td>余额</td>
    </tr>


    <c:forEach items="${users}" var="user">

    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.phone}</td>
        <td>${user.address}</td>
        <td>${user.balance}</td>

    </tr>
    </c:forEach>

</table>


</body>
</html>
