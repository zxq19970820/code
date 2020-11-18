package MVC__3_11.contraller;

import MVC__3_11.biz.UsersBiz;
import MVC__3_11.biz.impl.UsersBizImpl;
import MVC__3_11.pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServletMvc",urlPatterns = "/Login")
public class LoginServletMvc extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //获取请求信息
        String name= request.getParameter("uname");
        String pwd=request.getParameter("pwd");

        //调用biz
        UsersBiz ub=new UsersBizImpl();
        Users users=ub.login(name,pwd);

        //跳转
        if (users!=null){

            request.getSession().setAttribute("user",users);
            request.getSession().setAttribute("msg","登录成功");
            response.sendRedirect("/untitled_war_exploded/classtest/3.11/index.jsp");

        }else {
            request.getSession().setAttribute("msg","用户名或密码错误");
            response.sendRedirect("/untitled_war_exploded/classtest/3.11/dengLu.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
