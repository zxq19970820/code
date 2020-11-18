<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/12
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
</head>
<body>

<%--                                                                   上传文件用的--%>
<form action="/untitled_war_exploded/UploadServlet" method="post" enctype="multipart/form-data">
    <table width="1000px">
        <td>
            <tr>商品名</tr>
            <tr><input name="pname" type="text"></tr>
            <br>
        </td>


        <td>
            <tr>商品描述</tr>
            <tr><input name="details " type="text"></tr>
            <br>
        </td>


        <td>
            <tr>商品价格</tr>
            <tr><input name="price" type="text"></tr>
            <br>
        </td>


        <td>
            <tr>数量</tr>
            <tr><input name="count" type="text"></tr>
            <br>
        </td>


        <td>
            <tr>图片</tr>
            <tr><input name="img" type="file"></tr>
            <br>
        </td>


        <td>
            <tr></tr>
            <tr><input type="submit" value="点击提交"/></tr>
        </td>

    </table>


</form>

</body>
</html>
