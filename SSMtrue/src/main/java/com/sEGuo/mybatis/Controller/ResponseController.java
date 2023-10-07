package com.sEGuo.mybatis.Controller;

import com.sEGuo.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller

public class ResponseController {
    @Autowired

    @RequestMapping("/response")
    String response(){
        return "/response.jsp";
    }
    @RequestMapping("/response/text")
    @ResponseBody
    String responseText(){
        return "responseText";
    }
    @RequestMapping("/response/json")
    @ResponseBody
    List<User> responseJson(){
        User user1 = new User(1,"asd");
        User user2 = new User(2,"adsa");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
    @RequestMapping("/response/user")
    @ResponseBody
    User responseJson1(){
        User use2r = new User(1,"asd");
        return use2r;
    }
    @RequestMapping(path="request/mapping-method-get",method = RequestMethod.GET)
    @ResponseBody
   String mappingMethodGet(String method){
        return "Method=" + method;
    }
    @GetMapping(path="request/get-mapping")
    @ResponseBody
   String getMapping(String method){
        return "Method=" + method;
    }
}
