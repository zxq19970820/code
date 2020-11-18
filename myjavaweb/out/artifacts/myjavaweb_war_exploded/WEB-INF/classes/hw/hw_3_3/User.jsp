<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="test.User_copy" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/3
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@  page import="" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%
ArrayList<User_copy>  users=(ArrayList) request.getAttribute("message");
%>

<table border="1"  width="1000px"  height="400px" align="center" cellspacing="0">

    <tr>
        <td>id</td>
        <td>用户名</td>
        <td>密码</td>
        <td>年龄</td>
    </tr>



    <c:forEach items="${message}" var="m">

        <tr>

            <td>${m.id}</td>
            <td>${m.username}</td>
            <td>${m.password}</td>
            <td>${m.age}</td>

        </tr>
    </c:forEach>

<%--    <%--%>
<%--        for (User_copy user:users){--%>

<%--    %>--%>


<%--    <tr>--%>
<%--        <td><%=user.getId()%></td>--%>
<%--        <td><%=user.getUsername()%></td>--%>
<%--        <td><%=user.getPassword()%></td>--%>
<%--        <td><%=user.getAge()%></td>--%>
<%--    </tr>--%>

<%--    <%--%>
<%--        }--%>
<%--    %>--%>



</table>



</body>
</html>
