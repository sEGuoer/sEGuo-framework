package com.seguoer.controller;

import com.seguoer.method.R;
import com.seguoer.po.Blog;
import com.seguoer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    UserService userService;

    @GetMapping
    R index(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "2")int perpage) {
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

    @GetMapping("/{id}")
    R show(@PathVariable String id) {
        if (userService.selectBlogs(id) != null){
            return R.ok(userService.selectBlogs(id).get(0));
        }else {
            return null;
        }

    }
}