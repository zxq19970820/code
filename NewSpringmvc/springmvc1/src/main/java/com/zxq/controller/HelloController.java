package com.zxq.controller;

import com.alibaba.fastjson.JSONObject;
import com.zxq.pojo.Student;
import com.zxq.pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 18:12
 * 4
 */
@Controller
@SessionAttributes("account")//将model中account键值对的结果存入session
public class HelloController {


    //params表示参数中必须有name
    @RequestMapping(value = "/hello" ,method = {RequestMethod.GET},params = "name")
    public String sayHello(String name, Model model,HttpServletRequest httpServletRequest) {


        System.out.println("name=" + name);

//        底层存储到request域中
        model.addAttribute("name", name);

        return "hello";
    }


//直接进行响应
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.getRequestDispatcher("/view/login.jsp").forward(request,response);
//        System.out.println("转发成功");

//        response.sendRedirect(request.getContextPath()+"/view/login.jsp");
//        System.out.println("重定向成功");


//        防止中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
//        直接进行响应
        response.getWriter().print("你好");

        return;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
//        创建modelAndView对象
        ModelAndView mv=new ModelAndView();

        Student student=new Student("zhangsan",20,new Date());
        mv.addObject("user",student);
        mv.setViewName("loginSuccess");
        return mv;
    }


    //     restful风格
    @GetMapping("test/{name}/{password}")
    public String test(@PathVariable("name") String username,
                       @PathVariable("password") String password) {

        System.out.println(username + "...." + password);

        return "loginSuccess";

    }



    @GetMapping("/login")
    public String toLogin() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody  //结果以响应体的形式返回，就不是视图的名称,ajax请求的结果，不走视图解析器，要是就是内容
    public String login1(@RequestBody String username, String password) {

        System.out.println(username + "...." + password);

        return "{\"login\" : \"success\"}";

    }

    //    @RequestBody表示  接收前端向后端传Jason格式数据
    @PostMapping(value = "/login2", consumes = {"application/json"})
    @ResponseBody
    //如果前端提交contentType=application/json,通过@RequestBody获取一个字符串username=jack&password=123
    public String login(@RequestBody String user) {
        System.out.println(user);
        //自己解析
        String[] split = user.split("&");
        String username = split[0].split("=")[1];
        String password = split[1].split("=")[1];
        System.out.println(username + "---" + password);
        //服务端向客户端返回json
        //1.返回值类型是String,创建json对象，然后把json对象转成字符串返回（拼接json很麻烦，fastJson）
        //2.返回值的类型就是结果，比如，User，List<User>,自动将返回的结果转成json数据，导入jackson的包即可
        return "{\"login\" : \"success\"}";
    }


    //    返回user对象
//    produces：服务端发送给客户端的数据的类型。
    @PostMapping("/login3")
    @ResponseBody
    public User login(User user) {
        System.out.println(user);
        return user;
    }

    //    返回user对象
    //produces：服务端发送给客户端的数据的类型。
    @PostMapping(value = "/login4", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public User login(String username, String password) {
        System.out.println(username + "---" + password);
        //创建user对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }


    //    通过fastjson创建json对象返回字符串结果
    @PostMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public String test2() {


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("login", "success");

        return jsonObject.toJSONString();

    }


    @PostMapping("/login5")
    @ResponseBody
    public User loginTest(@RequestBody String user) throws UnsupportedEncodingException {
        System.out.println(user);
        String[] split = user.split("&");
        String username = split[0].split("=")[1];//%E8%82%89%E4%B8%9D,username通过utf-8编码以后的结果
        String password = split[1].split("=")[1];//1223
        System.out.println(username + "---" + password);
        username = URLDecoder.decode(username, "UTF-8");//解码
        //返回登录的结果
        return new User(username, password);
    }

    @PostMapping("/login6")
    public ResponseEntity<User> login6(User user) {

        System.out.println(user);
        try {
//            throw new RuntimeException();
            return ResponseEntity.status(HttpStatus.OK).body(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }
}
