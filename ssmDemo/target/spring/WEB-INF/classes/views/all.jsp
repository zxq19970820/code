<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/4/15
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入EL表达式  prefix:前缀别名  url:表示引入el表达式资源--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            margin: auto
        }

        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>

<body>

${products}


<table cellspacing="0">
    <tr>
        <th>id</th>
        <th>pname</th>
        <th>pprice</th>
        <th>pinventory</th>
        <th>picon</th>
        <th>plocation</th>
        <th>pviews</th>
        <th>pstate</th>
        <th>操作</th>

    </tr>

    <%--   显示所有查询数据，数据一共有几行不确定--%>

    <c:forEach var="p" items="${products}">
        <tr>
            <td>${p.id}</td>
            <td>${p.pname}</td>
            <td>${p.pprice}</td>
            <td>${p.pinventory}</td>
            <td>${p.picon}</td>
            <td>${p.plocation}</td>
            <td>${p.pviews}</td>
            <td>${p.state}</td>
            <td>
                <a href="../product/removeProduct?id=${p.id}">
                    <button>删除</button>
                </a>
                <a href="../product/findById?id=${p.id}">
                    <button>编辑</button>
                </a>
            </td>
        </tr>


    </c:forEach>
</table>

</body>
</html>
