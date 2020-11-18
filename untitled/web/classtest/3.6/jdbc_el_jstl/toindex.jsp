<%@ page import="testdemo.User" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/6
  Time: 16:07
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

    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8", "root", "root");

    String sql = "select * from users";

    //获取执行对象
    PreparedStatement ps = conn.prepareStatement(sql);

    //执行并接受
    ResultSet rs = ps.executeQuery();

//    //测试是否取到了数据
//    while (rs.next()) {
//
//        out.println(rs.getString("username"));
//    }

    //创建一个集合，用来封装表中的数据
    List<User> list = new ArrayList<User>();

    while (rs.next()) {

        User u = new User();

        u.setId(rs.getInt("userid"));
        u.setUsername(rs.getString("username"));
        u.setPassword(rs.getString("password"));
        u.setAddress(rs.getString("address"));
        u.setPhone(rs.getString("phone"));
        u.setBalance(rs.getInt("balance"));

        list.add(u);
    }

    if (rs != null) {
        rs.close();
    }

    if (ps != null) {
        ps.close();
    }

    if (conn != null) {
        conn.close();
    }

//    //测试是否存到集合中了
//    for (User u : list) {
//        out.print(u.getUsername());
//    }

    request.setAttribute("users", list);
    request.getRequestDispatcher("index.jsp").forward(request, response);

%>


</body>
</html>
