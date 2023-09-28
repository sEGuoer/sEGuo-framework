package com.sEGuo.Controller;

import com.sEGuo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/User/register")
    @ResponseBody
    String register(){
        userService.add();
        return "UserController.register";
    }
    @RequestMapping("/User/no-param")
    @ResponseBody
    String noParam(String name ,String id){
        userService.add();
        return ("UserController.noParam name=" + name +" id= " + id);
    }
}
