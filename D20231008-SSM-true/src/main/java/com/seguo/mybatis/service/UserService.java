package com.seguo.mybatis.service;

import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.po.User;

import java.io.IOException;
import java.util.List;

public interface UserService {
    String add();
    String selectBlogContent(String title) throws IOException;
    String deleteUsersByID(String id) ;
    String addNewUser(User user) ;
    Blog addNewBlog(Blog blog) ;
    String deleteBlogByID(String id);

    List<User> selectUsersByName(String name);

    String changeUsersByID(String id, String newName) throws IOException;
    public List<Blog> selectAllBlog();
}
