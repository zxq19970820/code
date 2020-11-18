<%@ page import="test.User_copy" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/4
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    //访问购物车之前，先看是否为登录状态（状态值通常出门在session中)
    User_copy u = (User_copy) session.getAttribute("user");

    if (u==null){

        //如果当前登录用户是空，证明没有登录过，跳转到登录界面
        response.sendRedirect("dengLu.jsp");
    }
%>

<table width="1000px">


    <tr>
        <td>图片</td>
        <td>名称</td>
        <td>数量</td>
        <td>总价</td>
    </tr>



    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>



    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>



    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>


</table>


</body>
</html>
