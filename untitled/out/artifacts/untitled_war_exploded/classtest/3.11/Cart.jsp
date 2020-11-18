<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/16
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>

    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
    <script type="text/javascript">

        $(function () {
            $("#all").click(function () {

                // var a = document.getElementById("all");

                // var a = $("#id").val();
                let a = $("input[name=tt]").val();


                //获取全选按钮的状态
                var state = a.checked;
                //获取要控制的复选框
                var cks = document.getElementsByName("ck");
                //循环改变复选框的值
                for (var i = 0; i < cks.length; i++) {
                    cks[i].checked = state;
                }
                orderPrice();
            })
            $("input[name=ck]").click(function () {
                //获取全选按钮
                var a = document.getElementById("all");
                //获取所有选择按钮
                var cks = document.getElementsByName("ck");

                //默认全选按钮的状态是选中状态
                var state = true;
                //遍历每个复选框当前的状态
                for (var i = 0; i < cks.length; i++) {
                    //如果有一个未选中，全选按钮的变为未选中状态
                    if (!cks[i].checked) {
                        state = false;
                        break;
                    }
                }
                //这是全选按钮的状态
                a.checked = state;
                orderPrice();
            })
            //加数量
            $(".plush").click(function () {
                var v = $(this).next().val();

                //修改后的数量
                v++;
                $(this).next().val(v);
                var p = $(this).parent().prev().find("span").text() * v;
                $(this).parent().next

                ().find("span").text(p)
                orderPrice();

                //获取当前购物车对象的id (从button上获取)
                alert(${this}.attr("data-cid");
                ///AjaxServlet
                //异步请求ajax
                //$.post（请求路径，请求参数，回调函数）
                $.post("AjaxServlet",
                    {
                        cid: cid,
                        count: v
                    },
                    function (data) {
                        if (data) {
                            alert("成功")
                        }
                        alert("失败")
                    }
                )

            })

            $(".cut").click(function () {
                var v = $(this).prev().val();
                v--;
                if (v == 0) {
                    v = 1
                }
                $(this).prev().val(v);
                var p = $(this).parent().prev().find("span").text() * v;
                $(this).parent().next().find("span").text(p)
                orderPrice();
            })


            function orderPrice() {
                var total = 0;
                //获取所有商品（获取所有复选框）
                var cks = document.getElementsByName("ck");
                //循环遍历复选框状态
                for (var i = 0; i < cks.length; i++) {
                    //如果是选中状态，将当前商品的总价累积到订单总价中
                    if (cks[i].checked) {
                        var ptotal = cks[i].parentNode.parentNode.getElementsByTagName("span")[1].innerText;
                        total += parseInt(ptotal);
                        //将总价格显示到页面中
                    }
                }
                document.getElementById("tt").innerText = total;
            }
        })
    </script>
</head>
<body>
<form action="#" method="post">
    <table width="1000px" border="1">
        <tr>
            <td>全选<input type="checkbox"  name="tt" id="all"/></td>
            <td>图片</td>
            <td>商品名称</td>
            <td>单价</td>
            <td>数量</td>
            <td>总价</td>
        </tr>
        ${carts}


        <c:forEach items="${carts}" var="cart">
            <tr>
                <td><input type="checkbox" name="ck" value="${cart.cid}"/></td>

                <td><img src="${cart.product.image}" width="100px"/></td>
                <td><img src="/untitled_war_exploded/classtest/3.11/${cart.product.pname}"></td>
                <td><span>${cart.product.price}</span>元</td>
                <td>
                    <button type="button" class="plush" data-cid="${cart.cid}" style="width: 20px;text-align: center;">
                        +
                    </button>
                    <input type="text" value="${cart.num}" size="1" readonly/>
                    <button type="button" class="cut" data-cid="${cart.cid}" style="width: 20px;text-align: center;">-
                    </button>
                </td>
                <td><span>${cart.total}</span>元</td>
            </tr>
        </c:forEach>

        <tr align="right">
            <td colspan="5">总金额：</td>
            <td>
                <span id="tt">0</span>元
                <input type="hidden" id="op" name="ttp"/>
            </td>
        </tr>
        <tr align="right">
            <td colspan="5"></td>
            <td><input type="submit" 提交订单></td>
        </tr>
    </table>
</form>
</body>
</html>
