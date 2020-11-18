package MVC__3_11.contraller;

import MVC__3_11.biz.CartBiz;
import MVC__3_11.biz.impl.CartBizImpl;
import MVC__3_11.pojo.Cart;
import MVC__3_11.pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/user/toCart")
public class ToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
//        response.getWriter().print("cat");

        //获取购物车内容

        //先获取登录人信息
        Users u = (Users) request.getSession().getAttribute("user");

        //获取该用户的购物车信息
        CartBizImpl biz = new CartBizImpl();

        List<Cart> list = biz.getByUser(u.getUserId());

        request.setAttribute("carts",list);

        request.getRequestDispatcher("/classtest/3.11/cart1.jsp").forward(request,response);


    }


}
