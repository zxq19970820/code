package csi.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "EncoddingFilter")
public class EncoddingFilter implements Filter {
    public void destroy() {
        System.out.println("销毁");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

//        ServletRequest.setCharacterEncoding("UTF-8");

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");//请求
        resp.setContentType("text/html;charset=UTF-8");//响应头

        System.out.println("编码设置完成");

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("初始化");
    }

}
