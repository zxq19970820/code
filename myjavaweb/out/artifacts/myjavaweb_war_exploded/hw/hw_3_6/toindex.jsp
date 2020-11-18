<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="javax.xml.transform.Result" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.List" %>
<%@ page import="testdemo.product" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/6
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //加载驱动
    Class.forName("com.mysql.jdbc.Driver");

    //获取连接
    Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8","root","root");

    String sql="select * from product";

    //预处理  获取执行对象
    PreparedStatement ps=conn.prepareStatement(sql);

    //执行并接收
    ResultSet rs=ps.executeQuery();

    List<product> list=new ArrayList<>();

    while (rs.next()){
        product p=new product();

        p.setPid(rs.getInt("pid"));
        p.setPname(rs.getString("pname"));
        p.setPic(rs.getString("pic"));
        p.setDetails(rs.getString("details"));
        p.setPrice(rs.getString("price"));
        p.setCount(rs.getInt("count"));

        list.add(p);
    }

    if (rs!=null){
        rs.close();
    }

    if (ps!=null){
        ps.close();
    }

    if (conn!=null){
        conn.close();
    }

    request.setAttribute("products",list);
    request.getRequestDispatcher("index.jsp").forward(request,response);


%>

</body>
</html>
