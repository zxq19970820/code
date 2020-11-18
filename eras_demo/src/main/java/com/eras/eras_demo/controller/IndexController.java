package com.eras.eras_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/welcome")
    public String toWelcome(){
        return "welcome";
    }


    @RequestMapping("/article-list")
    public String toArticleList(){
        return "article/article-list";
    }


    @RequestMapping("/product-brand")
    public String toProductBrand(){
        return "product/product-brand";
    }
    @RequestMapping("/product-category")
    public String toProductCategory(){
        return "product/product-category";
    }
    @RequestMapping("/product-list")
    public String toProductList(){
        return "product/product-list";
    }


    @RequestMapping("/member-list")
    public String toMemberList(){
        return "member/member-list";
    }

    @RequestMapping("/member-del")
    public String toMemberDel(){
        return "member/member-del";
    }


    @RequestMapping("/admin-role")
    public String toAdminRole(){
        return "admin/admin-role";
    }
    @RequestMapping("/admin-permission")
    public String toAdminPermission(){
        return "admin/admin-permission";
    }
    @RequestMapping("/admin-list")
    public String toAdminList(){
        return "admin/admin-list";
    }

}
