package com.seguo.mybatis.controller;

import com.seguo.mybatis.method.R;
import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
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
    R index(@RequestParam(defaultValue = "0")int page, @RequestParam(defaultValue = "0")int perpage) {
        if (page == 0 && perpage == 0){
            return R.ok(userService.selectAllBlog());
        }else {
            return R.ok(userService.selectBlogByPage(page,perpage));
        }
    }
    @PostMapping
    R store(Blog blog) {
        return R.ok(userService.addNewBlog(blog));
    }

    @DeleteMapping("/{id}")
    R destory(@PathVariable String id) {
        return R.ok(userService.deleteBlogByID(id));
    }
}
