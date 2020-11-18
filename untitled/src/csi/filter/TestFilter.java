package csi.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "TestFilter",urlPatterns = "/test.do")//url是过滤的目标,不是访问路径

public class TestFilter implements Filter {
    public void destroy() {
        System.out.println("销毁");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("执行目标功能之前的操作");

        //放行关卡
        chain.doFilter(req, resp);
        System.out.println("执行目标功能之后的操作");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("初始化-----filter");
    }

}
