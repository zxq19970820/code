<%@ page import="java.sql.Connection" %>
<%@ page import="testdemo.product" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="javax.xml.transform.Result" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/8
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Class.forName("com.mysql.jdbc.Driver");

//    jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8","root","root
    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8", "root", "root");

    String sql = "select * from product";

    PreparedStatement ps = conn.prepareStatement(sql);

    ResultSet rs = ps.executeQuery();

//    while (rs.next()) {
//        out.print(rs.getString("pname"));
//    }


    List<product> list = new ArrayList<>();


    while (rs.next()) {

        product pd = new product();

        pd.setPname(rs.getString("pname"));
        pd.setPid(rs.getInt("pid"));
        pd.setCount(rs.getInt("count"));
        pd.setPrice(rs.getString("price"));
        pd.setDetails(rs.getString("details"));
        pd.setPic(rs.getString("pic"));

        list.add(pd);
    }

//    for (product product : list) {
//
//        out.print(product);
//
//    }

    request.setAttribute("products",list);
    request.getRequestDispatcher("index.jsp").forward(request,response);

%>

</body>
</html>
