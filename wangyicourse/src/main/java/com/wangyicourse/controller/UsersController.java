package com.wangyicourse.controller;



import com.wangyicourse.entity.Cart;
import com.wangyicourse.entity.Users;
import com.wangyicourse.service.CartService;
import com.wangyicourse.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * @author 86186
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;
    @Autowired
    private CartService cartService;
    /**
     * 验证用户信息
     */
    @CrossOrigin(origins = "*")
    @GetMapping("/validate")
    @ResponseBody
    public String validate(String username, String password) {

        System.out.println("前端传的登录用户名为" + username);

        Users users = usersService.validateUser(username, password);
        if (users != null) {
            return Integer.toString(users.getUserid());
        } else {
            return "登录失败";
        }
    }

    //    根据传入的id返回用户名
    @CrossOrigin(origins = "*")
    @RequestMapping("/getname")
    @ResponseBody
    public String getUsername(int id) {

        System.out.println("前端传的登录用户id为" + id);

        String username = usersService.getUserByName(id);



        System.out.println("返回给后端用户名" + username);
        return username;
    }


//@CrossOrigin(origins = "*")
//@GetMapping("/validate")
//@ResponseBody
//public Users validate(String username, String password){
//
//    System.out.println("前端传的登录用户名为"+username);
//
//    Users users = usersService.validateUser(username, password);
//    if(users!=null){
//        return users;
//    }else{
//        return null;
//    }
//}


    @CrossOrigin(origins = "*")
    @RequestMapping("/registerTest")
    @ResponseBody
    public String registerTest(Users user) throws ParseException {

        Date date = new Date();
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String format = sd.format(date);
        System.out.println("format..."+format);
        Date parse = sd.parse(format);
        System.out.println("parse..."+parse);
        user.setTime(parse);

        boolean b = usersService.registerTest(user);
        if (b) {
            List<Users> usersList = usersService.getUserByUsername(user.getUsername());
            Integer userid=usersList.get(0).getUserid();
            Cart cart = new Cart();
            cart.setUserid(userid);
            cartService.insertOneCart(cart);
            return "注册成功";
        } else {
            return "注册失败";
        }
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/getTouXiangById")
    @ResponseBody
    public String getTouXiangById(int id) {
        System.out.println("前端获取头像传来的id为"+id);
        usersService.getTouXiangById(id);
        String b = usersService.getTouXiangById(id);
        return b;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/shezi")
    @ResponseBody
    public void shezhi(Users users)  {


        Integer userid = users.getUserid();
        String username = users.getUsername();
        String sex = users.getSex();
        String introduce = users.getIntroduce();
        String email = users.getEmail();
        String tel = users.getTel();
        String qq = users.getQq();


        System.out.println("前端传来的修改用户属性为"+users+"..");

        usersService.updateUserById(users);
        System.out.println("更新成功");


    }

    @RequestMapping("/selectbyname1")
    public ModelAndView selectByName1(String keys, String timeStart, String timeEnd, Model model) {

        System.out.println("后台接收到的用户名为：" + keys + "时间为。。" + timeStart + ".." + timeEnd);
        ModelAndView mav = new ModelAndView();
        List<Users> users = usersService.selectByName1(keys, timeStart, timeEnd);
        mav.setViewName("/member/member-list");
        model.addAttribute("users1", users);
        return mav;
    }

    @RequestMapping("/selectbyname2")
    public ModelAndView selectByName2(String keys, String timeStart, String timeEnd, Model model) {

        System.out.println("后台接收到的用户名为：" + keys + "时间为。。" + timeStart + ".." + timeEnd);
        ModelAndView mav = new ModelAndView();
        List<Users> users = usersService.selectByName2(keys, timeStart, timeEnd);
        mav.setViewName("/member/member-del");
        model.addAttribute("users2", users);
        return mav;
    }



    @RequestMapping("deletebyid")
    @ResponseBody
    public int deleteById(int id) {
        System.out.println("后台接收到要删除的用户id为：" + id);
        int i = usersService.deleteById(id);
        return i;
    }


    @RequestMapping("huifubyid")
    @ResponseBody
    public int huiFuById(int id) {
        System.out.println("后台接收到要恢复的用户id为：" + id);
        int i = usersService.HuiFuById(id);
        return i;
    }

    @RequestMapping("adduser")
    public String addUser(String username, String password, String tel, String email , Model model) {
        System.out.println("新增用户接受到的信息为" + username + "..." + password + "...." + tel + "..." + email);
        int i = usersService.addUser(username, password, tel, email);

        List<Users> allUserss = usersService.getAllByState("启用");
//        System.out.println(allUserss);
        model.addAttribute("users1", allUserss);
        return "member/member-list";
    }

    @RequestMapping("updateuser")
    public String updateCourse(Users users, Model model) {
        System.out.println("controller接收到的course为："+users);

        usersService.updateUser(users);
        List<Users> all = usersService.getAllByState("启用");
        model.addAttribute("users1", all);
        return "member/member-list";

    }

}
