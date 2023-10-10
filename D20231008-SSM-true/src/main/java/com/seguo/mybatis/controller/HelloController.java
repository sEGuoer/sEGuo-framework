package com.seguo.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/HelloSpringWebMvc/i")
    @ResponseBody
    public String helloSpringWebMvcI(){
        System.out.println("HelloController.helloSpringWebMvcI");
        return "helloSpringWebMvc";
    }
    @RequestMapping("/HelloSpringWebMvc/j")
    @ResponseBody
    public String helloSpringWebMvcJ(){
        System.out.println("HelloController.helloSpringWebMvcJ");
        return "helloSpringWebMvc";
    }
    @RequestMapping("/forward")
    public String forward(){
        return "forward:" + "/HelloSpringWebMvc";
    }
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:" + "/HelloSpringWebMvc";
    }
    @RequestMapping("/page-show")
    public String pageShow(){
        return "page";
    }
}
