package com.tmall.Controller;

import com.tmall.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestController {

    @CrossOrigin(origins="*",maxAge=3600)
    @RequestMapping(value="/user/uid}",method= RequestMethod.GET)
    public @ResponseBody
    User getPerson(@PathVariable int personID) {
        User p = new User();
        p.setName("Eric");
        p.setId(personID);
        p.setPassword("123");
        return p;
    }

}
