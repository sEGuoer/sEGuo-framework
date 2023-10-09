package com.seguo.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/HelloSpringWebMvc")
    @ResponseBody
    public String helloSpringWebMvc(){
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
}
