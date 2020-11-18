package mvc.contraller;


import mvc.biz.UsersBiz;
import mvc.biz.impl.UsersBizImpl;
import mvc.pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServletMvc", urlPatterns = "/Login")
public class LoginServletMvc extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //获取请求信息
        String name = request.getParameter("uname");
        String pwd = request.getParameter("pwd");

        System.out.println("-------" + name + "----------" + pwd);

        //调用biz
        UsersBiz ub = new UsersBizImpl();
        Users users = ub.login(name, pwd);

        //跳转
        if (users != null) {

            request.getSession().setAttribute("user", users);
            response.sendRedirect("/javaWeb_war_exploded/templates/index.jsp");

        } else {
            request.getSession().setAttribute("msg", "用户名或密码错误");
            response.sendRedirect("/javaWeb_war_exploded/templates/dengLu.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
