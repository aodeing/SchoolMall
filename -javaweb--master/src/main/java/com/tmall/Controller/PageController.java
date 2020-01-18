package com.tmall.Controller;

import com.tmall.pojo.Admin;
import com.tmall.pojo.User;
import com.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class PageController {
    @Autowired
    UserService userService;
    @RequestMapping("registerPage")
    public String registerPage(){
        return "fore/register";
    }
    @RequestMapping("registerSuccessPage")
    public String registerSuccessPage() {
        return "fore/registerSuccess";
    }
    @RequestMapping("loginPage")
    public String loginPage() {
        return "fore/login";
    }
    @RequestMapping("forealipay")
    public String alipay(){
        return "fore/alipay";
    }
    @RequestMapping("loginadmin")
    public String loginAdmin(){return "admin/login";}

    @RequestMapping("adlogin")
    public String login01(@RequestParam("name") String name, @RequestParam("password") String password, Model model, HttpSession session) {
        name = HtmlUtils.htmlEscape(name);
        Admin ad = new Admin();
        ad.setName(name);
        ad.setPassword(password);
        if(name.equals("samkin")&&password.equals("abc")){

            session.setAttribute("Admin", ad);
            return "redirect:admin_category_list";
            }

        model.addAttribute("msg", "账号密码错误"+name+password);
        return "admin/login";



    }
}
