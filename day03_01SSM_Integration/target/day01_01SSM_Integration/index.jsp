<%--
  Created by IntelliJ IDEA.
  User: 18378
  Date: 2020/4/17
  Time: 0:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/testFindAll">测试</a>
<h3>测试保存</h3>
<form action="account/testSave" method="post">
    姓名：<input type="text" name="name" /><br>
    金额：<input type="text" name="money"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
