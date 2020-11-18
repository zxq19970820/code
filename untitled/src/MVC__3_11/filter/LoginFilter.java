package MVC__3_11.filter;

import MVC__3_11.pojo.Users;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",urlPatterns ="/user/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request=(HttpServletRequest) req;


        Users u=(Users)request.getSession().getAttribute("user");

        if (u!=null){
            chain.doFilter(req,resp);
        }else{
            request.getRequestDispatcher("/classtest/3.11/dengLu.jsp").forward(request,resp);
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
