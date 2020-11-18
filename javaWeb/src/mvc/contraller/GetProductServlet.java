package mvc.contraller;


import mvc.biz.impl.productBizImpl;
import mvc.biz.productBiz;
import mvc.pojo.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetProductServlet", urlPatterns = "/GetProductServlet")
public class GetProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //取  取请求参数
        int pid = Integer.parseInt(request.getParameter("pid"));

        //调  调用biz
        productBiz biz = new productBizImpl();
        Product p = biz.getById(pid);

        //转  转发重定向
        //转之前先转存
        request.setAttribute("pro", p);
        request.getRequestDispatcher("/templates/productinfo.jsp").forward(request, response);

    }
}
