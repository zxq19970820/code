package com.zxq.controller;

import com.zxq.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 18:52
 * 4
 */
@Controller
public class AnnoTestController {

    //    @RequestParam注解的参数在URI中必须存在，否则报错
//    如果参数是可选的，需要@RequestParam(name="id",required=false)
//    在@RequestParam中还可以设置默认值
//    如果在地址栏输入http://localhost:8080/HelloSpringMVC/hello,
    // 没有输入username参数，就会为name赋值默认值xxxxx。
    @RequestMapping("/requestParamTest")
    public String requestParamTest(@RequestParam(name = "username",
                                        defaultValue = "xxxx") String name) {
        System.out.println(name);
        return "loginSuccess";
    }

    @ModelAttribute
    public void showModel(User user) {
        System.out.println("执行了 showModel 方法" + user.getUsername());
    }

    @RequestMapping(path = "/testmodelAttribute", method = RequestMethod.GET)
    public String testModelAttribute(User user) {
        System.out.println("执行了控制器的方法" + user.getUsername());
        return "loginSuccess";
    }


//    转发
    @RequestMapping("/testForward")
    public String testForward() {
        System.out.println("AccountController 的 testForward 方法执行了。。。。");
        return "forward:/view/hello.jsp";
    }
//    需要注意的是，如果用了 formward：则路径必须写成实际视图 url，不能写逻辑视图。
//    它相当于“request.getRequestDispatcher("url").forward(request,response)”。使用请求
//    转发，既可以转发到 jsp，也可以转发到其他的控制器方法。



    /**
     * 重定向
     * @return
     */
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("AccountController 的 testRedirect 方法执行了。。。。");
        return "redirect:testReturnModelAndView";
    }
    //    contrller 方法提供了一个 String 类型返回值之后，它需要在返回值里使用:redirect:
//    它相当于“response.sendRedirect(url)”。需要注意的是，如果是重定向到 jsp 页面，则 jsp 页面不
//    能写在 WEB-INF 目录中，否则无法找到。


}
