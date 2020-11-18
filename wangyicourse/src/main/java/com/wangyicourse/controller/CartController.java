package com.wangyicourse.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wangyicourse.entity.Cart;
import com.wangyicourse.entity.CartDetails;
import com.wangyicourse.service.CartDetailsService;
import com.wangyicourse.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;

    @Autowired
    CartDetailsService cartDetailsService;

    @RequestMapping("/findCart")
    @ResponseBody
    @CrossOrigin(value = "*")
    public Cart find(int userid) {
        System.out.println("findCart:userid" + userid);
        Cart cart = cartService.findCartByUserId(userid);
        System.out.println(cart);
        if (cart == null) {
            Cart cartErr = new Cart();
            cartErr.setId(404);
            return cartErr;
        } else {
            return cart;
        }

    }

    @RequestMapping(value = "/delcartd", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin(value = "*")
    public String deleteCartDetails(@RequestParam("cdid") int cdid) {

        boolean a = cartDetailsService.deleteByCartId(cdid);
        if (a) {
            return "删除成功";
        } else {
            return "删除失败";
        }

    }

    //一次性添加多个
    @RequestMapping(value = "/add")
    @CrossOrigin(value = "*")
    @ResponseBody
    public String addCart(@RequestBody JSONObject jsonObject) {
        JSONArray jsonArray = jsonObject.getJSONArray("coursesid");
        int userid = jsonObject.getInteger("userid");
        //userid cuowu
        System.out.println("userid" + userid);
        Cart cart = cartService.findCartIdByUserId(userid);
        int cid = cart.getId();
        for (int i = 0; i < jsonArray.size(); i++) {
            Integer courseid = (Integer) jsonArray.get(i);

            CartDetails cartDetails = new CartDetails();
            cartDetails.setCartid(cid);
            cartDetails.setCourseid(courseid);
            cartDetailsService.addCartDetails(cartDetails);
        }
        return "";
    }

    //新增  一次添加一个
    //一次性添加多个
    @RequestMapping(value = "/addOne")
    @CrossOrigin(value = "*")
    @ResponseBody
    public String addOneCart(int userid, int courseid) {


        System.out.println("findOne:" + userid);
        Cart cart = cartService.findCartIdByUserId(userid);
        int cid = cart.getId();
        if (cartDetailsService.selectByCartIdAndCourseId(cid, courseid).size() != 0) {
            return "已存在";
        }

        CartDetails cartDetails = new CartDetails();
        cartDetails.setCartid(cid);
        cartDetails.setCourseid(courseid);
        if (cartDetailsService.addCartDetails(cartDetails)) {
            return "添加成功";
        }

        return "添加失败";
    }

}
