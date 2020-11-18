<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/4
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>

    <%
        for(int i=0;i<10;i++){
    %>

    <li><%=i%></li>

    <%
        }
    %>

    <%!
        public void method(){
            System.out.println("这是方法");
        }

        public void method1(){
            System.out.println("这是方法1");
        }
    %>

    <%!
        public void jspInit(){
            System.out.println("这是初始化方法");
        }

        public void jspDestroy(){
            System.out.println("这是销毁方法");
        }

//        public  void jspService(){
//            System.out.println("凑数的");
//        }

    %>

    <%
        System.out.println("这是服务方法");
    %>

</ul>

</body>
</html>
