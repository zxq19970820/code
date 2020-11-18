//package csi.servlet;
//
//import com.sun.org.apache.bcel.internal.classfile.Code;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class xmlServlet  extends HttpServlet {
//private String Code;
//    @Override
//    public void init() throws ServletException {
//        super.init();
//        Code=getInitParameter("code");
//        System.out.println(Code);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      String str=getServletContext().getInitParameter("text");
//
//        resp.getWriter().print("<a href='http://www.baidu.com'>百度搜索</a>");
//        resp.getWriter().print(str);
//    }
//}
