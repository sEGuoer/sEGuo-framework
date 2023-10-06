package com.sEGuo.mybatis.Controller;

import com.sEGuo.mybatis.Service.UserService;
import com.sEGuo.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


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
    String pojoBodyParam(@RequestBody User user){
        return ("UserController.pojoBodyParam " + user.toString());
    }
    @RequestMapping("/User/date-time-format")
    @ResponseBody
    String dateTimeFormat(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDay){
        return ("UserController.dateTimeFormat " + dateDay.toString());
    }
}
