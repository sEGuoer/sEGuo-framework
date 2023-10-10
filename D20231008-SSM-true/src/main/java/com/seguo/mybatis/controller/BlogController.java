package com.seguo.mybatis.controller;

import com.seguo.mybatis.method.CommonResponse;
import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    UserService userService;
/*    @RequestMapping(value = "/page/MySQL")
    ModelAndView register() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        String content = userService.selectBlogContent("MySQL");
        modelAndView.addObject("Content",content);
        modelAndView.setViewName("../MySQL.jsp");
        return modelAndView;
    }*/

    @GetMapping
    @ResponseBody
    CommonResponse index(@RequestParam(defaultValue = "0")int page, @RequestParam(defaultValue = "0")int perpage) {
        if (page == 0 && perpage == 0){
            return CommonResponse.ok(userService.selectAllBlog());
        }else {
            return CommonResponse.ok(userService.selectBlogByPage(page,perpage));
        }
    }
    @PostMapping
    @ResponseBody
    CommonResponse store(Blog blog) {
        return CommonResponse.ok(userService.addNewBlog(blog));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    CommonResponse destory(@PathVariable String id) {
        return CommonResponse.ok(userService.deleteBlogByID(id));
    }
}
