<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/14
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>


</head>
<body>

<form method="post" action="#" id="form">
    <%--    <input type="hidden" name="_method" value="PUT">--%>
    <input type="text" name="username" id="username"><br>
    <input type="password" name="password" id="password"> <br>
    <input type="button" value="登录" onclick="btnClick()">
</form>

<div id="usernameDiv"></div>
<div id="passwordDiv"></div>
<script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.min.js"></script>



<script>
    function btnClick() {
        //获取username和password的值
        var username=$("#username").val().trim();
        var password=$("#password").val().trim();



        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/login6",      //提交的服务端的路径
            data:$("#form").serialize(),
            dataType:"json",        //服务端返回的数据的类型,text:文本类型  json：json类型
            // contentType:"application/json;charset=UTF-8",
            success : function(data){        //请求成功以后的回调
                // alert(data.login);
                alert(data.username);
                document.getElementById("usernameDiv").innerHTML="<h1>"+data.username+"</h1>"
                $("#passwordDiv").text(data.password);

            },
            error:function(){
                alert("异常，请检查");
            }

        })
    }
</script>

</body>
</html>

