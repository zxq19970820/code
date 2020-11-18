<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>

<a href="http://localhost:8080/springmvc1_war_exploded/requestParamTest?username=诺克萨斯">测试modelAttribute</a>


<%--时间类型转换器--%>
<form action="student/saveUser" method="post">
    学生姓名：<input type="text" name="name"><br>
    用户年龄：<input type="text" name="age"><br>
    用户生日：<input type="text" name="date"><br>
    <input type="submit" value="提交">
</form>

<hr>


<h3>传统文件上传，未解决</h3>
<form action="student/fileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传">
</form>

<hr>

<h3>Springmvc文件上传，未解决</h3>
<form action="student/fileupload2" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传">
</form>


<hr>

<%--<h3>跨服务器的文件上传</h3>--%>
<%--<form action="user/fileupload3" method="post" enctype="multipart/form-data">--%>
<%--    选择文件：<input type="file" name="upload"/><br/>--%>
<%--    <input type="submit" value="上传文件"/>--%>
<%--</form>--%>

</body>
</html>