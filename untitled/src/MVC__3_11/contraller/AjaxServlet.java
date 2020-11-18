package MVC__3_11.contraller;

import MVC__3_11.biz.impl.CartBizImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.
        response.setContentType("text/html;charset=UTF-8");

        //取
        int cid = Integer.parseInt(request.getParameter("cid"));
        int count = Integer.parseInt(request.getParameter("count"));

//        response.getWriter().print("ajax返回数据："+cid);

        //调用
        CartBizImpl biz = new CartBizImpl();

        if (biz.updataNum(cid, count)) {
            response.getWriter().print(true);

        } else {
            response.getWriter().print(false);
        }


        //输出


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
