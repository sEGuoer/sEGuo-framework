package com.sEGuo.Controller;

import com.sEGuo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller

public class ResponseController {
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
        User user1 = new User("1","asd");
        User user2 = new User("2","adsa");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
