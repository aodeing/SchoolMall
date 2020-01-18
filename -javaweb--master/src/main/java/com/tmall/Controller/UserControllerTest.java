package com.tmall.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmall.pojo.User;
import com.tmall.service.UserService;
import com.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller

@RequestMapping("")
public class UserControllerTest {
    @Autowired
    UserService userService;
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "usertest/{id}",method = RequestMethod.GET)
    public @ResponseBody User getUser(@PathVariable("id") int uid){
        User user = new User();
        user.setName("dd");
        user.setPassword("123");
        user.setId(uid);
        return user;
    }
}
