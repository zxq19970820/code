<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/12
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/untitled_war_exploded/UploadServlet" method="post" enctype="multipart/form-data">

    <input name="pname" type="text" ><br>
    <input name="details " type="text"><br>
    <input name="img" type="file" ><br>
    <input type="submit"  value="点击提交"/>

</form>

<script>

    alert("添加成功");

</script>

</body>
</html>
