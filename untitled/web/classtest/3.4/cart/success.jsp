<%@ page import="test.User_copy" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/4
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%
    //获取当前访问量从application对象取
    Integer count = (Integer) application.getAttribute("count");

<%--    if (count == null) {--%>
<%--        count = 1;--%>

<%--    } else {--%>
<%--        //取出当前访问量，累加1--%>
<%--        count++;--%>
<%--    }--%>
<%--    //重新存储count--%>
<%--    application.setAttribute("count", count);--%>
<%--%>--%>

<%
    User_copy u = (User_copy) session.getAttribute("user");
%>

<a>登录成功，欢迎您：</a>
<%=u.getUsername()%><br>
<a>您是第</a> <%=count%>个访问本网站的用户<br>

<a href="index.jsp">返回首页</a>

</body>
</html>
