package MVC__3_11.contraller;

import MVC__3_11.biz.CartBiz;
import MVC__3_11.biz.impl.CartBizImpl;
import MVC__3_11.pojo.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/AddServlet")
public class AddOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CartBiz cb=new CartBizImpl();

        //获取要提交的购物车对象id的数组
        String[] cids=request.getParameterValues("ck");




        //根据购物车对象添加订单


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
