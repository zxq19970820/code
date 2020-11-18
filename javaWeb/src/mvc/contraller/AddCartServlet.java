package mvc.contraller;


import mvc.biz.impl.CartBizImpl;
import mvc.biz.impl.productBizImpl;
import mvc.pojo.Cart;
import mvc.pojo.Product;
import mvc.pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user/AddCartServlet")
public class AddCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //用户信息是存储在session中
        //session中用户登录时存在
        //如何保证session中有用户
        //必须保证经过登录步骤


        //id pid user  num  total

        //如何获取用户信息
        Users user = (Users) request.getSession().getAttribute("user");

        //获取商品信息
        //先获取商品id
        int pid = Integer.parseInt(request.getParameter("pid"));

        //根据id去业务层查询
        Product p = new productBizImpl().getById(pid);

        //创建购物车对象
        Cart cart = new Cart(1, 1, p, user);

        //调用购物车的业务类
        CartBizImpl biz = new CartBizImpl();

        if (biz.add(cart)) {
            response.getWriter().print("<script>\n" +
                    "         alert(\"添加成功\");\n" +
                    "         window.location.href=\"/javaWeb_war_exploded/templates/index.jsp\"\n" +
                    "     </script>");


        } else {
            response.getWriter().print("<script>\n" +
                    "         alert(\"添加失败\");\n" +
                    "         window.location.href=\"/javaWeb_war_exploded/templates/index.jsp\"\n" +
                    "     </script>");
        }

//        response.sendRedirect("/untitled_war_exploded/classtest/3.11/index.jsp");


///classtest/3.11/Cart.jsp

//        response.getWriter().print("addcart");


    }
}
