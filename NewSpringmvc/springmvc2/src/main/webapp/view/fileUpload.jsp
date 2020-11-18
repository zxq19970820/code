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


${msg}

<form action="${pageContext.request.contextPath}/file/upload"
      method="post" enctype="multipart/form-data">
    <input type="text" name="name" id="name"/><br>
    <input type="file" name="file" id="file" onchange="show(this)"><br>
    <input type="submit" value="上传"><br>

</form>

<script>
    function show(source) {

        //将图片的路径分割成数组
        alert( $(source).val());
        var arrs = $(source).val().split("\\");
        //取出图片的名称，设置给name输入框
        var fileName = arrs[arrs.length - 1];

        alert(fileName);

        $("#name").val(fileName);
    }
</script>


</body>
</html>