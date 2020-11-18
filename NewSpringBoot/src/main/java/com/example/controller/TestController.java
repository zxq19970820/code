package com.example.controller;


import com.example.pojo.Account;
import com.example.pojo.Staff;
import com.example.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private List<Account> accountList;

    @Autowired
    private StaffService staffService;

    //@RequestMapping( value = "log" ,method = RequestMethod.GET)
    @GetMapping("log")
    public String login() {
        return "login";

    }


    @PostMapping("log")
    public String login2(String uid, String pwd, ModelMap map, HttpSession session) {
        String rtn = "login";

        String str = uid + "..." + pwd;
        Object obj = session.getAttribute("current");
//        session.removeAttribute("current");
        if (obj != null) {
            Account account = (Account) obj;
            str = account.getNick();
            if (account.getRid() == "1") {
                rtn = "welcome";

                List<Staff> listAll = staffService.getAll();
                map.addAttribute("account", listAll);

            } else {
                rtn = "c";

                Staff staff = staffService.getById(uid);
                map.addAttribute("account",staff);
            }
        }

//        System.out.println("controller中测试是否获取的session数据"+obj);

        map.addAttribute("guest", str);

        return rtn;
    }


    @RequestMapping("tuichu")
    public String TuiChu(HttpSession session) {
        session.removeAttribute("current");
        return "login";
    }


    @RequestMapping("aaa")
    @ResponseBody
    public String query01() {
        return "Welcome Mark";
    }


}
























