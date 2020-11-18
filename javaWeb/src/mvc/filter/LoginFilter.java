package mvc.filter;

import mvc.pojo.Users;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter", urlPatterns = "/user/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;


        Users u = (Users) request.getSession().getAttribute("user");

        if (u != null) {
            chain.doFilter(req, resp);
        } else {
            request.getRequestDispatcher("/templates/dengLu.jsp").forward(request, resp);
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
