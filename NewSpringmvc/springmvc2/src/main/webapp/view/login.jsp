<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/14
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.min.js"></script>

</head>
<body>
<form id="loginForm" method="post" action="${pageContext.request.contextPath}/login">
    <input type="text" id="username" name="username" placeholder="请输入用户名"><br>
    <input type="text" id="password" name="password" placeholder="请输入密码"><br>
    <input type="submit"  value="登录"></input>
    <%--    <input type="button" onclick="loginClick()" value="登录"></input>--%>

</form>

<a href="${pageContext.request.contextPath}/onlySuccess">只有登录成功才能访问</a>

<script>
    function loginClick() {
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/login",
            data: $("#loginForm").serialize(),
            dataType: "json",
            // contentType: "application/json",
            success: function (data) {

            },
            error: function () {
                alert("异常，请检查");
            }

        })
    }

</script>

</body>
</html>

