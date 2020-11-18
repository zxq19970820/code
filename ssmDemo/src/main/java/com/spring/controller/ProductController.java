package com.spring.controller;


import com.spring.entity.Product;
import com.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")   //表示访问productController需要通过地址来访问

public class ProductController {

    //定义方法的请求地址：使用注解@RequestMapping(地址)修饰方法，类
    // http://localhost:8080/上下文路径/product
    // http://localhost:8080/上下文路径/请求url2


    @Autowired
    private ProductService productService;


    //    用户查看所有产品
    //    方法请求地址：  /product/all  响应all.jsp
    @RequestMapping("/all")
    public String getAllProduct() {
        List<Product> allProducts = productService.getAllProducts();
        for (Product product : allProducts) {
            System.out.println(product);
        }

        //视图解析
        return "all";   //拼接和组装   /views/all.jsp


    }


    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        List<Product> allProducts = productService.getAllProducts();
        for (Product product : allProducts) {
            System.out.println(product);
        }

//        创建一个modelAndView对象用于进行返回
        ModelAndView mav = new ModelAndView();

        //设置返回controller之后跳转的界面
        mav.setViewName("all");//设置视图解析器要解析的名称

        //利用ModelAndView对象，存储将要在界面显示的数据
        //addObject(a,b)  参数a：表示的是标识，用于在界面获取数据
        mav.addObject("products", allProducts);//经历过这一步，信息存储在响应内容

        return mav;
    }

    @RequestMapping("/findAllTwo")
    public String findAllTwo(Model model) {

        List<Product> allProducts = productService.getAllProducts();
        System.out.println(allProducts);
        model.addAttribute("products", allProducts);

        //调用model添加请求属性方法
        /*
          .addAttribute(a,b)
          a是标识，b是存储的数据
          */
        return ("all");
    }

    @RequestMapping("/findAllThree")
    public String findAllThree(Map<String, Object> map) {    //map集合中key：表示之前的标识，value就是我们要传输的数据
        List<Product> allProducts = productService.getAllProducts();
        System.out.println(allProducts);
        //直接利用map存储数据就可以
        map.put("products", allProducts);
        return ("all");
    }


    //用于接收jsp传输的数据
    @RequestMapping("/getInfo")
    public String getInfo(String username, String password) {
        System.out.println("接收的数据是：" + username + "-----------" + password);
        return ("showMessage");

    }

    //跳转到添加页面
    @RequestMapping("/addProduct")
    public String addProduct(Product product, Map<String, String> map) {
        System.out.println(product);
        //调用业务层代码进行数据库的添加操作，返回添加的结果
        String result = productService.addProduct(product);
//        设置信息，能让用户在界面了解是否添加成功
        map.put("message", result);
        return ("showMessage");
    }


    @RequestMapping("removeProduct")
    public String removeProduct(Integer id, Map<String, String> map) {
        System.out.println("接收的删除id是：" + id);
        //调一下删除的方法
        String result = productService.deleteById(id);
        map.put("message", result);
        return "showMessage";
    }

    //创建一个格局id查询的方法
    @RequestMapping("/findById")
    public String findById(Integer id, Map<String, Object> map) {
        Product product = productService.selectById(id);
        //将这个产品放到map集合用于传递到jsp界面
        map.put("product", product);
        return "update";
    }


    //创建一个修改产品的方法
    @RequestMapping("/updateProduct")
    public String updateProduct(Product product, Map<String, String> map) {
        System.out.println(product);
        //调用service修改方法
        String result = productService.changeProduct(product);
        map.put("message", result);
        return "showMessage";
    }


    @RequestMapping("/selectByName")
    public String getProducts(String name) {

        List<Product> products = productService.getProducts(name);
        for (Product product : products) {
            System.out.println(product);
        }
        return "ByName";
    }

    @RequestMapping("/deleteById")
    public String deleteById(int id) {
        id = 1;
        productService.deleteById(id);
        System.out.println("删除成功");
        return "deleteById";
    }


    @RequestMapping("/deleteByList")
    public String deleteByList(List<Integer> list) {
        list.add(1);
        productService.deleteByList(list);
        System.out.println("删除成功");
        return "deleteByIdList";
    }


    @RequestMapping("/updateNumStateById")
    public String updateNumStateById(Product product, int id) {
        productService.updateNumStateById(product, id);
        System.out.println("更新成功");
        return "updateNumStateById";
    }


    @RequestMapping("/insertProduct")
    public String insertProduct(Product product) {
        productService.insertProduct(product);
        System.out.println("新增成功");
        return "insertProduct";
    }

}
