<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/4
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/untitled_war_exploded/login.do"  >

    <table   width="300px" align="center">

        <tr>
            <td>用户名</td>
            <td><input type="text" name="uname"></td>
        </tr>

        <tr>
            <td>密码</td>
            <td><input type="password" name="pwd"></td>
        </tr>

        <tr>
            <td>登录</td>
            <td>
            <input type="submit" name=""  value="登录">
            </td>
        </tr>

    </table>

</form>

</body>
</html>
