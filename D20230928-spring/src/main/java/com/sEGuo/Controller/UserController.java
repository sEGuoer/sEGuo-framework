package com.sEGuo.Controller;

import com.sEGuo.Service.UserService;
import com.sEGuo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    String noParam(@RequestParam("name") String username , String id){
        userService.add();
        return ("UserController.noParam name=" + username +" id= " + id);
    }
    @RequestMapping("/User/param-pojo")
    @ResponseBody
    String pojoParam(User user){
        return ("UserController.pojoParam " + user);
    }
    @RequestMapping("/User/param-pojo-body")
    @ResponseBody
    String pojoBodyParam(User user){
        userService.add();
        return ("UserController.pojoBodyParam " + user.toString());
    }
}
