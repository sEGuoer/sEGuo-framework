package com.sEGuo.Controller;

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
}
