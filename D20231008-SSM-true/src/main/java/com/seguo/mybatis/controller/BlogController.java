package com.seguo.mybatis.controller;

import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/page/MySQL")
    ModelAndView register() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        String content = userService.selectBlogContent("MySQL");
        modelAndView.addObject("Content",content);
        modelAndView.setViewName("../MySQL.jsp");
        return modelAndView;
    }

    @GetMapping
    @ResponseBody
    List<Blog> index() {
        return userService.selectAllBlog();
    }
    @PostMapping
    @ResponseBody
    Blog store(Blog blog) {
        return userService.addNewBlog(blog);
    }
}
