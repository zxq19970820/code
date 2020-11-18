<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/9
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="/untitled_war_exploded/register.do"  method="post">
    <table align="center"  width="500px"  cellspacing="0">
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="uname"></td>
        </tr>

        <tr>
            <td>密码:</td>
            <td><input type="password"  name="pwd"></td>
        </tr>


        <tr>
            <td>电话:</td>
            <td><input type="text"  name="phone"></td>
        </tr>


        <tr>
            <td>地址:</td>
            <td><input type="text"  name="address"></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit"   value="注册" ></td>
        </tr>
    </table>

</form>

</body>
</html>
