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
import java.util.List;

@WebServlet(name = "indexServlet", urlPatterns = "/indexServlet")
public class indexServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //超链接   浏览器输入网址   表单method="get"

        //获取商品名字
        String pname = request.getParameter("pname");

        //调用
        productBiz biz = new productBizImpl();

        List<Product> list = null;

        if (pname == null || "".equals(pname)) {
            //如果没有获取到搜索内容，则执行查询所有的方法
            list = biz.getAll();

            System.out.println(list);

        } else {
            //如果有搜索结果，则执行按名字查询商品的方法
            list = biz.getByName(pname);
        }

        //存储数据
        request.setAttribute("list", list);


        //跳转
        request.getRequestDispatcher("/templates/index.jsp").forward(request, response);

    }
}
