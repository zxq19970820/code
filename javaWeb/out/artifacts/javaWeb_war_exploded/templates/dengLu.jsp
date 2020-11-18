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

    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Title</title>


    <link rel="stylesheet" href="/javaWeb_war_exploded/css/main.css">


</head>


<body class="bgi">

<div>
    <div id="table1">
        <form method="post" action="../Login">

            <table>

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
                        <input type="submit" name="" value="登录">
                    </td>
                </tr>

            </table>

        </form>
    </div>

    <div style="color: red">
        ${msg}
    </div>

</div>
</body>
</html>
