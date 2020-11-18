<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/3
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="test.User_copy" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.lang.reflect.Array" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    ArrayList<User_copy> users=new ArrayList<>();
    User_copy u1=new User_copy(1,"张三","123",23);
    User_copy u2=new User_copy(1,"李四","567",22);
    User_copy u3=new User_copy(1,"王五","111",26);
    User_copy u4=new User_copy(1,"赵六","222",20);

    users.add(u2);
    users.add(u2);
    users.add(u3);
    users.add(u4);


    request.setAttribute("message", users);
    request.getRequestDispatcher("User.jsp").forward(request,response);

%>


</body>
</html>
