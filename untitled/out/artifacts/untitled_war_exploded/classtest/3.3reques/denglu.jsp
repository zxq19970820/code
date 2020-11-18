<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>

    <form action="index.jsp" method="post">
        <% String str = (String) session.getAttribute("message");
            if (!(str == null)) {
                out.print(str);

                //删除message值
//                request.removeAttribute("message");
            }
        %>
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="uname"/></td>
            </tr>


            <tr>
                <td>密码</td>
                <td><input type="password" name="pwd"/></td>
            </tr>


            <tr>
                <td></td>
                <td><input type="submit" value="登录"/></td>
            </tr>
        </table>
    </form>
</ul>

</body>
</html>
