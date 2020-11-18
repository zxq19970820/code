<%@ page import="test.User_copy" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/4
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //获取当前访问量从application对象取
    Integer count =(Integer) application.getAttribute("count");

    if (count==null){
        count=1;

    }
    else {
        //取出当前访问量，累加1
        count++;
    }
    //重新存储count
    application.setAttribute("count",count);


    //解决乱码方式
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");


    String name = (String) request.getParameter("uname");
    String pwd=(String) request.getParameter("pwd");


    if ("张三".equals(name)&&"123".equals(pwd)){

        //将登录信息存到cookie中
        Cookie n= new Cookie("name",name);
        Cookie p= new Cookie("pwd",pwd);

        //设置有效时间  基本单位：秒
        n.setMaxAge(60*60);
        p.setMaxAge(60*60);

        //将cookie添加到相应  存到本地
        response.addCookie(n);
        response.addCookie(p);

        //在验证登录信息时，，将信息封装成对象，
        User_copy u=new User_copy(1,"张三","123",30);


        //将登录用户的对象信息  存储到会话中      response重定向,输入框请求的信息消失,所以用session
        session.setAttribute("user",u);

        //跳转到登录成功界面
        response.sendRedirect("success.jsp");
    }
%>

<%=name%>

<%

    //清除数据
//    application.removeAttribute("count");
%>
<br>
您是第<%=count%>个访问本网站的用户

<a href="index.jsp">返回首页</a>


</body>
</html>
