package com.sEGuo.mybatis.Controller;

import com.sEGuo.mybatis.Service.UserService;
import com.sEGuo.mybatis.mapper.UserMapper;
import com.sEGuo.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/Users")
public class UsersController {
    @Autowired
    UserService userService;

    @GetMapping
    @ResponseBody
    List<User> index() throws IOException {
        return userService.selectUsersByName("x");
    }

    @PostMapping
    @ResponseBody
    User add(@RequestBody User user) {
        userService.addNewUser(user);
        return user;
    }

    @GetMapping("/{id}")
    @ResponseBody
    String show(@PathVariable String id) {
        return id;
    }
}
