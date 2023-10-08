package com.seguo.mybatis.controller;

import com.seguo.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import com.seguo.mybatis.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UserService userService;

    @GetMapping
    @ResponseBody
    List<User> index() throws IOException {
        return userService.selectUsersByName("%");
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
