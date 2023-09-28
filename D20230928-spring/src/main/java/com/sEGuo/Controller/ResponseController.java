package com.sEGuo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ResponseController {
    @RequestMapping("/response")
    String response(){
        return "/response.jsp";
    }
}
